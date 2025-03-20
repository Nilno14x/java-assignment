import java.util.*;

public class Q2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the no of List : ");
	    int n = sc.nextInt();
	    
	    int key;
	    String value;
	    
		TreeMap<String,Integer> tm = new TreeMap<>();
		System.out.println("Enter the list with their Key : ");
		for(int i=0;i<n;i++){
		    key = sc.nextInt();
		    value = sc.nextLine();
		    tm.put(value,key);
		}
		
		System.out.println(" The Output : ");
		System.out.println(tm);
	}
}