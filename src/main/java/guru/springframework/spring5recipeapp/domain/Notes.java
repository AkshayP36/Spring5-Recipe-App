package guru.springframework.spring5recipeapp.domain;

import javax.persistence.*;

//adding annotations to the class -> [Class<->Table]
//adding fields
//adding annorations to fields -> [Field<->Columns]
//adding no-args constructors
//adding args constructors
//adding toString methods


@Entity
public class Notes{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //defining fields
    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;


    // --------------- Getters and Setters --------------//

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}