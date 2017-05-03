package com.websystique.springmvc.converter;

import org.springframework.format.Parser;
import org.springframework.format.Printer;

public interface Formatter<T> extends Printer<T>, Parser<T>{

}
