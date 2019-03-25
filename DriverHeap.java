package finalimplents;

import java.util.Scanner;

public class DriverHeap {

	public static void main(String[] args) {
		MaxHeap ob=new MaxHeap();
		Scanner sc=new Scanner(System.in);
		int choice;
		int f = 1;
		while(f==1) {
		System.out.println("1.insert element\n2.delete element\n3.getmax element\n4.traverse array\n5.exit ");
		System.out.println("please enter the choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("enter the element");
		          f=1;
		         Integer  value1=sc.nextInt();
		         ob.Insert(value1);
		           break;
		case 2:System.out.println(" Your deleted element is");
                  Integer x=(Integer)ob.Deletion();
                  f=1;
                  System.out.println(" "+x);
                  break;
		case 3:	
			ob.getMax();
			f=1;
		    break;
		
		case 4:
	     ob.traverseHeap();
	     f=1;
	     break;
		case 5:
			 f=2;
			 break;
		  
		}}


	}

}
