import java.util.*;
import java.sql.*;

public class MainOne{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String loop = "y";
		while(loop.equals("y")){
			System.out.println("\n********** STORE Management done by KUNAL *****************");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("\n Enter your choice:- ");
			StoreDetails sf = new StoreDetails();
			int a = sc.nextInt();
			switch(a){
				case 1:
						sf.registerUser();
						break;
				case 2:
						sf.login();
						break;
				default:
						System.out.println("Enter valid choice");


			
			}
			System.out.println("Do you want to continue :y/n");
			System.out.println("Do you want to exit : y/n");
			loop = sc.next();
		}



	}

}