package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.User;

@Repository
public class UserRepository {

	@Autowired
	NamedParameterJdbcTemplate template;
	
	private static final RowMapper<User> USER_ROQ_MAPPER=(rs,i)->{
		User user=new User() ;
		user.setName(rs.getString("name"));
	}
	
	public User load(int id) {
		String sql="select id,name,age,address from students where id=:id";
		SqlParameterSource param=new MapSqlParameterSource().addValue("id", id);
		User user=template.queryForObject(sql, param);
		return user;
	}
}
