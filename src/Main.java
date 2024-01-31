import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main {
    static JFrame frame = new JFrame();
    public static void main(String[] args) {

        frame.setBounds(500, 250, 1000, 1000);
        MyPanel panel = new MyPanel();

        frame.add(panel);

        frame.setVisible(true);


    }
}
