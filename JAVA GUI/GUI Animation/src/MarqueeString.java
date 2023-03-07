//package movinglabel;

import java.awt.BorderLayout;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MarqueeString extends JFrame implements Runnable {
    
   private JLabel label;
   Thread th ;
   int x ;
   
   public MarqueeString() {
      setTitle("Banner App");
      label= new JLabel("MAZEN");
      add(label, BorderLayout.CENTER);
      setVisible(true);
      th = new Thread (this);
      th.start();
   }
   
    public static void main(String[] args) {
        MarqueeString app = new MarqueeString();
        app.setBounds(50,50,600,400);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {
        while(true){
        label.setLocation(x%label.getSize().width,label.getY());
        x+=20;
        
       try {
           Thread.sleep(500);
       } catch (InterruptedException ex) {
           Logger.getLogger(MarqueeString.class.getName()).log(Level.SEVERE, null, ex);
       }
      }
    }
    
}