package org.example.controller;

import org.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/modelandview")
public class PathController {

    @RequestMapping(value = {"","edit"}, method = { RequestMethod.GET })
    public ModelAndView PathRequest() {
        ModelAndView modelAndView = new ModelAndView("modelandview/edit");
        List<User> users = new ArrayList<>();
        users.add(new User(33L,"寒冰"));
        users.add(new User(34L,"丽丽"));
        users.add(new User(35L,"路西"));
        modelAndView.addObject("users", users);
        return modelAndView;
    }
//    @GetMapping
    @RequestMapping(value = {"main", "xxx"}, method = { RequestMethod.GET })
    public ModelAndView PathMainRequest() {
        ModelAndView modelAndView = new ModelAndView("modelandview/main");
        List<User> users = new ArrayList<>();
        users.add(new User(11L,"诸葛"));
        users.add(new User(22L,"夏侯"));
        users.add(new User(33L,"司马"));
        modelAndView.addObject("usersss", users);
        return modelAndView;
    }

}
