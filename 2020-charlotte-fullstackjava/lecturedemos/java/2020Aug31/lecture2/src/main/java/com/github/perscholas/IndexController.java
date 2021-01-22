package com.github.perscholas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by leon on 8/31/2020.
 */
@Controller
@RequestMapping("/")
@SessionAttributes("userKey")
public class IndexController {

    @ModelAttribute("userKey")
    public User setUpUserForm() {
        return new User();
    }

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.POST)
    public ModelAndView userInfo(
            @RequestParam("username") String username,
            @RequestParam("email") String email,
            @RequestParam("password") String password) {
        ModelAndView mav = new ModelAndView("user-info");
        mav.addObject("username", username);
        mav.addObject("password", password);
        mav.addObject("email", email);
        return mav;
    }

    @RequestMapping(value = "/userInfoConfirm", method = RequestMethod.POST)
    public ModelAndView userInfoConfirm(@ModelAttribute("userKey") User user) {
        return new ModelAndView("user-account-page");
    }
    
    @RequestMapping(value = "/modify", method=RequestMethod.GET)
    public ModelAndView userInfoModify() {
        return new ModelAndView("user-account-modify");
    }
    
    @RequestMapping(value = "/submit-changes", method = RequestMethod.POST)
    public String userInfoChanges(
            @ModelAttribute User user,
            @SessionAttribute("userKey") User userKey) {
        if(user.getPassword().equals(userKey.getPassword())) {
            return "redirect:modify";
        }
        userKey.setPassword(user.getPassword());
        return "user-account-page";
    }
}
