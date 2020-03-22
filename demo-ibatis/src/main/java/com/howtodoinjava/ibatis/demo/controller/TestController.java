package com.howtodoinjava.ibatis.demo.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.ibatis.demo.dto.UserTEO;
import com.ibatis.sqlmap.client.SqlMapClient;

@RestController
@RequestMapping(value = "/test")
@CrossOrigin(origins = "*")
public class TestController {

	@Autowired
	private SqlMapClient sqlMap;

	@RequestMapping(value = "/get-data", method = RequestMethod.GET)
	public Map<String, Object> test() throws SQLException {
		Integer id = (Integer) sqlMap.queryForObject("user.getMaxId");
		UserTEO user = (UserTEO) sqlMap.queryForObject("user.getUserById", id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("test", "hariom");
		map.put("maxId", id);
		map.put("maxId", user);
		return map;
	}

}
