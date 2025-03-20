import java.util.*;

public class Q3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the no of List : ");
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    boolean flag = false;
	    
		HashMap<Integer,Integer> tm = new HashMap<>();
		
		System.out.println("Enter the Array : ");
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		    if(tm.containsKey(arr[i])){
		        flag = true;
		    }
		    tm.put(arr[i],i);
		}
		if(flag)
		    System.out.println("Yes");
		else
		    System.out.println("No");
	}
}