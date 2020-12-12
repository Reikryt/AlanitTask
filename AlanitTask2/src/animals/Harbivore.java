package animals;

import food.Food;
import food.Meat;

public abstract class Harbivore extends Animal {

    public Harbivore(){
        super();
    }

    @Override
   public boolean eat(Food food) {
        if (food instanceof Meat){
            System.out.println("i am eating");

            return true;

        } else {
            System.out.println("this animal didn't eat this");
            return false;
        }
    }

}
