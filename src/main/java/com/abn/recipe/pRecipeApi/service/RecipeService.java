package com.abn.recipe.pRecipeApi.service;  
import java.util.ArrayList;  
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.abn.recipe.pRecipeApi.model.Recipe;
import com.abn.recipe.pRecipeApi.repository.RecipeRepository;  
//defining the business logic  
@Service  
public class RecipeService   
{  
@Autowired  
RecipeRepository recipeRepository;
//getting all recipes record by using the method findaAll() of CrudRepository
public List<Recipe> getAllRecipes()
{
List<Recipe> recipes = new ArrayList<Recipe>();
recipeRepository.findAll().forEach(recipe1 -> recipes.add(recipe1));
return recipes;
}  
//getting a specific record by using the method findById() of CrudRepository  
public Recipe getRecipesById(Long id)
{  
return recipeRepository.findById(id).get();
}  
//saving a specific record by using the method save() of CrudRepository  
public Recipe save(Recipe recipe)
{  
    recipeRepository.save(recipe);
    return recipe;
}
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(Long id)
{  
recipeRepository.deleteById(id);
}
}