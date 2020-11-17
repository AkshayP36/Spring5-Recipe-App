package guru.springframework.spring5recipeapp.domain;

//Adding annotations to the class -> [Class<->Table]
//Adding fields
//Adding annotation to the fields
//Adding getters and setters
//Adding no-args constructors
//Adding constructors
//Adding toString methods

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    //Adding fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "category")
    private Set<Recipe> recipes;


    //--------Adding constructors ----------------//




    //---------- Adding getters and setters----------//

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
