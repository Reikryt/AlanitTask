import animals.Animal;
import animals.Harbivore;
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
    public void getVoiceAn(Animal animal){
        if (animal.getVoice()) {
            System.out.println(animal.getName() + " " + animal.voice(animal));;
        } else {
            System.out.println(animal.getName() + "this animal didn't voice");
        }

    }

}
