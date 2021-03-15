package com.alex.ni.mybatis.service;

import com.alex.ni.mybatis.dao.UserDao;
import com.alex.ni.mybatis.entity.User;

import java.util.List;

public interface UserServiceI {
    
    UserDao getUserDao();
   
    User getById(Long id);

    User getByEntity(User user);

    List<User> listByEntity(User user);

    List<User> listByIds(List<Long> ids);

    int insert(User user);

    int insertBatch(List<User> list);

    int update(User user);

    int updateBatch(List<User> list);

    int deleteById(Long id);

    int deleteByEntity(User user);
  
    int deleteByIds(List<Long> list);
    
    int countAll();
    
    int countByEntity(User user);
}