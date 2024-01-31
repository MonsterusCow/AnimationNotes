import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.lang.*;


public class MyPanel extends JPanel {
    static ArrayList xss = new ArrayList(1);
    static ArrayList yss = new ArrayList(1);
    static ArrayList < Ball > balls = new ArrayList < Ball > (1);
    int size = (int)(Math.random() * 35) + 20;


    int ammount = 20;

    static int tick = 0;

    int bounces = 0;

    //constuctor


    public MyPanel() {
        setBackground(new Color(29, 102, 16));
        for (int i = 0; i < ammount; i++) {
            balls.add(new Ball(new Color((int)(Math.random() * 254), (int)(Math.random() * 254), (int)(Math.random() * 254)), (Main.frame.getWidth() / 2) + ((int)(Math.random() * 900) - 450), (Main.frame.getHeight() / 2) + ((int)(Math.random() * 900) - 450), size, size, (int)(Math.random() * 20) - 10, (int)(Math.random() * 20) - 10));
            size = (int)(Math.random() * 35) + 20;


        }
    }

    public boolean checkTop(int in1, int in2) {
        boolean checker = false;
        if (in1 != in2) {
                if (((((balls.get(in1).getSty() + balls.get(in1).getWid() / 2) < (balls.get(in1).getSty() + balls.get(in1).getHei())) && ((balls.get(in1).getSty() + balls.get(in1).getWid() / 2) > (balls.get(in2).getSty()))) && (((balls.get(in1).getStx() + balls.get(in1).getWid() / 2) < (balls.get(in2).getStx() + balls.get(in2).getWid())) && ((balls.get(in1).getStx() + balls.get(in1).getWid() / 2) > (balls.get(in2).getStx()))))
                        && ((balls.get(in1).getSty() < (balls.get(in2).getSty() + balls.get(in2).getHei())) && (balls.get(in1).getSty() > (balls.get(in2).getSty()))) && ((balls.get(in1).getStx() > balls.get(in2).getStx()) && (balls.get(in1).getStx() < (balls.get(in2).getStx() + balls.get(in2).getWid())))) {
                    balls.get(in1).setYspeed(-(balls.get(in1).getYspeed()));
                    balls.get(in2).setYspeed(-(balls.get(in2).getYspeed()));
                    checker = true;
                    if (balls.get(in1).getLastHit() != balls.get(in2)) {
                        bounces++;
                    }
                    balls.get(in1).setLastHit(balls.get(in2));
                } else {
                    if (((((balls.get(in1).getSty() + balls.get(in1).getWid() / 2) < (balls.get(in1).getSty() + balls.get(in1).getHei())) && ((balls.get(in1).getSty() + balls.get(in1).getWid() / 2) > (balls.get(in2).getSty()))) && (((balls.get(in1).getStx() + balls.get(in1).getWid() / 2) < (balls.get(in2).getStx() + balls.get(in2).getWid())) && ((balls.get(in1).getStx() + balls.get(in1).getWid() / 2) > (balls.get(in2).getStx())))) &&
                            ((balls.get(in1).getSty() + balls.get(in1).getWid() / 2) < ((balls.get(in2).getSty() + balls.get(in2).getHei()))) && ((balls.get(in1).getSty() < (balls.get(in2).getSty() + balls.get(in2).getHei())) && (balls.get(in1).getSty() > (balls.get(in2).getSty()))) && (((balls.get(in1).getStx() + balls.get(in1).getWid()) > balls.get(in2).getStx()) && ((balls.get(in1).getStx() + balls.get(in1).getWid()) < (balls.get(in2).getStx() + balls.get(in2).getWid())))) {
                        balls.get(in1).setYspeed(-(balls.get(in1).getYspeed()));
                        balls.get(in2).setYspeed(-(balls.get(in2).getYspeed()));
                        checker = true;
                        if (balls.get(in1).getLastHit() != balls.get(in2)) {
                            bounces++;
                        }
                        balls.get(in1).setLastHit(balls.get(in2));
//                    }
                }
            }
        }
        return checker;
    }

//    public void checkBottom(int in1, int in2){
//        if (in1 != in2) {
//            if ((((balls.get(in1).getSty() + balls.get(in1).getHei()) > (balls.get(in2).getSty())) && ((balls.get(in1).getSty()) + balls.get(in1).getHei()) < (balls.get(in2).getSty() + balls.get(in2).getHei())) && (((balls.get(in1).getStx()) < (balls.get(in2).getStx() + balls.get(in2).getWid())) && ((balls.get(in1).getStx()) > (balls.get(in1).getStx())))){
//                balls.get(in1).setYspeed(-(balls.get(in1).getYspeed()));
//            } else {
//                if (((((balls.get(in1).getSty() + balls.get(in1).getHei()) + balls.get(in1).getWid()) > (balls.get(in2).getSty())) && (((balls.get(in1).getSty() + balls.get(in1).getHei()) + balls.get(in1).getWid()) < (balls.get(in2).getSty() + balls.get(in2).getHei()))) && (((balls.get(in1).getStx()) < (balls.get(in2).getStx() + balls.get(in2).getWid())) && ((balls.get(in1).getStx()) > (balls.get(in1).getStx())))) {
//                    balls.get(in1).setYspeed(-(balls.get(in1).getYspeed()));
//                }
//            }
//        }
//    }


    public boolean checkLeft(int in1, int in2) {
        boolean checker = false;
        if (in1 != in2) {
//            if (balls.get(in1).getLastHit() != balls.get(in2)) {
                if (((balls.get(in1).getStx() + balls.get(in1).getHei() / 2) < (balls.get(in2).getStx() + balls.get(in2).getWid())) && ((balls.get(in1).getStx() < (balls.get(in2).getStx() + balls.get(in2).getWid())) && (balls.get(in1).getStx() > (balls.get(in2).getStx()))) && (((balls.get(in1).getSty()) > (balls.get(in2).getSty())) && ((balls.get(in1).getSty()) < (balls.get(in2).getSty() + balls.get(in2).getHei())))) {
                    balls.get(in1).setXspeed(-(balls.get(in1).getXspeed()));
                    balls.get(in2).setXspeed(-(balls.get(in2).getXspeed()));
                    checker = true;
                    if (balls.get(in1).getLastHit() != balls.get(in2)) {
                        bounces++;
                    }
                    balls.get(in1).setLastHit(balls.get(in2));
                } else {
                    if (((balls.get(in1).getStx() < (balls.get(in2).getStx() + balls.get(in2).getWid())) && (balls.get(in1).getStx() > (balls.get(in2).getStx()))) && (((balls.get(in1).getSty() + balls.get(in1).getHei()) > (balls.get(in2).getSty())) && ((balls.get(in1).getSty() + balls.get(in1).getHei()) < (balls.get(in2).getSty() + balls.get(in2).getHei())))) {
                        balls.get(in1).setXspeed(-(balls.get(in1).getXspeed()));
                        balls.get(in2).setXspeed(-(balls.get(in2).getXspeed()));
                        checker = true;
                        if (balls.get(in1).getLastHit() != balls.get(in2)) {
                            bounces++;
                        }
                        balls.get(in1).setLastHit(balls.get(in2));
//                    }
                }
            }
        }
        return checker;
    }


    //    public void checkRight(int in1, int in2){
//        if (in1 != in2) {
//            if ((((balls.get(in1).getStx()+balls.get(in1).getWid()) < ()) && (() > ())) && ((() < ()) && (() > ()))){
//                balls.get(in1).setXspeed(-(balls.get(in1).getXspeed()));
//            } else {
//                if (((() < ()) && (() > ())) && ((() < ()) && (() > ()))) {
//                    balls.get(in1).setXspeed(-(balls.get(in1).getXspeed()));
//                }
//            }
//        }
//    }




    @Override
    public void paintComponent(Graphics g) {


        super.paintComponent(g);
        for (Ball ball: balls) {
            ball.makeBall(g);
            ball.checkIfWall();
        }


        for (int i = 0; i < ammount; i++) {
            for (int j = 0; j < ammount; j++) {
                checkTop(i, j);
                checkLeft(i, j);
            }
            balls.get(i).moveBall();
        }

        g.setColor(Color.CYAN);
        g.drawString("Bounces off another ball: "+ bounces, Main.frame.getWidth()/2 - 60,Main.frame.getHeight()/2);

        tick++;
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            System.out.println(e);
        }


        repaint();
    }
}

