package com.example.contact.mapper;

import com.example.contact.bean.User;
import org.apache.ibatis.annotations.*;//用于在MyBatis框架中定义Mapper接口
import java.util.List;

@Mapper
// @mapper 是一种数据映射模式，用于将对象与数据库表之间的映射关系定义。它可以帮助程序员简化对数据库的操作，使用对象而不是原始 SQL 语句来操作数据库。
// 帮助开发者能够使用注解或者xml文件通过sql语句直接操作数据库
public interface UserMapper {
    //数据持久层，用于存放sql语句，在SpringBoot中用注解来为每一个方法注入sql语句，也叫Dao层
    @Select("select * from address_book_data")
    List<User> getUserList();
    // 查询数据库中对应的所有数据

    @Select("select * from address_book_data where Name like concat('%',#{Name},'%')")
    List<User> selectUser(String Name);
    //根据Name进行模糊查询

    @Insert("insert into address_book_data(Name,Phone_number)values(#{Name},#{Phone_number})")
    void addUser(String Name,String Phone_number);
    // 向数据库中添加新的数据，主要包括Name和Phone_number，而ID在数据库中作为主键已经设置为自增

    @Delete("delete from address_book_data where ID =#{ID}")
    void delUser(int ID);
    // 根据ID将数据库中的数据删除

    @Update("update address_book_data set Name =#{Name}, Phone_number =#{Phone_number} where ID =#{ID}")
    void updateUser(int ID, String Name, String Phone_number);
    // 更新对应的数据
}
