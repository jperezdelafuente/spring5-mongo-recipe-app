package guru.springframework.spring5recipeapp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notes {

    private Long id;

    private Recipe recipe;

    private String recipeNotes;

}
