package cn.com.cmbc.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yemin on 2017/7/31.
 */
@Controller
public class PhotoController {
    @RequestMapping(value = "/photo", method = RequestMethod.GET)
    public String addUser() {
        return "photo";
    }
    @RequestMapping(value ="/photo",method = RequestMethod.POST)
    @ResponseBody
    public Object photo(@RequestParam(value="username",defaultValue="")String username,
            @RequestParam("photo")MultipartFile photo, HttpServletRequest request){
        Map<String,Object> result = new HashMap<String,Object>();
        System.out.println("photo="+photo.getOriginalFilename());
        result.put("username",username);
        result.put("code",1);
        return result;
    }

}
