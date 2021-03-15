package com.alex.ni.mybatis.service.impl;

import com.alex.ni.mybatis.dao.UserDao;
import com.alex.ni.mybatis.service.UserServiceI;
import com.alex.ni.mybatis.entity.User;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiceI {

    @Resource(type = UserDao.class)
    private UserDao userDao;

    @Override
    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public User getByEntity(User user) {
        return userDao.getByEntity(user);
    }

    @Override
    public List<User> listByEntity(User user) {
        return userDao.listByEntity(user);
    }

    @Override
    public List<User> listByIds(List<Long> ids) {
        return userDao.listByIds(ids);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int insertBatch(List<User> list) {
        return userDao.insertBatch(list);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int updateBatch(List<User> list) {
        return userDao.updateBatch(list);
    }

    @Override
    public int deleteById(Long id) {
        return userDao.deleteById(id);
    }

    @Override
    public int deleteByEntity(User user) {
        return userDao.deleteByEntity(user);
    }
  
    @Override
    public int deleteByIds(List<Long> list) {
        return userDao.deleteByIds(list);
    }

    @Override
    public int countAll() {
        return userDao.countAll();
    }
    
    @Override
    public int countByEntity(User user) {
        return userDao.countByEntity(user);
    }

}