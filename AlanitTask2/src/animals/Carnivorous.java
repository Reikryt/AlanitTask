package animals;

import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal {

    @Override
  public   boolean eat(Food food) {
        if (food instanceof Grass){
            System.out.println("i am eating");

            return true;

        } else {
            System.out.println("this animal didn't eat this");
            return false;
        }

    }
}
