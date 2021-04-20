# pRecipeApi
Its an application that provides API endpoints to carry out CRUD operations on recipe.
It also provides ingredients required for the recipe.

Implemented using Springboot, java, h2 in memory db
junit and mockito for unit testing
lombok annotations to reduce boilerplate code


#Run the project locally by following the below steps:
git checkout master
mvn clean install
cd target 
java -jar pRecipeApi-0.0.1-SNAPSHOT.jar

#Run the Heroku hosted instance:
Heroku can be used for demo application deployments as you can open a free account.
https://arcane-tundra-30470.herokuapp.com/v1/ingredients
https://arcane-tundra-30470.herokuapp.com/v1/recipes

#Postman Collection:
We can test the endpoints by running the collection. 
It helps with easy testing. 
