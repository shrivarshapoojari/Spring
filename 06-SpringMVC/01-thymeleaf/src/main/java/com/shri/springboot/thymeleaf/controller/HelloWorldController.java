package com.shri.springboot.thymeleaf.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showform")
    public String showForm()
    {
        return "helloworld-form";
    }
    @RequestMapping("/process")
    public String processForm()
    {
        return "helloworld";
    }
    @RequestMapping("/process2")
    public String processForm2(HttpServletRequest req, Model model)
    {
        String name=req.getParameter("studentName");
        name=name.toUpperCase();
        String result="hiii   " +name;
        model.addAttribute("msg",result);

        return "helloworld";
    }


    @RequestMapping("/process3")
    public String processForm3(@RequestParam("studentName") String theName, Model model)
    {


        String result="hiii 3  " +theName;
        model.addAttribute("msg",result);

        return "helloworld";
    }
}


