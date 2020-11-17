package guru.springframework.spring5recipeapp.controllers;

//Adding annotation at class -> to make it a controller for Index Page

import guru.springframework.spring5recipeapp.domain.Category;
import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import guru.springframework.spring5recipeapp.repositories.CategoryRepository;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    //Initialize fields and create constructors

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    //create views and append them to the module



    //----------- Index Page navigation----------//
    //READ <-> GET
    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional=categoryRepository.findByDescription("Indian Classic food");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Thali");

        System.out.println("Category ID = "+categoryOptional.get().getId());
        System.out.println("Unit Of Measure ID = "+unitOfMeasureOptional.get().getId());
        return "index";
    }
    //CREATE <-> POST

    //UPDATE <-> PUT

    //DELETE <-> DELETE
}
