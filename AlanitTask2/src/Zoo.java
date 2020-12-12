import animals.*;
import food.Beef;
import food.Meat;
import food.Parsley;
import food.Pork;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Meat steak = new Beef(1);
        Pork chapters = new Pork(2);
        Parsley small = new Parsley(1);
        Worker dag = new Worker();
        Lion charli = new Lion("Travis",7,34,2,true);
        Horse joe = new Horse("Joe",14,74,3,false);
        Elephant zak = new Elephant("Zak",15,340,2,true);
        Falconiformes eagle = new Falconiformes("Eagle",5,6,1,false);

        charli.eat(small);
        dag.feed(chapters,charli);
        dag.feed(chapters,joe);
        dag.getVoiceAn(joe);
        dag.getVoiceAn(charli);
        dag.feed(chapters,zak);
        dag.feed(chapters,eagle);

        ArrayList<Animal> lake = new ArrayList<>();
        Fish fish = new Fish("Som",1,1,2,false);
        lake.add(fish);
        Duck duck = new Duck("DonaldDuck",10,4,1,true);
        lake.add(duck);
        for (Animal perm : lake) {
             perm.swim();
        }
        lake.get(0).eat(steak);
        lake.get(1).eat(steak);
    }
}
