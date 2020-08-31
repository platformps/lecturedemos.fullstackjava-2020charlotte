package com.github.perscholas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by leon on 8/31/2020.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("Index");
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.POST)
    public ModelAndView userInfo(
            @RequestParam("username") String username,
            @RequestParam("email") String email,
            @RequestParam("password") String password) {
        ModelAndView mav = new ModelAndView("UserPage");
        mav.addObject("username", username);
        mav.addObject("password", password);
        mav.addObject("email", email);
        return mav;
    }
}
