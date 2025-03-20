import java.util.*;

public class Q5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the RansomNote String : ");
		String str1 = sc.nextLine();
		System.out.print("Enter the Magazine String : ");
		String str2 = sc.nextLine();
		
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		
		HashMap<Character,Integer>tm = new HashMap<>();
		
		for(int i=0;i<c2.length;i++){
		    if(tm.containsKey(c2[i])){
		        tm.put(c2[i],tm.get(c2[i]) + 1);
		    }
		    else
		        tm.put(c2[i],1);
		}
		
		int count = c1.length;
		
		for(int i=0;i<c1.length;i++){
		    if(tm.containsKey(c1[i]) && tm.get(c1[i]) > 0){
		        tm.put(c1[i],tm.get(c1[i])- 1);
		        count -= 1;
		    }
		}
		if(count == 0){
		    System.out.println("True");
		}else{
		    System.out.println("False");
		}
		
	}
}