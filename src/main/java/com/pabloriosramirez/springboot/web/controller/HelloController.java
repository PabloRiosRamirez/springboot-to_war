/**
 * @author Pablo Ríos Ramírez
 * @Created 28-06-2018 2:43:46
 * @web http://www.pabloriosramirez.com
**/

package com.pabloriosramirez.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public String showHello(Model model){
        model.addAttribute("saludo", "Mi primera aplicacion web Spring Boot");
        return "hello";
    }
}
