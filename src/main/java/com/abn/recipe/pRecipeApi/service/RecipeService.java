package com.abn.recipe.pRecipeApi.service;  
import java.util.ArrayList;  
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.abn.recipe.pRecipeApi.model.Recipe;
import com.abn.recipe.pRecipeApi.repository.RecipeRepository;  

@Service  
public class RecipeService   
{  
    @Autowired
    RecipeRepository recipeRepository;

    public List<Recipe> getAllRecipes()
    {
        List<Recipe> recipes = new ArrayList<Recipe>();
        recipeRepository.findAll().forEach(recipe1 -> recipes.add(recipe1));
        return recipes;
    }

    public Recipe getRecipesById(Long id)
    {
    return recipeRepository.findById(id).get();
    }

    public Recipe save(Recipe recipe)
    {
        recipeRepository.save(recipe);
        return recipe;
    }

    public void delete(Long id)
    {
    recipeRepository.deleteById(id);
    }
}