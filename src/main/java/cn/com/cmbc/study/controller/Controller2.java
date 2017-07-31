package cn.com.cmbc.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yemin on 2017/7/28.
 */
@Controller
public class Controller2 {
    @RequestMapping("/object-user")
    @ResponseBody
    public Object second(HttpServletRequest request) throws IOException {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code1", 1);
        result.put("code2", 2);
        return result;
    }
}
