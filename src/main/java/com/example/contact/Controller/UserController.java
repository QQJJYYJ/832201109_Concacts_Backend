package com.example.contact.Controller;

import com.example.contact.bean.User;
import com.example.contact.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// @RestController和@Controller都是Spring框架中用来标识一个类为控制器的注解。
// @RestController注解是Spring4.0版本引入的新特性，它的作用是将该类下的所有方法的返回值都默认为JSON格式的数据。这意味着在使用@RestController
// 注解标注的类中所有方法的返回值都会被自动转换为JSON格式并返回给客户端。而@Controller注解则是Spring MVC框架中的一个基本注解，它的作用是标识一个
// 类为控制器并且该类中的方法通常用来处理HTTP请求和响应。在使用@Controller注解的类中，通常需要配合使用其他注解来实现请求参数绑定、视图渲染等功能
// 比如@RequestMapping、@RequestParam、@ModelAttribute等。
// @RestController是@Controller和@ResponseBody的组合注解

@Controller
// @Controller是一个特殊的@Component，用于标识一个类为控制器层的组件，通常用于接收请求，处理请求参数，调用Service层提供的服务，返回响应结果。
// 控制器Controller层
public class UserController {
    @Autowired
    private UserService userService;

    // @RequestMapping是一个通用的注解，可以用于处理任何类型的HTTP请求，包括GET、POST、PUT、DELETE等。它可以用于类级别和方法级别，用于指定请求的URL路径和请求方法。
    // @GetMapping是@RequestMapping的一个特殊化版本，用于处理HTTP GET请求。它只能用于方法级别，用于指定请求的URL路径。相比于@RequestMapping，它更加简洁明了，也更加易于使用。
    // 总的来说，如果只需要处理HTTP GET请求，建议使用@GetMapping；如果需要处理其他类型的HTTP请求，可以使用@RequestMapping。
    // 注意，这里对于注解的使用会直接影响到view层中ajax对于post和get的选择，对应错了是跑不通的！

    @RequestMapping("test")
    @ResponseBody
    // @ResponseBody注解用于将Controller的方法返回的对象，通过适当的转换器转换为指定的格式之后，写入到response对象的body区，通常用来返回JSON数据或者是XML数据，一般在异步获取数据时使用
    public List<User> getUserList(){
        return userService.getUserList();
    }// 上面这个方法简单将数据库中的所有数据全部输出，在项目中没有实际使用，主要用来帮助理解、测试和debug

    // 用于查找
    @RequestMapping("select")
    @ResponseBody
    public List<User> selectUser(String Name){
        return userService.selectUser(Name);
    }// 返回json格式的结果

    // 用于添加
    @RequestMapping("add")
    @ResponseBody
    public void addUser(String Name,String Phone_number){
        userService.addUser(Name,Phone_number);
    }

    // 用于删除
    @RequestMapping("del")
    @ResponseBody
    public void delUser(int ID){
        userService.delUser(ID);
    }

    // 用于更改
    @RequestMapping("update")
    @ResponseBody
    public void updateUser(int ID,String Name,String Phone_number){
        userService.updateUser(ID,Name,Phone_number);
    }
}
