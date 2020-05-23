package org.example.controller;

import org.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/path")
public class ParamsController {

    @RequestMapping(value = {"params/{id}"}, method = {RequestMethod.GET})
    public ModelAndView PathParams(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("path/params");
        User user = new User(id);
        modelAndView.addObject("user", user);
        return modelAndView;
    }
    @RequestMapping(value = "requestparams", method = {RequestMethod.GET})
    public ModelAndView RequestParams(@RequestParam Long id) {
        ModelAndView modelAndView = new ModelAndView("path/requestparams");
        User user = new User(id);
        modelAndView.addObject("user_1", user);
        return modelAndView;
    }
}
