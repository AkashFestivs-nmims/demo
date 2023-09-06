package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class userDao {
    
    @Autowired JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getUsers(){
        String SQL= "SELECT * FROM public.user;";
        return jdbcTemplate.queryForList(SQL);
    }
}
