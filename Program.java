/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
/**
 *
 * @author Nick
 */
public class Program extends JFrame implements MouseListener{
    JFrame ovals = new JFrame();
    int numO;
    public Program(){
        ovals.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ovals.setSize(400,400);
        JLabel start = new JLabel("Click me");
        ovals.add(start);
        ovals.addMouseListener(this);
        ovals.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String numS= (String)JOptionPane.showInputDialog(null ,"Enter number of ovals:", "Input", JOptionPane.QUESTION_MESSAGE);
        numO = Integer.parseInt(numS);
        if(numO>20){
            numO=20;
           
            ovals.repaint();
        }
        if(numO<=0){
            numO=0;
        }
    }
    public void drawOvals(Graphics g){
        int x=20;
        int y=30;
        int width=30;
        int height=20;
        for(int i=0;i<=numO;i++){
            g.setColor(Color.RED);
            g.drawOval(x,y,width,height);
            x+=10;
            y+=10;
            width+=10;
            height+=5;
            
        }
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        drawOvals(g);
    }

    public static void main(String []args){
        Program new1= new Program();
        new1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new1.setSize(400,400);
        new1.setVisible(true);
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
