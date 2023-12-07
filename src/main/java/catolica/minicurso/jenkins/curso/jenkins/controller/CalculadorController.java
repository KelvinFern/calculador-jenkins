package catolica.minicurso.jenkins.curso.jenkins.controller;

import catolica.minicurso.jenkins.curso.jenkins.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadorController {
    @Autowired
    private CalculadoraService calculadoraService;
    @GetMapping("/ola")
    public String hello(){
        return CalculadoraService.hello();
    }
    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
        return calculadoraService.somar(a, b);
    }
    @GetMapping("/somar/{a}/{b}")
    public int subtrair(@PathVariable int a, @PathVariable int b){
        return calculadoraService.subtrair(a, b);
    }
}

