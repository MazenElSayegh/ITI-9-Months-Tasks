import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Image;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ball extends JFrame{

    Thread th;
    private int X,Y;
    JLabel imagelabel;
    ImageIcon image ;
    boolean flagX,flagy;
    
    
    public Ball(){
        
        this.setTitle("Ball Bounce");
        image = new ImageIcon( new ImageIcon("src/R.png").getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT));
        
       imagelabel = new JLabel(image, JLabel.CENTER);
       imagelabel.setIcon(image);
        imagelabel.setLocation(JLabel.CENTER,JLabel.CENTER);
        this.add(imagelabel,BorderLayout.CENTER);
        X=0;
        Y=0;
        flagX=true;
        flagy=true;
        th=new Thread(() -> {
            while (true) {
                
                if((flagX && 50+X<this.getWidth()/2)||X-50<-this.getWidth()/2){
                    X++;
                    flagX=true;
                }else{
                    X--;
                    flagX=false;
                }
                if((flagy && 50+Y<this.getHeight()/2)||Y-50<-this.getHeight()/2){
                    Y++;
                    flagy=true;
                }else{
                    Y--;
                    flagy=false;
                }
                

                
                imagelabel.setLocation(X,Y);
                this.repaint();
                
                try {
                    th.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        th.start();
    }
    public static void main(String[] args) {
        Ball app=new Ball();
        app.setBounds(0,50,600,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE );
        app.setVisible(true);
    }
    
}