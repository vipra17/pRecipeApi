package com.abn.recipe.pRecipeApi.controller;

import com.abn.recipe.pRecipeApi.model.Recipe;
import com.abn.recipe.pRecipeApi.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping()
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }

    @PostMapping()
    public Long createRecipe(@RequestBody Recipe recipe){
        recipeService.save(recipe);
        return recipe.getId();
    }

    @PutMapping()
    public Recipe updateRecipe(@RequestBody Recipe recipe){
        recipeService.save(recipe);
        return recipe;
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable("id") Long id){
        recipeService.delete(id);
    }
}
