/**
 * 
 */
package com.ang.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.ang.dao.BooksDao;
import com.ang.viewmodel.BookInfoViewModel;


/**
 * @author Ramakrishna
 *
 */
@RestController
public class AngularJSController {
	
	
	
	@Autowired
	BooksDao BooksDAO;
	
	
	private static final Logger logger = LoggerFactory.getLogger(AngularJSController.class);
	
	@RequestMapping(value="/book-info/{bookId}",method=RequestMethod.GET)
	public BookInfoViewModel getBookInfo(@PathVariable ("bookId") int bookId){
		BookInfoViewModel bvim =BooksDAO.getBookInfo(bookId);
		logger.info("abc");
		return bvim;
		
	}
	

}
