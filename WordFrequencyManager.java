import javax.swing.*;    
import java.awt.event.*; 
 

public class WordFrequencyManager {
 
 
    public static void main(String[] args) {    
        JFrame calculatorFrame=new JFrame("Word Frequency Calculator");    
         //final JLabel usernameLabel = new JLabel();            
         //usernameLabel.setBounds(20,150, 200,50);  
         final JPasswordField passwordField = new JPasswordField();   
         passwordField.setBounds(100,75,100,30);   
         JLabel usernameLabel=new JLabel("Username:");    
           usernameLabel.setBounds(20,20, 80,30);  
             
            JLabel passwordLabel=new JLabel("Password:");    
            passwordLabel.setBounds(20,75, 80,30);    
            final JTextField usernameField = new JTextField();  
            usernameField.setBounds(100,20, 100,30);
            JButton loginButton = new JButton("Login");  
            loginButton.setBounds(100,120, 80,30);    
               
                     
                     
                    calculatorFrame.add(usernameLabel);
                    calculatorFrame.add(usernameField); 
                    calculatorFrame.add(passwordLabel);
                    calculatorFrame.add(passwordField); 
                    calculatorFrame.add(loginButton); 
                    calculatorFrame.setSize(300,300); 
                    calculatorFrame.setLayout(null);    
                    calculatorFrame.setVisible(true);     
                    loginButton.addActionListener(new ActionListener() {  
                    public void actionPerformed(ActionEvent e) {       
                       WordFrequencyWindow window = new WordFrequencyWindow();
                    }  
                 });   
    }
  
 
}