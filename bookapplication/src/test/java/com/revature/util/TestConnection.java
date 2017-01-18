package com.revature.util;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestConnection {

	public static void main(String[] args) {
		JdbcTemplate jdbctemplate=ConnectionUtil.getJdbcTemplate();
		System.out.println(jdbctemplate);
		// TODO Auto-generated method stub

	}

}
