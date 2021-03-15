package com.alex.ni.mybatis.controller;

import com.alex.ni.mybatis.entity.User;
import com.alex.ni.mybatis.service.UserServiceI;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserServiceI userService;

    @GetMapping("/get/{id}")
    public User getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return user!=null?user:new User();
    }

    @GetMapping("/get")
    public User getByEntity(User user) {
        return userService.getByEntity(user);
    }

    @GetMapping("/list")
    public List<User> list(User user) {
        List<User> userList = userService.listByEntity(user);
        return userList;
    }

    @PostMapping("/insert")
    public User insert(@RequestBody User user){
        userService.insert(user);
        return user;
    }

    @PutMapping("/update")
    public int update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/delete/{id}")
    public int deleteOne(@PathVariable Long id){
        return userService.deleteById(id);
    }

    @DeleteMapping("/delete")
    public int deleteBatch(@RequestBody List<Long> ids){
        int result = 0;
        if (ids!=null&&ids.size()>0) result = userService.deleteByIds(ids);
        return result;
    }

}