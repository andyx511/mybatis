package com.alex.ni.mybatis.dao;

import com.alex.ni.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UserDao {

    User getById(Long id);

    List<User> listByEntity(User user);

    User getByEntity(User user);

    List<User> listByIds(List<Long> list);

    int insert(User user);

    int insertBatch(List<User> list);

    int update(User user);

    int updateByField(@Param("where") User where, @Param("set") User set);

    int updateBatch(List<User> list);

    int deleteById(Long id);

    int deleteByEntity(User user);
  
    int deleteByIds(List<Long> list);
    
    int countAll();
    
    int countByEntity(User user);
    
}