package com.pluralsight.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value ="/greeting")
    public String sayHello (Model model) {

        model.addAttribute("greeting", "Peters Hello World");

        return "hello"; //<-- name of JSP page that will be opened and will put this data to it. hello.jsp
    }

}