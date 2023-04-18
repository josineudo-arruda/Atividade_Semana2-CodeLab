package br.com.xavecoding.regescweb.controllers;

import br.com.xavecoding.regescweb.models.Professor;
import br.com.xavecoding.regescweb.models.StatusProfessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProfessorController {
    @GetMapping("/professores")
    public ModelAndView index() {
        Professor batman = new Professor("batman", new BigDecimal(5000), StatusProfessor.AFASTADO);
        batman.setId(1L);
        Professor mulherMaravilha = new Professor("mulher maravilha", new BigDecimal(10000), StatusProfessor.ATIVO);
        mulherMaravilha.setId(2L);

        List<Professor> professores = Arrays.asList(batman, mulherMaravilha);
        ModelAndView mv = new ModelAndView("professores/index");
        mv.addObject("professores", professores);
        return mv;
    }
}
