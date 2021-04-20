package com.abn.recipe.pRecipeApi.repository;



import com.abn.recipe.pRecipeApi.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}