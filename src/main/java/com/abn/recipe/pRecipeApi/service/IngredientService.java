package com.abn.recipe.pRecipeApi.service;

import com.abn.recipe.pRecipeApi.model.Ingredient;
import com.abn.recipe.pRecipeApi.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientService {
    @Autowired
    IngredientRepository ingredientRepository;
    //getting all recipes record by using the method findaAll() of CrudRepository
    public List<Ingredient> getAllIngredients()
    {
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredientRepository.findAll().forEach(ingredients1 -> ingredients.add(ingredients1));
        return ingredients;
    }
}
