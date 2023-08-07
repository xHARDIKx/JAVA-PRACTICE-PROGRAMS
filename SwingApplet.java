import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;


public class SwingApplet extends JFrame {
   private JLabel statusLabel;


   public SwingApplet() {
       super("Hello World Swing");


       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JPanel panel = new JPanel() {
           @Override
           protected void paintComponent(Graphics g) {
               super.paintComponent(g);
               g.setColor(Color.RED);
               g.drawString("Hello World", 50, 50);
           }
       };
       panel.setBackground(Color.WHITE);
       panel.setForeground(Color.BLACK);


       // Create the status label
       statusLabel = new JLabel("HARDIK");


       // Add the status label to the panel
       panel.add(statusLabel);


       add(panel);


       pack();
       setLocationRelativeTo(null);
   }


   public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
           SwingApplet swingApplet = new SwingApplet();
           swingApplet.setVisible(true);
       });
   }
}
