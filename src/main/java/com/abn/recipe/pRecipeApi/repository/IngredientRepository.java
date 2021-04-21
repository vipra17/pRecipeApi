package com.abn.recipe.pRecipeApi.repository;



import com.abn.recipe.pRecipeApi.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}