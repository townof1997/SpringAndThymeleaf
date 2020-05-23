package org.example.controller;

import org.example.pojo.User2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

@Controller
public class UserController {

    @RequestMapping(value = "/user/set", method = RequestMethod.GET)
    public String set(Model model) {
        Set<String> allNames = new HashSet<String>() ;
        List<Integer> allIds = new ArrayList<Integer>() ;
        for (int x = 0 ; x < 5 ; x ++) {
            allNames.add("boot-" + x) ;
            allIds.add(x) ;
        }
        model.addAttribute("names", allNames) ;
        model.addAttribute("ids", allIds) ;
        model.addAttribute("mydate", new java.util.Date()) ;
        return "user/set" ;
    }

    @RequestMapping(value = "/user/map", method = RequestMethod.GET)
    public String map(Model model) {
        Map<String, User2> allMembers = new HashMap<String,User2>();
        for (int x = 0; x < 10; x++) {
            User2 vo = new User2();
            vo.setUid(101L + x);
            vo.setName("赵四 - " + x);
            vo.setAge(9);
            vo.setSalary(99999.99);
            vo.setBirthday(new Date());
            allMembers.put("mldn-" + x, vo);
        }
        model.addAttribute("allUsers", allMembers);
        return "user/map";
    }

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<User2> allMembers = new ArrayList<User2>();
        for (int x = 0; x < 10; x++) {
            User2 vo = new User2();
            vo.setUid(101L + x);
            vo.setName("赵四 - " + x);
            vo.setAge(9);
            vo.setSalary(99999.99);
            vo.setBirthday(new Date());
            allMembers.add(vo) ;
        }
        model.addAttribute("allUsers", allMembers);
        return "user/list";
    }
}
