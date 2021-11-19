//importando o pacote Application para o Controller e importando os frameworks

package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller   //@ anotação para a proxima linha
public class HomeController {
    @RequestMapping(method=RequestMethod.GET)  // usando o metodo Get
    public String index() {
        return "home/index.jsp";   //retornando para a pagina index
    }
}