package com.abn.recipe.pRecipeApi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "recipe")
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

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public String getCookingSteps() {
        return cookingSteps;
    }

    public void setCookingSteps(String cookingSteps) {
        this.cookingSteps = cookingSteps;
    }

    public Long getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(Long noOfPeople) {
        this.noOfPeople = noOfPeople;
    }
    
    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }
}
