import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize(){
        return new Dimension(1560, 700);
    }

    private int x = 0;
    private int y = 0;

    private int width = 100;
    private int height = 100;

    public void paint(Graphics g){
        super.paintComponent(g);

        //Draw Text
        //g.drowString("This is my custom Panel!, 10, 20);

        g.drawLine(x, y, width, height);
    }
}
