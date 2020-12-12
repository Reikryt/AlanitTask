import animals.*;
import food.Food;

public class Worker {


    public void feed (Food food, Animal animal) {
        if (animal instanceof Harbivore) {

            animal.eat(food);
           animal.setSatiety(animal.getSatiety()+food.getNutritional());
            System.out.println(animal.getName()+" "+ animal.getSatiety());
        }else {
            animal.eat(food);
            animal.setSatiety(animal.getSatiety()+food.getNutritional());
            System.out.println(animal.getName()+" "+ animal.getSatiety());
        }
    }
    public void getVoiceAn(Voice animal){
       if (animal instanceof Lion) {
           System.out.println("Lion " + animal.voice((Animal) animal));
       } else if (animal instanceof Duck) {
           System.out.println("Duck " + animal.voice((Animal) animal));
       }else if (animal instanceof Elephant) {
           System.out.println("Elephant " + animal.voice((Animal) animal));
       }else if (animal instanceof Horse) {
           System.out.println("Horse " + animal.voice((Animal) animal));
       }else {
            System.out.println("this animal didn't voice");
        }
    }

}
