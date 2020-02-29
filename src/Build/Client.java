package Build;

public class Client {
    public static void main(String[] args) throws Exception {
        MealBuilder mb = (MealBuilder) ProUtil.getBean();
        KFCWaiter waiter = new KFCWaiter();
        waiter.setMealBuilder(mb);
        Meal meal = waiter.construct();
        System.out.println("Ì×²Í×é³É£º");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}