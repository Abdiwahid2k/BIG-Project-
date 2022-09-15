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
boolean pf = false;
boolean tf = false;
boolean lf = false;
String sizeString;
String num;
String price = "Amount Due: ";
String toppings = "";
DefaultListModel tops;
double tprice;
String listData[] = new String [3];
JScrollPane pain;

public Order(){

super ("");

p1 = new JPanel();

title = new JLabel("Welcome to the Java Diner!");
p1.add(title);

add(p1, BorderLayout.NORTH);

p2 = new JPanel();
p2.setLayout(new GridLayout(4,2));

size = new JLabel("Combo Size");
p2.add(size);

top = new JLabel("Vegetables");
p2.add(top);

b1 = new JRadioButton("Small: $3.00");
p2.add(b1);

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
total = 3.00;
sizeString = "Burger Size: Small";
}
});

c1 = new JCheckBox("Pickles");
p2.add(c1);

c1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(c1.isSelected()){
cheese = true;
}
else{
cheese = false;
}

if(cheese == true){
length++;
}
else{
length--;
}
}
});

b2 = new JRadioButton("Medium: $4.00");
p2.add(b2);

b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
total = 4.00;
sizeString = "Burger Size: Medium";
}
});

c2 = new JCheckBox("Tomatos");
p2.add(c2);

c2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(c2.isSelected()){
tomato = true;
}
else{
tomato = false;
}

if(tomato == true){
length++;
}

else{
length--;
}
}
});

b3 = new JRadioButton("Large: $5.00");
p2.add(b3);

b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
total = 5.00;
sizeString = "Combo Size: Large";
}
});

c3 = new JCheckBox("Lettuce");
p2.add(c3);

c3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(c3.isSelected()){
lettuce = true;

}
else{
lettuce = false;
}

if(lettuce == true){
length++;
}

else{
length--;
}
}
});

group = new ButtonGroup();
group.add(b1);
group.add(b2);
group.add(b3);

add(p2, BorderLayout.CENTER);

p3 = new JPanel();
p3.setLayout(new BorderLayout());
process = new JButton("Process Order");
p3.add(process, BorderLayout.NORTH);

process.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(cheese == true){
pf = true;
if( pf == true && tf == false && lf == false ){
toppings = toppings + "Pickles";
}
else{
toppings = toppings + ", Pickles";
}
}
if(tomato == true){
tf = true;
if((pf != true)&&(tf == true)&&(lf != true)){
toppings = toppings + "Tomato";
}
else{
toppings = toppings + ", Tomato";
}
}
if(lettuce == true){
lf = true;
if((pf != true)&&(tf != true)&&(lf == true)){
toppings = toppings + "Lettuce";
}
else{
toppings = toppings + ", Lettuce";
}
}

if (tf == true){
vegetables+= " Tomato";
}

if (lf == true){
vegetables+= ", Lettuce";
}else{
if (pf == true){
vegetables+= ", Pickles.";
}else{
vegetables+= ".";
}
}






tprice = 0.00 * length;

total = total + tprice;
num = Double.toString(total);

price = price + "$" + num;

listData [0] = sizeString;
listData [1] = vegetables;
listData [2] = price;

System.out.println(listData[0]);
System.out.println(listData[1]);
System.out.println(listData[2]);

}
});



JList<String> list = new JList<>();
list.setSelectedIndex(0);
list.setVisibleRowCount(3);
pain = new JScrollPane(list);

p3.add(pain, BorderLayout.SOUTH);

add(p3, BorderLayout.SOUTH);

}

public static void main(String[]args){

Order frame = new Order();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(350,220);
frame.setVisible(true);

while (true){
frame.repaint();
frame.revalidate();
}

}

}