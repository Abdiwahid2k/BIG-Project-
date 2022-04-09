import java.util.Scanner;

class GreaterThanOperator{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 2 numbers to see which is greater: ");
		int num1=in.nextInt();
		int num2=in.nextInt();
		if(num1>num2){
		System.out.println("num1 is greater");
		}
		else{
		System.out.println("num2 is greater");
		}
      
	}
}
