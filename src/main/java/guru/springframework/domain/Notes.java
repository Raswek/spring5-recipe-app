package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by jt on 6/13/17.
 */
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    public Notes()
    {
    }

    public Long getId()
    {
        return this.id;
    }

    public Recipe getRecipe()
    {
        return this.recipe;
    }

    public String getRecipeNotes()
    {
        return this.recipeNotes;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setRecipe(Recipe recipe)
    {
        this.recipe = recipe;
    }

    public void setRecipeNotes(String recipeNotes)
    {
        this.recipeNotes = recipeNotes;
    }

    public String toString()
    {
        return this.getRecipeNotes();
    }
}
