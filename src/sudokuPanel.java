import javax.swing.*;
import java.awt.*;

public class sudokuPanel extends JPanel {
    public sudokuPanel(){
        this.setPreferredSize(new Dimension(250,350));
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics g2d = (Graphics2D) g;
        g2d.setColor(new Color(1.0f,1.0f,1.0f));

        g2d.fillRect(0,0,this.getWidth(),this.getHeight());

        g2d.setColor(new Color(0.0f,0.0f,0.0f));
        int slotWidth = this.getWidth()/9;
        int slotHeight = this.getHeight()/9;

        for(int x=0; x<=this.getWidth();x += slotWidth){
            if (( x /slotWidth)%3 ==0){
                g2d.setStroke(new BasicStroke(2));
                g2d.drawLine(x,0,x,this.getWidth());
            }
            else {
                g2d.setStroke(new BasicStroke(1));
                g2d.drawLine(x,0,x,this.getHeight());
            }
        }
        for (int y =0;y<=this.getHeight();y += slotHeight){
            if (( y /slotWidth)%3 ==0){
                g2d.setStroke(new BasicStroke(2));
                g2d.drawLine(0,y,this.getWidth(),y);
            }
            else {
                g2d.setStroke(new BasicStroke(1));
                g2d.drawLine(0,y,this.getWidth(),y);
            }
        }
    }


}
