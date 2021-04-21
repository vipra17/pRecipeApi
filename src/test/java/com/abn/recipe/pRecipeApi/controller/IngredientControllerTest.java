package com.abn.recipe.pRecipeApi.controller;

import com.abn.recipe.pRecipeApi.model.Ingredient;
import com.abn.recipe.pRecipeApi.repository.IngredientRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class IngredientControllerTest {

    @InjectMocks
    private IngredientController ingredientController;
    @Mock
    private IngredientRepository ingredientRepository;

    List<Ingredient> ingredients = null;

    @Before
    public void init(){
        ingredients = Arrays.asList(
                new Ingredient("Pasta", "Whole wheat pasta"),
                new Ingredient("Pesto", "Fresh Basil Pesto"),
                new Ingredient("Olive Oil", "Virgin olive oil")
        );
    }

    @Test
    public void test_get_all_ingredients_whenFound(){

        Mockito.when(ingredientRepository.findAll()).thenReturn(ingredients);

        List<Ingredient> ingredientList = (List<Ingredient>) ingredientController.getAllIngredients();
        Assert.assertEquals(3, ingredientList.size());
    }

    @Test
    public void test_empty_ingredients_whenNotFound(){

        Mockito.when(ingredientRepository.findAll()).thenReturn(new ArrayList<>());

        List<Ingredient> ingredientList = (List<Ingredient>) ingredientController.getAllIngredients();
        Assert.assertEquals(0, ingredientList.size());
    }
}
