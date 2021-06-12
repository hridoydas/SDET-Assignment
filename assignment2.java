package assesment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		int data, i, sum=0;
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		System.out.print("Enter the size: ");
		Scanner n = new Scanner(System.in);
		
		data = n.nextInt();
		System.out.print("Enter Rank: ");
		for (i = 0; i < data; i++) {
			list.add(n.nextInt());
			
			list2.add(1);
		}
		System.out.println("Ranking List: " + list);
		// System.out.println("Initial: " + list2);
		
		 for (i=0; i< data-1; i++) {
			 if(list.get(i) > list.get(i+1)) {
				 
				 list2.set(i, list2.get(i)+1);
//				 System.out.println(list2);
			 }
			//  if(list.get(i) < list.get(i+1)){
			// 	list2.set(i+1, list2.get(i+1)+1);
			//  }
			 if(list2.get(i) == list2.get(i+1)) {
				 list2.set(i+1, list2.get(i+1)+1);			 
			 }
			
//			 System.out.println(list2);
		 }
		 
		 for (i=0; i<data; i++) {
			 sum += list2.get(i);
		 }
		 System.out.println("Total: "+ sum);
		 
		 
	}

}
