package org.example.controller;

import org.example.pojo.User;
import org.example.pojo.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Controller
//public class PostController {
//
//    /*//这个变量用来装我们的cookies信息
//    private static Cookie cookie;
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
////    @ApiOperation(value = "登录接口，成功登录后获取cookies", httpMethod = "POST")
//    public String login(HttpServletResponse response,
//                        @RequestParam(value = "username", required = true) String userName,
//                        // @RequestParam(value = "username1",required = true)String userName,
//                        // @RequestParam传递的参数格式是param格式
//                        // username1和前端传递的参数一致，
//                        //String userName,可以和前端不一致
//                        @RequestParam(value = "password", required = true) String password) {
//        if (userName.equals("zhangshan") && password.equals("111111")) {
//            cookie = new Cookie("login", "true");
//            response.addCookie(cookie);
//            return "恭喜你登录成功";
//        } else
//            return "用户名或密码错误";
//    }
//
//
//    *//**
//     * 携带cookie的指定用户获取用户列表信息
//     * @param
//     * @param
//     * @return
//     *//*
//    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
////    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
//    public String getUserList(HttpServletRequest request, @RequestBody UserBean user) {
////必须写上HttpServletRequest reques，或者cookie 值无法带上cookie值  @RequestBody需要传递的参数格式应该是json格式
//
//        //获取cookies
//        UserBean user1 = new UserBean();
//        Cookie[] cookies = request.getCookies();//获取cookie值
//        for (Cookie cookie : cookies) {
//            if (cookie.getName() .equals("login" )&& cookie.getValue().equals("true") &&
//                    user.getUsername().equals("zhangshan") && user.getPassword().equals("111111")) {
//
//                user1.setUsername("lisi");
//                user1.setAge("18");
//
//                return user1.toString();
//            }
//
//        }
//
//        return "参数不合法";
//
//    }
//
//    //只接受post方式的请求
//    @PostMapping("/testPostMapping")
//    public String testPostMapping(Model model) {
//        model.addAttribute("msg","测试@PostMapping注解");
//        return "success";
//    }
//*/
//}
