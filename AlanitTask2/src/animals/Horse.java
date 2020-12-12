package animals;

public class Horse extends Carnivorous implements Run,Voice {
    public Horse(String name,int age,int weight,int satiety,boolean voiceLogik) {
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
        return "Bror";
    }

    @Override
    public void swim() {

    }


}
