package com.example.demo.controller.login;

import com.example.demo.controller.base.BaseController;
import com.example.demo.controller.base.Response;
import com.example.demo.controller.base.StateCode;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Response post(@RequestBody Integer id) {
        User user = userService.findById(id);
        if(user == null) return response(StateCode.FAIL, "不存在该用户");
        else return response(StateCode.SUCCESS, user);
    }

}
