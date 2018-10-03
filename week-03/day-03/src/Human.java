public class Human {
    String name;
    int age;
    int iq;


    public Human() {
        this("unkown", 0, 0);
    }


    @Override
    public String toString() {
        return this.name+" "+this.age+" "+this.iq;
    }

    public Human(String name, int age, int iq) {
        this.name = name;
        this.age =age;
        this.iq=iq;
    }

    public boolean isSmart(){
        return (iq > 100);
    }

    public boolean isNameless(){
        return (this.name.equals("unkown") || this.name.equals(""));
    }

    public void beSmarter(){
        this.iq += 20;
    }


    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human("Laci", 18, 110);
        //System.out.println(human2.name+" " +human2.name+" "+human2.iq); possibility of output

        System.out.println(human2); //with function toString, we can see normal output

        human.name ="KAREL";
        human.iq = 143;

        System.out.println(human.name);
        System.out.println(human.iq+" "+human2.name);

        if(human.isSmart()) {
            System.out.println(human.name + " is smart, with iq: " + human.iq);
        }

    }
}

