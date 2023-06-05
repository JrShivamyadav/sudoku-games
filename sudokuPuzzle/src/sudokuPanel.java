import javax.swing.*;
import java.awt.*;

public class sudokuPanel extends JPanel {
    private sudokuPuzzle puzzle;
 public sudokuPanel(){
     this.setPreferredSize(new Dimension(540,450));
     this.puzzle = sudokuGenerator.generateRandomSudoku(sudokuPuzzleType.NINEBYNINE);
     System.out.println(this.puzzle);

 }
    @Override
    protected void paintComponent (Graphics g){
     super.paintComponent(g);
     Graphics2D g2d =(Graphics2D) g;
     g2d.setColor(new Color(1.0f,1.0f,1.0f));

     g2d.fillRect(0,0,this.getWidth(),this.getHeight());

     g2d.setColor(new Color(0.0f,0.0f,0.0f));
     int slotWidth = this.getWidth()/9;
     int slotHeight = this.getHeight()/9;

     for (int x=0;x<= this.getWidth();x += slotWidth){
         if((x /slotWidth)% 3 ==0){
             g2d.setStroke(new BasicStroke(2));
             g2d.drawLine(x,0,x,this.getHeight());
         }
         else {
             g2d.setStroke(new BasicStroke(1));
             g2d.drawLine(x,0,x,this.getHeight());
         }
     }
      for( int y =0; y<=this.getHeight();y+=slotHeight){
          if((y /slotHeight)% 3 ==0){
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
