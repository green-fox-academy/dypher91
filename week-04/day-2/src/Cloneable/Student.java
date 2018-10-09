package Cloneable;

public class Student extends Person implements Cloneable {

    String previousOrganization;
    int skippedDays;
    int numberOfDays;


    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student(){
        this.previousOrganization  = "The school of life";
        this.skippedDays = 0;

    }

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void introduce(){
        System.out.println(this.name +" "+ this.age+" "+this.gender+" "+this.previousOrganization);
                //super(toString());//+ "from "+previousOrganization+" who skipped "+skippedDays+" days from the course already.";
    }

    public int skipDays(int numberOfDays){
        return skippedDays +=numberOfDays;
    }

    public Student clone(){
        Student clone = new Student();

        clone.name=this.name;
        clone.age=this.age;
        clone.gender=this.gender;
        clone.previousOrganization=this.previousOrganization;
        return clone;
    }
}