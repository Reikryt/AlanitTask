package model;

 public class Kotik {
   private int prettiness;
   private int weight;
   private String name;
   private String meow;
   private int food;
   private static int totexampl = 0;


    public Kotik() {
        totexampl++;
    }

    public Kotik(int prettiness, int weight, String name, String meow,int food) {
        totexampl++;
        setPrettiness(prettiness);
        setWeight(weight);
        setName(name);
        setMeow(meow);
        setFood(food);
    }

     public static int getTotexampl() {
         return totexampl;
     }

     public void setFood(int food) {
         this.food = food;
     }

     public void setPrettiness(int prettiness) {
         this.prettiness = prettiness;
     }

     public int getWeight() {
         return weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getMeow() {
         return meow;
     }

     public void setMeow(String meow) {
         this.meow = meow;
     }


     public void setKotik(int prettiness, String name, int weight, String meow,int food) {
         setPrettiness(prettiness);
         setWeight(weight);
         setName(name);
         setMeow(meow);
         setFood(food);
    }
    public boolean play() {
        if (food>0){
            System.out.println(name + " Cat play whith game");
            return true;
        } else {
            System.out.println(name + " didn't play, give me food " +meow);
            return false;
        }


    }
    public boolean sleep() {
        if (food>0){
            System.out.println(name + " sleep zzZZZzzZZZz");
            return true;
        } else {
            System.out.println(name + " didn't sleep, give me food " +meow);
            return false;
        }
    }
    public boolean chaseMouse() {
        if (food>0){
            System.out.println(name + " attak!!!");
            return true;
        } else {
            System.out.println(name + " didn't chase, give me food " +meow);
            return false;
        }

    }
    public int eat(int totFood,String foodName) {
        food=food+totFood;
        System.out.println(name + " eating "+ foodName);
        return food;
    }

    public int eat(int totFood) {
        food=food+totFood;
        System.out.println(name + " eating faster");
        return food;
    }

    public int eat() {
        eat(2,"Fabia");
        return food;
    }

    public boolean jump() {
        if (food>0){
            System.out.println(name + " Cat jump on the chair");
            return true;
        } else {
            System.out.println(name + " didn't jump, give me food " +meow);
            return false;
        }

    }

    public boolean liveAnotherDay() {
        int lines = 24;
        for(int i = 0;i < lines;i++){
            double rand = Math.random()*7+1;
            int rand1 = (int) rand;
            switch (rand1) {
                case 1:
                    if (!jump()){
                        eat();
                    }
                    break;
                case 2:
                    eat();
                    break;
                case 3:
                    if (!chaseMouse()){
                        eat();
                    }
                    break;
                case 4:
                    if (!sleep()){
                        eat();
                    }
                    break;
                case 5:
                    if (!play()){
                        eat();
                    }
                    break;
                case 6:
                    eat(2);
                    break;
                case 7:
                    eat(1,"Kitikat");
                    break;
                default:
                    System.out.println("none case");
            }
        }
        return true;
    }
}

