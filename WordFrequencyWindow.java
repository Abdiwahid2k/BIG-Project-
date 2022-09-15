import javax.swing.*;  
import java.awt.event.*; 

public class WordFrequencyWindow implements ActionListener{
     
    JLabel wordsLabel,charsLabel;  
    JTextArea inputTextArea;  
    JButton calculate;  
    public WordFrequencyWindow() {  
        JFrame frame= new JFrame();  
         
        addCloseListener(frame);
         
        addFieldsToFrame(frame);
           
    } 
     
    public void addCloseListener(JFrame frame)
    {
        frame.addWindowListener(new WindowAdapter()
          {
             public void windowClosing(WindowEvent event)
             {
               frame.dispose();
               System.exit(0); 
             }
          });
    }
     
    public void addFieldsToFrame(JFrame frame)
    {
        wordsLabel=new JLabel();  
        wordsLabel.setBounds(50,25,100,30);  
        charsLabel=new JLabel();  
        charsLabel.setBounds(160,25,100,30);  
        inputTextArea=new JTextArea();  
        inputTextArea.setBounds(20,75,300,200);  
        calculate=new JButton("Calculate Word Frequency");  
        calculate.setBounds(50,300,200,30);  
        calculate.addActionListener(this);  
        frame.add(wordsLabel);
        frame.add(charsLabel);
        frame.add(inputTextArea);
        frame.add(calculate);  
        frame.setSize(450,450);
        frame.setLayout(null);  
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){  
        String text=inputTextArea.getText();  
        String words[]=text.split("\\s+");  
        wordsLabel.setText("Words: "+words.length);  
        charsLabel.setText("Characters: "+text.length());  
    }
 
}