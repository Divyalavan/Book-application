package com.revature.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.model.Book;
import com.revature.util.ConnectionUtil;

public class BookDAO {
	JdbcTemplate jdbctemplate=ConnectionUtil.getJdbcTemplate();

	public void add(Book book)
	{
		String sql="insert into book(d,name) values(?,?)";
		Object[] params={book.getId(),book.getName()};
		int rows=jdbctemplate.update(sql,params);
		System.out.println("number of rows inserted"+rows);

		}
	public void update(Book book)
	{
		String sql="update book name=? where d=?";
		Object[] params={book.getName(),book.getId()};
		int rows=jdbctemplate.update(sql,params);
		System.out.println("number of rows updated"+rows);

		
	}
		
	}

