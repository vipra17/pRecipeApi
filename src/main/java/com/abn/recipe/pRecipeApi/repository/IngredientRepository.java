package com.abn.recipe.pRecipeApi.repository;



import com.abn.recipe.pRecipeApi.entity.Ingredient;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends PagingAndSortingRepository<Ingredient, Long> {
}