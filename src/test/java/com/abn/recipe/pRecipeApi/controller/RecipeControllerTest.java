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

    List<Recipe> recipeEntityList = null;
    Recipe recipeEntity = null;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        recipeEntityList = new ArrayList<>();

        recipeEntity = new Recipe();

        recipeEntity.setDishType("Vegetarian");
        recipeEntityList.add(recipeEntity);
    }

//    @Test
//    public void test_create_recipe(){
//        Recipe recipeEntity = new Recipe();
//        recipeEntity.setDishType("Veg");
//        Mockito.when(recipeRepository.save(recipeEntity)).thenReturn(recipeEntity);
//        Long re = recipeController.createRecipe(recipeEntity);
//        Assert.assertEquals(201, 1L);
//    }


//    @Test
//    public void test_delete_recipe(){
//        Recipe recipeEntity = new Recipe();
//        recipeEntity.setDishType("Veg");
//        Mockito.doNothing().when(recipeRepository).delete(recipeEntity);
//        ResponseEntity<Long> responseEntity = recipeController.deleteRecipe(1L);
//        Assert.assertEquals(HttpStatus.NO_CONTENT, responseEntity.getStatusCode());
//    }
}
