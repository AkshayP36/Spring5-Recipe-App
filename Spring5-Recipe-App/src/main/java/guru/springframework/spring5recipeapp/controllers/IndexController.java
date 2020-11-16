package guru.springframework.spring5recipeapp.controllers;

//Adding annotation at class -> to make it a controller for Index Page

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //Initialize fields and create constructors
    //create views and append them to the module



    //----------- Index Page navigation----------//
    //READ <-> GET
    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        return "index";
    }
    //CREATE <-> POST

    //UPDATE <-> PUT

    //DELETE <-> DELETE
}
