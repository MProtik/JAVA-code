import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class frame extends Main{
        frame(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(690, 690);
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("MAYBE OR MAYBE NOT.png");
        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(new Color(0x2A2B44));
    }

}
