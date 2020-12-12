package animals;

public class Duck extends Harbivore implements Fly,Swim,Voice {


    public Duck(String name,int age,int weight,int satiety,boolean voiceLogik) {
        setName(name);
        setAge(age);
        setVoice(voiceLogik);
        setSatiety(satiety);
        setWeight(weight);
    }

    @Override
    public void fly() {
        System.out.println(getName()+" flying...");

    }

    @Override
    public void swim() {
        System.out.println(getName()+" swim in lake");

    }

    @Override
    public String voice(Animal animal) {
        return " Krya, krya....";
    }



}
