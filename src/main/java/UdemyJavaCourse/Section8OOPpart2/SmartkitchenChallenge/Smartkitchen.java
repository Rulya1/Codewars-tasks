package UdemyJavaCourse.Section8OOPpart2.SmartkitchenChallenge;

public class Smartkitchen {
    private CoffeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    public Smartkitchen(){
        brewMaster = new CoffeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
    public void setKichenState(boolean coffeFlag , boolean fridgeFlag , boolean dishWashFlag){
        brewMaster.setHasWorktoDo(coffeFlag);
        iceBox.setHasWorktoDo(fridgeFlag);
        dishWasher.setHasWorktoDo(dishWashFlag);
    }
    public void doKichenWork(){
        brewMaster.brewCoffe();
        iceBox.orderFood();
        dishWasher.doDish();
    }
}

class CoffeMaker {
    private boolean hasWorktoDo;

    public void setHasWorktoDo(boolean hasWorktoDo) {
        this.hasWorktoDo = hasWorktoDo;
    }

    public void brewCoffe() {
        if (hasWorktoDo) {
            System.out.println("Brewing Coffe");
            hasWorktoDo = false;
        }
    }
}

class Refrigerator {
    private boolean hasWorktoDo;

    public void setHasWorktoDo(boolean hasWorktoDo) {
        this.hasWorktoDo = hasWorktoDo;
    }

    public void orderFood() {
        if (hasWorktoDo) {
            System.out.println("Ordering food");
            hasWorktoDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorktoDo;

    public void setHasWorktoDo(boolean hasWorktoDo) {
        this.hasWorktoDo = hasWorktoDo;
    }

    public void doDish() {
        if (hasWorktoDo) {
            System.out.println("Washing Dishesh");
            hasWorktoDo = false;
        }
    }
}
