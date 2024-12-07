package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {
    
    @RequestMapping("/greet")
    public String greetUser(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", "Hello, " + username + "!");
        return "greet";
    }
    
    @RequestMapping("/about")
    public String about() {
        return "about";
    }
    
    @RequestMapping("/demo1")
    public String displayAgeAndCountry(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }

    @RequestMapping("/demo2/{num1}/{num2}")
    public String arithmeticOperations(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        model.addAttribute("subtraction", num1 - num2);
        model.addAttribute("division", num1 / num2);
        return "demo2";
    }
    
    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    @RequestMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("result", num1 * num2);
        return "multiplyNumbers";
    }

    @RequestMapping("/reverse")
    public String reverseStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("reversedStr1", new StringBuilder(str1).reverse().toString());
        model.addAttribute("reversedStr2", new StringBuilder(str2).reverse().toString());
        return "reverse";
    }
    
    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("subtraction", num1 - num2);
        model.addAttribute("addition", num1 + num2);
        return "calculate";
    }
}
