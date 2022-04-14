import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;




public class InputMenu
{
public void display_menu()
{
System.out.println("1) Dasani\n2) SmartWater\n3) La Croix");
System.out.print("Selection: ");
}


public void question()
{
System.out.println("Would you like to drink water?");
System.out.println("To drink water enter 9.");
System.out.println("To exit enter 0.");


Scanner q = new Scanner(System.in);

switch (q.nextInt())
{
case 0:
System.out.println ("Thank you and goodbye.");
break;

case 9:
System.out.println ( "You have drank water");
break;

default:
System.err.println ( "Unrecognized option" );
break;
}
}

public InputMenu()
{
Scanner in = new Scanner(System.in);
display_menu();

switch (in.nextInt())
{
case 1:
System.out.println ( "You picked Dasani" );
question();
break;

case 2:
System.out.println ( "You picked SmartWater" );
question();
break;

case 3:
System.out.println ( "You picked La Croix ");
question();
break;

default:
System.err.println ( "You did not pick one of the three options" );
break;
}
}

public static void main (String[]args)
{
new InputMenu();





ImageIcon water = new ImageIcon("water.png");

JOptionPane.showMessageDialog(null,"STAY HYDRATED","Display Image",JOptionPane.INFORMATION_MESSAGE,water);
}
}

