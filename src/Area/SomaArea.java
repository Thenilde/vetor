package Area;

import java.util.Scanner;

public class SomaArea {

	public static void main(String[] args) {
   
		Scanner sc=new Scanner(System.in);
		int employeeNumber,timeWork;
		double  vPerHours,salary;
		
		
		System.out.println("Digite o employee number:");
		employeeNumber=sc.nextInt();
		
		System.out.println("Digite o time worked:");
		timeWork=sc.nextInt();
		
		System.out.println("Digite o valor per hours:");
		vPerHours=sc.nextDouble();
		
		salary=timeWork * vPerHours;
		System.out.println("Number of employee number :" + employeeNumber);
		System.out.printf("Salary somado US %.2f%n",salary);
		
		sc.close();
	}
}
