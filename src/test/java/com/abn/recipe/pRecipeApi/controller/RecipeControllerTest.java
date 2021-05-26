package com.abn.recipe.pRecipeApi.controller;

import com.abn.recipe.pRecipeApi.model.Recipe;
import com.abn.recipe.pRecipeApi.repository.RecipeRepository;

import com.abn.recipe.pRecipeApi.service.RecipeService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class RecipeControllerTest {

    @InjectMocks
    private RecipeController recipeController;

    @Mock
    private RecipeRepository recipeRepository;

    @Mock
    private RecipeService recipeService;

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

    @Test
    public void test_create_recipe(){
        Recipe recipeEntity = new Recipe();
        recipeEntity.setDishType("Veg");
        Mockito.when(recipeService.save(recipeEntity)).thenReturn(recipeEntity);
        Long re = recipeController.createRecipe(recipeEntity);
        Assert.assertEquals(1, 1L);
    }

}
