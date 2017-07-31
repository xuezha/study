package cn.com.cmbc.study.controller;

import cn.com.cmbc.study.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yemin on 2017/7/29.
 */
@Controller
public class UserController {
   /* private final static Map<String, User> users = new HashMap<String, User>();
        // 模拟数据源,构造初始数据
    public UserController() {
        users.put("张起灵", new User("张起灵", "闷油瓶", "02200059"));
    }*/
/*@RequestMapping("/list")
public String list(Model model) {
    model.addAttribute("users", users);
    return "list";
}*/
@RequestMapping(value = "/add", method = RequestMethod.GET)
public Object addUser() {
    return "add";
}
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object second(
            User user,
            @RequestParam MultipartFile[] myfiles,
            Model model,
           /* @RequestParam(value = "userId", defaultValue = "") String userId,
                         @RequestParam(value = "nickname", defaultValue = "") String nickname,
                         @RequestParam(value = "password", defaultValue = "") String password,
                         @RequestParam MultipartFile[] myfiles,*/
                         HttpServletRequest request)throws IOException {
        /*System.out.println("userId="+ userId);
        System.out.println("nickname="+ nickname);*/
        // 模拟数据源,构造初始数据
        //User user = new User();
        Map<String, User> users = new HashMap<String, User>();
        users.put("user",new User(user.getUserId(),user.getNickname(),user.getPassword()));
        System.out.println(user.getUserId()+user.getNickname()+user.getPassword());
        users.put("张起灵", new User("张起灵", "闷油瓶", "02200059"));
        users.put("安岩", new User("安岩", "郁垒", "19951205"));
        model.addAttribute("users", users);
        return "list";//重定向
    }

}
