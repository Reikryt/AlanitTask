package animals;

public class Elephant extends Carnivorous implements Voice, Run {


    public Elephant(String name,int age,int weight,int satiety,boolean voiceLogik) {
        setName(name);
        setAge(age);
        setVoice(voiceLogik);
        setSatiety(satiety);
        setWeight(weight);
    }

    @Override
    public void run() {

    }

    @Override
    public String voice(Animal animal) {
        return " Fryyyyyyy....";
    }

    @Override
    public void swim() {

    }


}
