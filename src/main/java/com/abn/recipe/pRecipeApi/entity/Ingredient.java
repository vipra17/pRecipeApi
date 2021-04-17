package com.abn.recipe.pRecipeApi.entity;

import lombok.*;

import javax.annotation.sql.DataSourceDefinitions;
import javax.persistence.*;

@Entity
@Table(name = "ingredient")
@Getter
@Setter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public Ingredient(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Ingredient(){

    }

}