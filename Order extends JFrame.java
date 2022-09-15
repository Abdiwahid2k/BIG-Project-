import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
    
public class Order extends JFrame {


JLabel title;
JLabel size;
JLabel top;
JLabel orderSize;
JRadioButton b1;
JRadioButton b2;
JRadioButton b3;
JCheckBox c1;
JCheckBox c2;
JCheckBox c3;
JButton process;
ButtonGroup group;
JPanel p1;
JPanel p2;
JPanel p3;
double total;
boolean cb1 = false;
boolean cb2 = false;
boolean cb3 = false;
boolean cheese = false;
boolean tomato = false;
boolean lettuce = false;
String vegetables = "Vegetables: ";
double length = 0;
boole
