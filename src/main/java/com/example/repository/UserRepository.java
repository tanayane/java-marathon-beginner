package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.User20;

@Repository
public class UserRepository {

	@Autowired
	NamedParameterJdbcTemplate template;
	
	private static final RowMapper<User20> USER_ROW_MAPPER=(rs,i)->{
		User20 user=new User20() ;
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setAge(rs.getInt("age"));
		user.setAddress(rs.getString("address"));
		return user;
	};
	
	public User20 load(int id) {
		String sql="select id,name,age,address from students where id=:id";
		SqlParameterSource param=new MapSqlParameterSource().addValue("id", id);
		User20 user=template.queryForObject(sql, param,USER_ROW_MAPPER);
		return user;
	}
}
