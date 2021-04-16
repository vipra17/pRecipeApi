package com.abn.recipe.pRecipeApi.controller;

import com.abn.recipe.pRecipeApi.entity.Recipe;
import com.abn.recipe.pRecipeApi.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v2")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("/recipes")
    public ResponseEntity<List<Recipe>> getAllRecipes(){
        List<Recipe> recipes = (List<Recipe>)recipeRepository.findAll();
        return new ResponseEntity<List<Recipe>>(recipes, HttpStatus.OK);
    }

    @PostMapping("/recipes")
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe){
        Recipe Recipe = recipeRepository.save(recipe);
        return new ResponseEntity<Recipe>(Recipe, HttpStatus.CREATED);
    }

    @PutMapping("/recipes")
    public ResponseEntity<Recipe> updateRecipe(@RequestBody Recipe Recipe){

        Optional<Recipe> RecipeOpt = recipeRepository.findById(Recipe.getId());
        if(RecipeOpt.isPresent()){
            if (null != Recipe.getDishType()){
                RecipeOpt.get().setDishType(Recipe.getDishType());
            }
            if (null != Recipe.getCookingSteps()){
                RecipeOpt.get().setCookingSteps(Recipe.getCookingSteps());
            }
            if(!Recipe.getIngredientList().isEmpty()){
                RecipeOpt.get().setIngredientList(Recipe.getIngredientList());
            }
            return new ResponseEntity<>(recipeRepository.save(RecipeOpt.get()), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/recipes/{id}")
    public ResponseEntity<Long> deleteRecipe(@PathVariable("id") Long id){
        Optional<Recipe> RecipeOpt = recipeRepository.findById(id);
        if(RecipeOpt.isPresent()){
            recipeRepository.delete(RecipeOpt.get());
            return new ResponseEntity<Long>(id, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Long>(id, HttpStatus.NOT_FOUND);
    }
}
