package GreenFoxCompany;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {


//        GreenFoxCompany.Person Jane = new GreenFoxCompany.Person();
//        GreenFoxCompany.Student student = new GreenFoxCompany.Student();
//        GreenFoxCompany.Mentor mentor = new GreenFoxCompany.Mentor();

//      GreenFoxCompany.Person Pavel = new GreenFoxCompany.Person("Pavel", 27, "male");
//      System.out.println(Jane instanceof GreenFoxCompany.Person);
     // System.out.println(Jane);
//      System.out.println(Pavel);
//
       // Jane.introduce();
//      Pavel.getGoal();
       // student.introduce();
       // mentor.introduce();

        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();









    }
}
