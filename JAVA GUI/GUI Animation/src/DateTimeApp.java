import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DateTimeApp extends JFrame implements Runnable
{Thread th;
 Date d=new Date();
 JLabel timelabel=new JLabel();
 public DateTimeApp()
   {
    this.setTitle("Date&time");
    timelabel.setHorizontalAlignment(JLabel.CENTER);
    timelabel.setText(d.toString());
    this.add(timelabel,BorderLayout.CENTER);
    th=new Thread(this);
    th.start();
   }
   public static void main(String []args)
    {DateTimeApp app=new DateTimeApp();
     app.setBounds(50,50,600,400);
     app.setVisible(true);
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   public void run()
   {while(true)
    {
     d=new Date();
     timelabel.setText(d.toString());
       try {
           Thread.sleep(1000);
       } catch (InterruptedException ex) {
           Logger.getLogger(DateTimeApp.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   }
}