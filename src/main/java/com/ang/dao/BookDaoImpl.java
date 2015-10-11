package com.ang.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ang.model.Angbooks;
import com.ang.model.AngbooksGenre;
import com.ang.model.Genre;
import com.ang.model.Price;
import com.ang.viewmodel.BookInfoViewModel;
import com.ang.viewmodel.PriceViewModel;


public class BookDaoImpl implements BooksDao{
	
	@Autowired(required=true)
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public BookInfoViewModel getBookInfo(int bookId) {
	
		Angbooks bookInfo=(Angbooks) sessionFactory.getCurrentSession().createQuery(" from Angbooks where bookId= "+bookId+" ").list().get(0);
		Set<String> al=new HashSet<String>();
		String imgUrl="https://s3-us-west-2.amazonaws.com";
		for(AngbooksGenre abg:bookInfo.getAngbooksGenres()){
			al.add(abg.getGenre().getGenre());
		}
		/*GenreViewModel gvm=new GenreViewModel();
		gvm.setGenre(al);*/
		Price p = bookInfo.getPrice();
		PriceViewModel pvm = new PriceViewModel(p.getPriceId(),p.getPrice());
		
		BookInfoViewModel bvm=new BookInfoViewModel(bookInfo.getBookId(), pvm, bookInfo.getBookName(), bookInfo.getBookAuthor(), bookInfo.getPubdate(), bookInfo.getBookDesc(),al);
		String imgUrl2=imgUrl+"/angularimages/img/"+bookInfo.getBookId();
		bvm.setImgUrl(imgUrl2);
		bvm.setCountry(bookInfo.getCountry());
		bvm.setLanguage(bookInfo.getLanguage());
		bvm.setPages(bookInfo.getPages());
		bvm.setSeries(bookInfo.getSeries());
		return bvm;
	}

	

}
