package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/test")
    public String test(Model model){
        model.addAttribute("username","张明辉");
        return "success";
    }

    @RequestMapping("/map")
    public String userSuccess(){
        System.out.println("userSuccess");
        return "success";
    }

    @RequestMapping("/quick")
    public ModelAndView test1(ModelAndView modelAndView){
        modelAndView.addObject("username","张献辉");
        modelAndView.setViewName("success");
        return modelAndView;
    }

}
