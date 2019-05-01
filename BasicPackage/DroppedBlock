package BasicPackage;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;

public class DroppedBlock extends JPanel {
    private int datumX;
    private int datumY;
    private int xPosition;
    private int yPosition;
    private int blockHeight=100;
    private int blockWidth=100;
    private int blockWeight=10;
    private int gravity=1;
    private int acceleration=0;
    private int tmpx=0;
    private int tmpy=0;
    private int tmpaccel=0;
    DropedBlock() {

    }

    public void initBlock(){

    }

    public void initLines(Graphics g){
        for(int i=100; i<datumY; i=i+100){
            g.drawLine(0,i,100,i);
            g.drawString(i+"",0,i);
        }
    }

    public void paint(Graphics g){
        super.paint(g);
        drawBlock(g);
        drawBlock2(g);
        initLines(g);
        effectGravity();
        if(tmpx!=xPosition||tmpy!=yPosition||tmpaccel!=acceleration) {
            System.out.println("Y Position : " + yPosition + " Accel : " + acceleration);
            tmpx=xPosition;
            tmpy=yPosition;
            tmpaccel=acceleration;
        }
    }

    public void drawBlock(Graphics g){
        g.drawRect(xPosition,yPosition,blockWidth,blockHeight);
    }
    public void drawBlock2(Graphics g){ g.drawRect(0,datumY-blockHeight* 2,blockWidth,blockHeight);}

    public void setDatum(int x,int y){
        datumX = x;
        datumY = y-40;
    }

    public void effectGravity(){
        if((yPosition<=datumY-blockHeight)||(acceleration>0))
        {
            acceleration=acceleration+(gravity*blockWeight);
            yPosition=yPosition+acceleration;
        }
        if(yPosition>=datumY+1-blockHeight){
            yPosition=datumY-blockHeight;
        }
        accelCheck();
    }

    public void accelCheck(){
        if((acceleration!=0)&&(yPosition==datumY-blockHeight)){
            acceleration=acceleration*(-1);
        }

    }
    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
        repaint();
    }

    public  void setxPosition(int xPosition){
        this.xPosition=xPosition;
        repaint();
    }

    public void setAccel(int acceleration){
        this.acceleration = acceleration;
    }

    public void setBlockWeight(int weight){
        this.blockWeight=weight;
    }
    public void setxyPosition(int xPosition, int yPosition){
        this.xPosition =xPosition;
        this.yPosition =yPosition;
    }
    public void setGravity(int i){
        this.gravity = i;
    }

}
