package com.example.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home method called");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(int num1,int num2, Model model){
        // int num1= Integer.parseInt(req.getParameter("num1"));
        // int num2= Integer.parseInt(req.getParameter("num2"));

        int result=num1+num2;

        // session.setAttribute("result", result); //data between pages is handled by session object

        model.addAttribute("result", result);
        
        return "result.jsp";
    }
}
