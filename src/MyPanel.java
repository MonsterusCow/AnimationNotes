import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.lang.*;


public class MyPanel extends JPanel {
    static ArrayList xss = new ArrayList(1);
    static ArrayList yss = new ArrayList(1);
    static ArrayList < Ball > balls = new ArrayList < Ball > (1);
    int xLoc = 200;
    int yLoc = 300;
    int xadd = 1;
    int yadd = 1;
    int[] xpol;
    int[] ypol;
    Ball ball;
    int number;
    int size = (int)(Math.random() * 25) + 25;
    boolean yes;


    int ammount = 20;


    int bounces = 0;

    //constuctor


    public MyPanel() {
        setBackground(new Color(29, 102, 16));
        for (int i = 0; i < ammount; i++) {
            balls.add(new Ball(new Color((int)(Math.random() * 254), (int)(Math.random() * 254), (int)(Math.random() * 254)), (Main.frame.getWidth() / 2) + ((int)(Math.random() * 400) - 200), (Main.frame.getHeight() / 2) + ((int)(Math.random() * 400) - 200), size, size, (int)(Math.random() * 20) - 10, (int)(Math.random() * 20) - 10));
            size = (int)(Math.random() * 25) + 25;


        }
    }

    public boolean checkTop(int in1, int in2) {
        boolean checker = false;
        if (in1 != in2) {
            if (((((balls.get(in1).getSty()+balls.get(in1).getWid()/2) < (balls.get(in1).getSty()+balls.get(in1).getHei())) && ((balls.get(in1).getSty()+balls.get(in1).getWid()/2) > (balls.get(in2).getSty()))) && (()))
                    && ((balls.get(in1).getSty() < (balls.get(in2).getSty() + balls.get(in2).getHei())) && (balls.get(in1).getSty() > (balls.get(in2).getSty()))) && ((balls.get(in1).getStx() > balls.get(in2).getStx()) && (balls.get(in1).getStx() < (balls.get(in2).getStx() + balls.get(in2).getWid())))) {
                balls.get(in1).setYspeed(-(balls.get(in1).getYspeed()));
                balls.get(in2).setYspeed(-(balls.get(in2).getYspeed()));
                checker = true;
                bounces++;
            } else {
                if (((balls.get(in1).getSty()+balls.get(in1).getWid()/2) < ((balls.get(in2).getSty()+balls.get(in2).getHei()))) && ((balls.get(in1).getSty() < (balls.get(in2).getSty() + balls.get(in2).getHei())) && (balls.get(in1).getSty() > (balls.get(in2).getSty()))) && (((balls.get(in1).getStx() + balls.get(in1).getWid()) > balls.get(in2).getStx()) && ((balls.get(in1).getStx() + balls.get(in1).getWid()) < (balls.get(in2).getStx() + balls.get(in2).getWid())))) {
                    balls.get(in1).setYspeed(-(balls.get(in1).getYspeed()));
                    balls.get(in2).setYspeed(-(balls.get(in2).getYspeed()));
                    checker = true;
                    bounces++;
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
            if (((balls.get(in1).getStx()+balls.get(in1).getHei()/2) < (balls.get(in2).getStx()+balls.get(in2).getWid())) && ((balls.get(in1).getStx() < (balls.get(in2).getStx()+balls.get(in2).getWid())) && (balls.get(in1).getStx() > (balls.get(in2).getStx()))) && (((balls.get(in1).getSty()) > (balls.get(in2).getSty())) && ((balls.get(in1).getSty()) < (balls.get(in2).getSty()+balls.get(in2).getHei())))){
                balls.get(in1).setXspeed(-(balls.get(in1).getXspeed()));
                balls.get(in2).setXspeed(-(balls.get(in2).getXspeed()));
                checker = true;
                bounces++;


            } else {
                if (((balls.get(in1).getStx() < (balls.get(in2).getStx()+balls.get(in2).getWid())) && (balls.get(in1).getStx() > (balls.get(in2).getStx()))) && (((balls.get(in1).getSty()+balls.get(in1).getHei()) > (balls.get(in2).getSty())) && ((balls.get(in1).getSty()+balls.get(in1).getHei()) < (balls.get(in2).getSty()+balls.get(in2).getHei())))){
                    balls.get(in1).setXspeed(-(balls.get(in1).getXspeed()));
                    balls.get(in2).setXspeed(-(balls.get(in2).getXspeed()));
                    checker = true;
                    bounces++;


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
//                checkBottom(i, j);
                checkLeft(i, j);
//                checkRight(i, j);
            }
            balls.get(i).moveBall();
        }


        // g.setClor(Color.black);
        // g.fillOval(xLoc,yLoc,40,40);
        // xLoc = xLoc + xadd;
        // yLoc = yLoc + yadd;
        // if ((xLoc+40) >=  Main.frame.getWidth()){
        //     xadd = xadd*-1;
        // }
        // if ((xLoc) <= 0){
        //     xadd = xadd*-1;
        // }
        // if ((yLoc+40) <= Main.frame.getHeight()){
        //     yadd = yadd*-1;
        // }
        // if ((yLoc) >= 0){
        //     yadd = yadd*-1;
        // }


        g.drawString("Bounces: "+ bounces, Main.frame.getWidth()/2,Main.frame.getHeight()/2);
        g.setColor(Color.CYAN);


        //        xpol = new int[xss.size()];
        //        for(int i = 0; i<xss.size(); i++){
        //            xpol[i] = (int)(xss.get(i));
        //        }
        //        ypol = new int[yss.size()];
        //        for(int i = 0; i<yss.size(); i++){
        //            ypol[i] = (int)(yss.get(i));
        //        }
        //
        //
        //        Polygon poly = new Polygon(xpol,ypol,xss.size());
        //        g.drawPolygon(poly);
        //        g.fillPolygon(poly);


        try {
            Thread.sleep(20);
        } catch (Exception e) {
            System.out.println(e);
        }


        repaint();
    }
}

