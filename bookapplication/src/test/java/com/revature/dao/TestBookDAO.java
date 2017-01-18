package com.revature.dao;

import com.revature.model.Book;

public class TestBookDAO {

	public static void main(String[] args) {
		Book book=new Book();
		book.setId(4);
		book.setName("mysql");
		BookDAO bookdao=new BookDAO();
		bookdao.update(book);
		
		// TODO Auto-generated method stub

	}

}
