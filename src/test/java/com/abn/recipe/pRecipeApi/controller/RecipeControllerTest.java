package com.abn.recipe.pRecipeApi.controller;

import com.abn.recipe.pRecipeApi.model.Recipe;
import com.abn.recipe.pRecipeApi.repository.RecipeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class RecipeControllerTest {

    @InjectMocks
    private RecipeController recipeController;

    @Mock
    private RecipeRepository recipeRepository;

    List<Recipe> recipeList = null;
    Recipe recipe = null;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        recipeList = new ArrayList<>();

        recipe = new Recipe();
        recipe.setDishType("Vegetarian");
        recipeList.add(recipe);
    }

    @Test
    public void testCreateRecipe(){

        Recipe recipeEntity = new Recipe();
        recipeEntity.setDishType("NonVeg");
        Mockito.when(recipeRepository.save(recipeEntity)).thenReturn(recipeEntity);

        ResponseEntity<Recipe> re = recipeController.createRecipe(recipeEntity);
        Assert.assertEquals(201, re.getStatusCodeValue());
    }
    @Test
    public void testPutRecipe(){

        Recipe recipeEntity = new Recipe();
        recipeEntity.setNoOfPeople(9L);
        Mockito.when(recipeRepository.save(recipeEntity));

        ResponseEntity<Recipe> re = recipeController.updateRecipe(recipeEntity);
        Assert.assertEquals(200, re.getStatusCodeValue());
    }

    @Test
    public void testDeleteRecipe(){


        Recipe recipeEntity = new Recipe();
        recipeEntity.setDishType("NonVeg");

        Mockito.doNothing().when(recipeRepository).delete(recipeEntity);

        ResponseEntity<Long> responseEntity = recipeController.deleteRecipe(1L);

        Assert.assertEquals(HttpStatus.NO_CONTENT, responseEntity.getStatusCode());
    }
}
