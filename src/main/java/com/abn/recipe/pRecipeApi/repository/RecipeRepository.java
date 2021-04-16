package com.abn.recipe.pRecipeApi.repository;



import com.abn.recipe.pRecipeApi.entity.Recipe;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {
}