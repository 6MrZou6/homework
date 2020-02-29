package Build;

public class MealBuilder {
    public Meal meal;

    public MealBuilder(){
        meal = new Meal();
    }


    public void buildFood(){
    }

    public void buildDrink(){
    }

    public Meal getMeal(){
        return meal;
    }

}