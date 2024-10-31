package com.example.contact.service;

import com.example.contact.bean.User;
import com.example.contact.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
// @Component是一个通用的注解，用于标识一个类为Spring容器中的组件，可以被其他组件依赖注入。
// @Service是一个特殊的@Component，用于标识一个类为业务逻辑层的组件，通常用于封装业务逻辑，提供给Controller层调用。
// 业务逻辑层，用于完成功能设计，一般用于调用dao层的接口，实现业务功能
public class UserService {
    @Autowired
    private UserMapper userMapper;

    // 以下五个业务功能分别对应Mapper中的五个数据操作
    public List<User> getUserList(){
        return userMapper.getUserList();
    }
    public List<User> selectUser(String Name){
        return userMapper.selectUser(Name);
    }
    public void addUser(String Name,String Phone_number){
        userMapper.addUser(Name,Phone_number);
    }
    public void delUser(int ID){
        userMapper.delUser(ID);
    }
    public void updateUser(int ID,String Name,String Phone_number){
        userMapper.updateUser(ID,Name,Phone_number);
    }
}
