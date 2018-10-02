import java.awt.*;

public class mainOfPostIt {
    public static void main(String[] args) {

       /* PostIt first = new PostIt("orange", "Idea1", "blue");
        PostIt second = new PostIt("pink", "Awesome", "black");
        PostIt third = new PostIt("yellow", "Superb", "green");

        System.out.println(second);
    }*/
        PostIt postIt1 = new PostIt();
        postIt1.backgroundColor = "orange";
        postIt1.text = "Idea 1";
        postIt1.textColor = "blue";
        PostIt postIt2 = new PostIt();
        postIt2.backgroundColor = "pink";
        postIt2.text = "Awesome";
        postIt2.textColor = "black";
        PostIt postIt3 = new PostIt();
        postIt3.backgroundColor = "yellow";
        postIt3.text = "Superb";
        postIt3.textColor = "green";

        postIt1.displayPostIts();
        postIt2.displayPostIts();
        postIt3.displayPostIts();
    }
}
