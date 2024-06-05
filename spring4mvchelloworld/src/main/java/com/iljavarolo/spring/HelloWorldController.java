package com.iljavarolo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

 @RequestMapping("/hello")
 public String hello(@RequestParam(value="msg", required=false, defaultValue="Hello World") String msg, Model model) {
  
   model.addAttribute("msg", msg);
   
   return "helloworld";

 }

}
