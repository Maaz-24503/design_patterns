package Builder;

public class MealBuilder {
    public Meal beefBurgerMeal(Drink drink){
        Meal meal = new Meal(0.85f);
        meal.addItem(new BeefBurger());
        meal.addItem(drink);
        return meal;
    }
    public Meal vegBurgerMeal(Drink drink){
        Meal meal = new Meal(0.85f);
        meal.addItem(new VegBurger());
        meal.addItem(drink);
        return meal;
    }
}
