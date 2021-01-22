package com.github.perscholas;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by leon on 8/31/2020.
 */
@Controller
@RequestMapping("/index-controller")
@SessionAttributes("userKey")
public class IndexController {
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setDisallowedFields("username");
    }

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
            @ModelAttribute("userKey") @Valid User u,
            BindingResult errors) {
        if (errors.hasErrors()) {
            return new ModelAndView("index");
        }
        return new ModelAndView("user-info");
    }

    @RequestMapping(value = "/userInfoConfirm", method = RequestMethod.POST)
    public ModelAndView userInfoConfirm(@RequestAttribute("userKey") User user) {
        return new ModelAndView("user-account-page");
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public ModelAndView userInfoModify() {
        return new ModelAndView("user-account-modify");
    }

    @RequestMapping(value = "/submit-changes", method = RequestMethod.POST)
    public String userInfoChanges(
            @ModelAttribute User user,
            @SessionAttribute("userKey") User userKey) {
        if (user.getPassword().equals(userKey.getPassword())) {
            return "redirect:modify";
        }
        userKey.setPassword(user.getPassword());
        return "user-account-page";
    }
}
