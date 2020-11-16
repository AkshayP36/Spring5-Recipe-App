package guru.springframework.spring5recipeapp.domain;


//Adding annotations to the class [Class<->Table]
//Adding fields
//Adding annotations to the fields [fields<->Columns]
//Adding no-args constructor
//Adding constructor
//Adding getters and setters
//Adding toString method

import javax.persistence.*;

@Entity
public class UnitOfMeasure {
    //---------- creating fields -------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToOne
    private Ingredients ingredients;


    //-------- creating constructors ----------//




    //----------creating getters and setters-------------//

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUom() {
        return description;
    }

    public void setUom(String description) {
        this.description = description;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }
}
