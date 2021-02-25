package be.techni.ilir.labo3SB.controller;

import be.techni.ilir.labo3SB.model.services.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/produits")
public class ProduitController {

    private final ProduitService produitService;


    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping
    public ModelAndView getAll(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("produit/getAll");
        mv.addObject("produits",this.produitService.getAll());
        return mv;
    }
}
