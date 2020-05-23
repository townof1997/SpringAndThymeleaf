package org.example.controller;

import org.example.pojo.User;
import org.example.pojo.User2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);
    /**
     * 测试hello
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "hello";
    }
    @GetMapping("/use")
    public String getUser(Model model) {
        model.addAttribute("user", new User(1L));
        return "use";
    }

    @GetMapping("/userlist")
    public String getUserList(Model model) {
        List<User> list = new ArrayList<>();
        list.add(new User(2L, "lisi"));
        list.add(new User(3L, "wangwu"));
        list.add(new User(4L, "zhaoliu"));
        model.addAttribute("user_list", list);
        return "userlist";
    }
    @GetMapping(value = "/params")
    public String getDoubleData(Model model) {
        model.addAttribute("fruit", "orange");
        model.addAttribute("wife","liling");
        return "params";
    }
    @GetMapping("/showStyle")
    public String showStyle(Model model) {
        model.addAttribute("uid","123456789");
        model.addAttribute("name","<span style='color:red'>Jerry</span>");
        return "showStyle";
    }
    @RequestMapping(value = "/message/member_show", method = RequestMethod.GET)
    public String memberShow(Model model) {
        User2 vo = new User2();
        vo.setUid(12345678L);
        vo.setName("啊三");
        vo.setAge(16);
        vo.setSalary(1000.00);
        vo.setBirthday(new Date());
        model.addAttribute("member", vo);
        return "message/member_show";
    }
    @RequestMapping(value = "/inner", method = RequestMethod.GET)
    public String inner(HttpServletRequest request, Model model) {
        request.setAttribute("requestMessage", "springboot-request");
        request.getSession().setAttribute("sessionMessage", "springboot-session");
        request.getServletContext().setAttribute("applicationMessage",
                "springboot-application");
        model.addAttribute("url", "www.baidu.cn");
        request.setAttribute("url2",
                "<span style='color:red'>www.baidu.cn</span>");
        return "inner";
    }
    @GetMapping("/user2")
    public String getUser2(Model model) {
        User2 vo = new User2();
        vo.setUid(100L);
        vo.setName("尼古拉丁.赵四");
        vo.setAge(16);
        vo.setSalary(1000.00);
        vo.setBirthday(new Date());
        model.addAttribute("member", vo);

        return "user2";
    }
}
