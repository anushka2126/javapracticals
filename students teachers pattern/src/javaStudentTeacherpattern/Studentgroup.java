package javaStudentTeacherpattern;
import java.util.Scanner;
public class Studentgroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// For taking the input 
		System.out.println("Enter the Rollno to find the group");
		int RollNo = sc.nextInt();
		//To find the group 4 
		if (RollNo%4==0)
		{
			System.out.println("Emerald");
		}
		//To find the group 3
		else if(RollNo%2==0)
		{
			System.out.println("Perl");
		}
		//To find the group 2
		else if(RollNo%3==0)
		{
			System.out.println("Ruby");
		}
		//To find the group 1
		else
		{
			System.out.println("Sapphire");
		}
	}
}
