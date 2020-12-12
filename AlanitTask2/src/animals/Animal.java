package animals;

import food.Food;

public abstract class Animal {
   private String name;
   private int age;
   private int weight;
   private int satiety;
   private boolean voiceLogik;



  public abstract boolean eat(Food food);
  public abstract String voice(Animal animal);
  public abstract void swim();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public boolean getVoice() {
        return voiceLogik;
    }

    public void setVoice(boolean voiceLogik) {
        this.voiceLogik = voiceLogik;
    }

}
