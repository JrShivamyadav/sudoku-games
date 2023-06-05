import javax.swing.*;
import java.awt.*;

public class sudokuGame extends JFrame {
    private  sudokuPanel sPanel;

    public sudokuGame() throws HeadlessException{
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("sudoku");
        this.setMinimumSize(new Dimension(400,600));

JMenuBar menuBar = new JMenuBar();
JMenu file = new JMenu("game");
JMenu newGame = new JMenu("New Game");
        JMenuItem sixintosix = new JMenuItem("6*6");
        JMenuItem nineintonine = new JMenuItem("9*9");
        JMenuItem twelveintotwelve = new JMenuItem("12*12");



menuBar.add(file);
file.add(newGame);
newGame.add(sixintosix);
newGame.add(nineintonine);
newGame.add(twelveintotwelve);
this.setJMenuBar(menuBar);

JPanel windowPanel = new JPanel();
windowPanel.setLayout(new FlowLayout());
windowPanel.setPreferredSize(new Dimension(800,900));

sPanel = new sudokuPanel();
windowPanel.add(sPanel);
this.add(windowPanel);
         }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                sudokuGame game = new sudokuGame();
                game.setVisible(true);
            }
        });

    }
}