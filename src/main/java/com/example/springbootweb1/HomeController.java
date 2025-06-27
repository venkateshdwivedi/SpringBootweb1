package com.example.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(int num1,int num2, ModelAndView mv){
        // int num1= Integer.parseInt(req.getParameter("num1"));
        // int num2= Integer.parseInt(req.getParameter("num2"));

        int result=num1+num2;

        // session.setAttribute("result", result); //data between pages is handled by session object in servlet way and handled by model in spring way

        // model.addAttribute("result", result);

        //using modelandview object
        mv.addObject("result", result);
        mv.setViewName("result");
        
        return mv;
    }

    
    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien){
       
        // Alien obj=new Alien();
        // obj.setAid(aid);
        // obj.setaName(aName);

        // //using modelandview object
        // mv.addObject("alien", obj);
        // mv.setViewName("result");
        
        //optimisation done using modelattribute
        return "result";
    }
}
