import javax.swing.*;
import java.awt.*;


public class Ball {

//test change
    private Color color;
    private int stx, sty;
    private int wid, hei;
    private int xspeed, yspeed;


    public Ball(){
        this.color = Color.BLACK;
        this.stx = Main.frame.getWidth()/2;
        this.sty = Main.frame.getHeight()/2;
        this.wid = 30;
        this.hei = 30;
        this.yspeed = 5;
        this.xspeed = 5;
    }


    public Ball(Color color, int stx, int sty, int wid, int hei, int xspeed, int yspeed){
        this.color = color;
        this.stx = stx;
        this.sty = sty;
        this.wid = wid;
        this.hei = hei;
        this.yspeed = yspeed;
        this.xspeed = xspeed;
    }


    public void makeBall(Graphics g){
        g.setColor(color);
        g.fillOval(stx,sty,wid,hei);
    }




    public void moveBall(){
        stx += xspeed;
        sty += yspeed;
    }




    public void checkIfWall(){
        if ((stx+wid) >=  Main.frame.getWidth()){
//            yspeed = (int)(Math.random() * 20)-10;
            xspeed = -xspeed;
        }
        if ((stx) <= 0){
//            yspeed = (int)(Math.random() * 20)-10;
            xspeed = -xspeed;
        }
        if ((sty+hei) >= Main.frame.getHeight()){
//            xspeed = (int)(Math.random() * 20)-10;
            yspeed = -yspeed;
        }
        if ((sty) <= 0){
//            xspeed = (int)(Math.random() * 20)-10;
            yspeed = -yspeed;
        }
    }


    public int getStx() {
        return stx;
    }


    public int getWid() {
        return wid;
    }


    public int getSty(){
        return sty;
    }


    public int getHei() {
        return hei;
    }


    public void setXspeed(int speed){
        xspeed = speed;
    }


    public void setYspeed(int speed){
        yspeed = speed;
    }


    public int getXspeed(){
        return xspeed;
    }


    public int getYspeed(){
        return yspeed;
    }


//    public int getTopLeft(int ind){
//        return MyPanel.balls.get(ind).getStx();
//    }
//    public int getBottomLeft(int ind){
//        return (MyPanel.balls.get(ind).getSty()+MyPanel.balls.get(ind).getHei());
//    }
//    public int getTopRight(int ind){
//        return (MyPanel.balls.get(ind).getStx()+MyPanel.balls.get(ind).getWid());
//    }
//    public int getBottomRight(int ind){
//        return ((MyPanel.balls.get(ind).getStx()+MyPanel.balls.get(ind).getWid())+MyPanel.balls.get(ind).getHei());
//    }
//    public void checkIfBall(){
//        for (Ball ball : MyPanel.balls) {
//
//        }
//    }
}

