import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main {
    static JFrame frame = new JFrame();
    public static void main(String[] args) throws Exception {


        frame.setBounds(500, 250, 1000, 1000);
        MyPanel panel = new MyPanel();


        frame.add(panel);


        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                MyPanel.xss.add((int)(MouseInfo.getPointerInfo().getLocation().getX()));
                MyPanel.yss.add((int)(MouseInfo.getPointerInfo().getLocation().getY()));
            }
        });


        frame.setVisible(true);


    }
}
