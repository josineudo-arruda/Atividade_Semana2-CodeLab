package br.com.xavecoding.regescweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello"); // html exibido
        mv.addObject("nome", "Zé");
        return mv; // o spring redenriza o arquivo em templates referentes ao valor retornado
    }
    @GetMapping("/hello-model")
    public String hello(Model model) {
        model.addAttribute("nome", "Samuka");
        return "hello"; // o spring redenriza o arquivo em templates referentes ao valor retornado
    }

    @GetMapping("/hello-servlet")
    public String hello(HttpServletRequest request) {
        request.setAttribute("nome", "Daphne");
        return "hello"; // o spring redenriza o arquivo em templates referentes ao valor retornado
    }
}
