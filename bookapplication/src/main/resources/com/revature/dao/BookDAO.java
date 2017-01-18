package com.revature.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.model.Book;
import com.revature.util.ConnectionUtil;

public class BookDAO {
	JdbcTemplate jdbctemplate=ConnectionUtil.getJdbcTemplate();

	public void add(Book book)
	{
		String sql="insert into books(id,name)values(?,?)";
		object[] params={book.getId(),book.getName()};
		getid(),book.getName()};
		introws=jdbc Template.update(sql,params);
		System.println(number of rows inserted"+rows);

		}
		
	}
}
