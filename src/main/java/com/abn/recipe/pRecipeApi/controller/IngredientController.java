package com.abn.recipe.pRecipeApi.controller;



import com.abn.recipe.pRecipeApi.model.Ingredient;
import com.abn.recipe.pRecipeApi.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("/ingredients")
    public Iterable<Ingredient> getAllIngredients(){
        return ingredientRepository.findAll();
    }
}