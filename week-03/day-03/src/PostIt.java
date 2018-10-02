import java.awt.*;

public class PostIt {
        String backgroundColor;
        String text;
        String textColor;

        /*public PostIt (String backgroundColor, String text,String textColor) {
            this.backgroundColor = backgroundColor;
            this.text = text;
            this.textColor = textColor;
        }*/
        public void displayPostIts() {
            System.out.print(backgroundColor + ",   ");
            System.out.print(text + ",   ");
            System.out.println(textColor + ",   ");
            System.out.println();
        }

}
