package animals;


public class Lion extends Harbivore implements Run, Voice {
    public Lion(String name,int age,int weight,int satiety,boolean voiceLogik) {
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
        return "RRRRRrrrrrrrrrr";
    }

    @Override
    public void swim() {

    }


}
