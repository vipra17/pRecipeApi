package com.abn.recipe.pRecipeApi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "recipe")
@Getter
@Setter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="dd-MM-yyyy HH:mm")
    private Date creationDateTime = new Date();

    @Column(name = "cooking_steps")
    private String cookingSteps;

    @Column(name = "num_of_people")
    private Long noOfPeople;

    @Column(name = "dish_type")
    private String dishType;

    @ManyToMany
    private List<Ingredient> ingredientList;

    public Recipe(){}

}
