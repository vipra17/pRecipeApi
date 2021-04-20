package com.abn.recipe.pRecipeApi;


import com.abn.recipe.pRecipeApi.model.Ingredient;
import com.abn.recipe.pRecipeApi.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Startup implements CommandLineRunner {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public void run(String... args) throws Exception {
        Ingredient ingredient = new Ingredient("Pasta", "Whole wheat pasta");
        ingredientRepository.save(ingredient);

        ingredient = new Ingredient("Olive oil", "Virgin olive oil");
        ingredientRepository.save(ingredient);

        ingredient = new Ingredient("Cheese", "Grated cheese");
        ingredientRepository.save(ingredient);

        ingredient = new Ingredient("Pesto", "Fresh Basil Pesto");
        ingredientRepository.save(ingredient);

        ingredient = new Ingredient("Onions", "Red onions diced");
        ingredientRepository.save(ingredient);

    }
}