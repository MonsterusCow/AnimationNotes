import javax.swing.*;
import java.awt.*;


public class Ball {

//test change
    private Color color;
    private int stx, sty;
    private int wid, hei;
    private int xspeed, yspeed;
    private Ball lasthit;


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


    int lastWallTick = 0;
    int i1 = 1;
    int i2 = 1;
    int i3 = 1;
    int i4 = 1;
    public void checkIfWall(){
        if ((stx + wid) >= Main.frame.getWidth()) {
                if (MyPanel.tick - lastWallTick != i1) {
                    i1 = 1;
                    lastWallTick = MyPanel.tick;
                    yspeed = (int) (Math.random() * 20) - 10;
                    xspeed = -xspeed;
                } else {
                   i1++;
                }
        }
        if ((stx) <= 0){
            if (MyPanel.tick - lastWallTick != i2) {
                i2 = 1;
                lastWallTick = MyPanel.tick;
                yspeed = (int) (Math.random() * 20) - 10;
                xspeed = -xspeed;
            } else {
                i2++;
            }
        }
        if ((sty+hei) >= Main.frame.getHeight()){
            if (MyPanel.tick - lastWallTick != i3) {
                i3 = 1;
                lastWallTick = MyPanel.tick;
                xspeed = (int) (Math.random() * 20) - 10;
                yspeed = -yspeed;
            } else {
                i3++;
            }
        }
        if ((sty) <= 0){
            if (MyPanel.tick - lastWallTick != i4) {
                i4 = 1;
                lastWallTick = MyPanel.tick;
                xspeed = (int) (Math.random() * 20) - 10;
                yspeed = -yspeed;
            } else {
                i4++;
            }
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
    public void setLastHit(Ball ball)
    {
        lasthit = ball;
    }

    public Ball getLastHit(){
        return lasthit;
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

