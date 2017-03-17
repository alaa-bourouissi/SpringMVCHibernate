package com.websystique.springmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.websystique.springmvc.configuration.FileValidator;
import com.websystique.springmvc.model.Document;
import com.websystique.springmvc.model.FileBucket;
import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.DocumentService;
import com.websystique.springmvc.service.UserService;

@Controller
@RequestMapping("/document")

public class DocumentController {

	@Autowired
	FileValidator fileValidator;

	@Autowired
	DocumentService documentService;

	@Autowired
	UserService userService;

	
	
	@RequestMapping(value = { "/add-document-{userId}" }, method = RequestMethod.GET)
	public String addDocuments(@PathVariable int userId, ModelMap model) {
		User user = userService.findById(userId);
		model.addAttribute("user", user);

		FileBucket fileModel = new FileBucket();
		model.addAttribute("fileBucket", fileModel);

		List<Document> documents = documentService.findAllDocByUserId(userId);
		model.addAttribute("documents", documents);

		return "document";
	}  
	
	

	@RequestMapping(value={"/download-document-{userId}-{docId}"},method=RequestMethod.GET)
	public String downloadDocument(@PathVariable int userId,@PathVariable int docId,HttpServletResponse response) throws IOException{
		
		Document document = documentService.findDocById(docId);
		response.setContentType(document.getType());
		response.setContentLength(document.getContent().length);
		response.setHeader("Content-Disposition","attachment; filename=\"" + document.getName() +"\"");
		
		FileCopyUtils.copy(document.getContent(), response.getOutputStream()); 
		
		return "redirect:/add-document-"+userId;
	}
	
	public String deleteDocument(@PathVariable int userId,@PathVariable int docId){
		documentService.deleteById(docId);
		return "redirect:/add-document-"+userId;
	
	}
	
	
	
	@RequestMapping(value = { "/add-document-{userId}" }, method = RequestMethod.POST)
	public String uploadDocument(@Valid FileBucket fileBucket, BindingResult result, ModelMap model,
			@PathVariable int userId) throws IOException {

		if (result.hasErrors()) {
			System.out.println("validation errors");
			User user = userService.findById(userId);
			model.addAttribute("user", user);

			List<Document> documents = documentService.findAllDocByUserId(userId);
			model.addAttribute("documents", documents);

			return "document";
		} else {
			System.out.println("Fetching file");

			User user = userService.findById(userId);
			model.addAttribute("user", user);

			saveDocument(fileBucket, user);

			return "redirect:/document/add-document-" + userId;

		}

	}  
	
	
	
	

	private void saveDocument(FileBucket fileBucket, User user) throws IOException {

		Document document = new Document();
		MultipartFile multipartFile = fileBucket.getFile();
		document.setName(multipartFile.getOriginalFilename());
		document.setDescription(fileBucket.getDescription());
		document.setType(multipartFile.getContentType());
		document.setContent(multipartFile.getBytes());
		document.setUser(user);
		documentService.saveDocument(document);
	}

}
