package com.teste.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
public class TesteController {

    @RequestMapping("/")
    public ModelAndView home() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("index.html");
	return modelAndView;
    }
}
