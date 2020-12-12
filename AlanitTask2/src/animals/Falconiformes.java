package animals;

public class Falconiformes extends Harbivore implements Fly,Voice{

    public Falconiformes(String name,int age,int weight,int satiety,boolean voiceLogik) {
        setName(name);
        setAge(age);
        setVoice(voiceLogik);
        setSatiety(satiety);
        setWeight(weight);
    }

    @Override
    public void fly() {

    }

    @Override
    public String voice(Animal animal) {
        return null;
    }

    @Override
    public void swim() {

    }


}
