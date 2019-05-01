package BasicPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;

import java.util.TimerTask;

public class FrameTool extends JFrame {
    DroppedBlock dropBlock;
    private int mouseX=0;
    private int mouseY=0;
    private int setAccel=-60;
    private int frameWidth=1200;
    private int frameHeight=600;
    FrameTool(DroppedBlock dropBlock){
        this.dropBlock = dropBlock;
        initFrame(dropBlock);
    }

    public void initFrame(DropedBlock dropBlock){
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new ForTimer(), 500, 18);
        this.dropBlock = dropBlock;
        add(new Window());
        pack();
        add(this.dropBlock);
        setSize(frameWidth,frameHeight);
        this.dropBlock.setDatum(frameWidth,frameHeight);
        setTitle("Droped Box");

        addMouseListener(new ForMouseClass());
        addMouseMotionListener(new ForMouseClass());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.dropBlock.setxPosition(200);
    }

    void moveCycle () {
        repaint();
        mouseX=0;
        mouseY=0;
    }

    private class ForMouseClass implements MouseListener, MouseMotionListener{
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse Clicked");
            dropBlock.setAccel(setAccel);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse Pressed");
            dropBlock.setAccel(setAccel);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            dropBlock.setxPosition(e.getX());
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    private class ForTimer extends TimerTask{
        @Override
        public void run(){
            moveCycle();
        }
    }

    private class Window extends JComponent{ //didn't work, i don't know this. i have to learn more
        @Override
        public Dimension getPreferredSize(){
            return new Dimension(frameWidth,frameHeight);
        }
    }
}
