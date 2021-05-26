package com.abn.recipe.pRecipeApi.controller;



import com.abn.recipe.pRecipeApi.model.Ingredient;
import com.abn.recipe.pRecipeApi.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/ingredients")
public class IngredientController {


    @Autowired
    private IngredientService ingredientService;

    @GetMapping()
    public Iterable<Ingredient> getAllIngredients(){
        return ingredientService.getAllIngredients();
    }
}