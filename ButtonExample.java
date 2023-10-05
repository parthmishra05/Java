import javax.swing.*;
public class ButtonExample{
    public static void main(String[] args){
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton("Click Here");
        JButton c=new JButton("OK");
        JButton d=new JButton("About Me");
    
        

        b.setBounds(50,100,95,30);
        c.setBounds(100,150,90,30);
         d.setBounds(150,200,100,30);
        f.add(b);
        f.add(c);
        f.add(d);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}