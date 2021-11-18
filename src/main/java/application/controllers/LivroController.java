package application.controllers;//pacote responsável por fazer a intermediação
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.models.Livro;
import application.repositories.LivroRepository;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/livro")
public class LivroController {
    @Autowired
    private LivroRepository livrosRepo;
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("livros", livrosRepo.findAll());
        return "list.jsp";
        
    }
    public String listar(){
        return "livro/list.jsp";
    }

@RequestMapping("/insert")
public String formInsert(){
    return "insert.jsp";

}
@RequestMapping(value="/insert",method=RequestMethod.POST)
public String saveInsert(@RequestParam("titulo")String titulo){

    Livro livro=new Livro();
    livro.setTitulo(titulo);
    livrosRepo.save(livro);
    return "redirect:/livro/list";

}
@RequestMapping("/delete/{id}")
public String formDelete(Model model,@PathVariable int id){
    Optional<Livro>livro=livrosRepo.findById(id);
    if (!livro.isPresent()) 
        return "redirect:/livro/list";
     model.addAttribute("livro",livro.get());
 
    return "/livro/delete.jsp";
    

}
@RequestMapping(value = "/delete",method=RequestMethod.POST)
public String confirmDelete(@RequestParam("id")int id){
   livrosRepo.deleteById(id);
        return "redirect:/livro/list";
     

}
@RequestMapping("/update/{id}")
public String formUpdate(Model model,@PathVariable int id){
    Optional<Livro>livro=livrosRepo.findById(id);
    if (!livro.isPresent()) 
        return "redirect:/livro/list";
     model.addAttribute("livro",livro.get());
 
    return "/livro/update.jsp";
    

}
@RequestMapping(value = "/update",method=RequestMethod.POST)
public String saveUpdate(@RequestParam("titulo")String titulo,@RequestParam("id")int id){
    Optional<Livro>livro=livrosRepo.findById(id);
    if (!livro.isPresent()) 
        return "redirect:/livro/list";
     livro.get().setTitulo(titulo);
     livrosRepo.save(livro.get());
 
     return "redirect:/livro/list";
    
     

}
}