package animals;

public class Fish extends Harbivore implements Swim{

    public Fish(String name,int age,int weight,int satiety,boolean voiceLogik) {
        setName(name);
        setAge(age);
        setVoice(voiceLogik);
        setSatiety(satiety);
        setWeight(weight);
    }

    @Override
    public void swim() {
        System.out.println(getName()+" swiming....");

    }
}
