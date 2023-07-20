package UdemyJavaCourse.Section8OOPpart2.BurgerChallengeOOPMaster;

public class MainBurger {
    public static void main(String[] args) {
       Item coke = new Item("drink" , "coke" , 1.5);
       coke.printItem();
       coke.setSize("LARGE");
       coke.printItem();
       Item avocado = new Item("Topping" , "avocado" , 1.5);
       avocado.printItem();
        System.out.println("__________________________________");
        Burger burger = new Burger("Regular" , 4.0);
        burger.addToppings("bacon" , "cheese" , "mayo");
        burger.printItem();
        System.out.println("____________________");
        MealOrder reguralmeal = new MealOrder();
        reguralmeal.addBurgerToppings("BACON" , "CHEESE" , "MAYO");
        reguralmeal.setDrinkSize("LARGE");
        reguralmeal.printItemezeList();
        System.out.println("-".repeat(30));
        MealOrder secondMeal = new MealOrder("Turkey" , "7-UP" , "chilli");
        secondMeal.addBurgerToppings("LETUCCE" , "CHEESE" , "MAYO");
        secondMeal.setDrinkSize("small");
        secondMeal.printItemezeList();
        System.out.println("-".repeat(30));
        MealOrder deluxeMeal = new MealOrder("deluxe" , "7-up" , "chili");
        deluxeMeal.addBurgerToppings("Avocado" , "huy" , "Bacon" , "Mayo" , "Cheese");
        deluxeMeal.setDrinkSize("small");
        deluxeMeal.printItemezeList();
    }
}
