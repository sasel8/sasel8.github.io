
package nesne;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Nesne implements ActionListener {
JFrame dosya=new JFrame("Liste");
JTextField metin=new JTextField();
JLabel isim=new JLabel("isim:");
JButton buton=new JButton("kaydet");

JLabel blank=new JLabel(); 
FileWriter fileWriter;

Nesne(){
    
    GridLayout gri=new GridLayout();
    gri.setColumns(2);
    gri.setRows(3);
    
    dosya.setLayout(gri);
    
    buton.addActionListener(this);
    
    dosya.add(isim);
    dosya.add(metin);
    
    dosya.add(blank);
    dosya.add(buton);
    
    dosya.setSize(300, 200);
    dosya.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    dosya.setVisible(true);
    
    
}


  
    public static void main() {
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand()==buton.getActionCommand()){
            try{
                fileWriter=new FileWriter("odev.txt");
                fileWriter.write(isim.getText() + " : "+metin.getText());
               
                fileWriter.close();
                JOptionPane.showMessageDialog(null, "File Written Successfully");
            }
            catch(Exception e){ JOptionPane.showMessageDialog(null, e+"");}
        }
        
        
        
    }
    
}
