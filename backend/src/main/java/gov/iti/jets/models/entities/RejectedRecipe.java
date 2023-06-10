package gov.iti.jets.models.entities;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "rejected_recipe")
public class RejectedRecipe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "message", nullable = false)
    private String message;

    @Id
    @Column(name = "recipe_id", nullable = false)
    private Integer recipeId;

}
