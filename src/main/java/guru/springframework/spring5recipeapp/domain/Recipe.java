package guru.springframework.spring5recipeapp.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Recipe {

    private String id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Byte[] image;
    private Difficulty difficulty;
    private Set<Ingredient> ingredients = new HashSet<>();
    private Notes notes;

    private Set<Category> categories = new HashSet<>();

    public void setNotes(Notes notes) {
        if(notes != null) {
            notes.setRecipe(this);
            this.notes = notes;
        }
    }

    public Recipe addIngredient(Ingredient ingredient){
        ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }

}
