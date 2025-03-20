import java.util.*;

public class Q4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element in array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		TreeMap<Integer,Integer>tm = new TreeMap<>();
		
		System.out.print("Enter the Array: ");
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		    tm.put(arr[i],i);
		}
		
		System.out.println(tm.lastEntry().getKey());
	}
}