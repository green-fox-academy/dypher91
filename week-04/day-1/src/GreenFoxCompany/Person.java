package GreenFoxCompany;

public class Person {

    String name;
    int age;
    String gender;


    public Person(String name, int  age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public Person(){
        this("JaneDoe",30, "female");
    }

    public void introduce(){
        System.out.println("Hi, I'm "+this.name+ " a "+this.age+" year old "+this.gender+".");

    }

    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }

    @Override
    public String toString() {
        return "Hi, I'm "+this.name+" a "+this.age+"  year old "+this.gender+".";
    }



}
