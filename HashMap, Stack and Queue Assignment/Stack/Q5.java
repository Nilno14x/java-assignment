import java.util.*;

public class Q5 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] nge = new int[n]; // Default initialized to 0
        Stack<Integer> st = new Stack<>(); 

        // Move from left to right
        for (int i = 0; i < n; i++) {
            
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int index = st.pop();
                nge[index] = i - index; 
            }
            
            st.push(i);
        }
        
        return nge;
    }

    public static void main(String[] args) {
        int[] a = {73,74,75,71,69,72,76,73};
        System.out.println("The desired output is: ");
        
        int[] arr = dailyTemperatures(a);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}