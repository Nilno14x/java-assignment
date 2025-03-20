import java.util.*;

public class Q4 {
    public static int[] pub(int[] arr) {
        Stack<Integer> stc = new Stack<>();
        
        for (int asteroid : arr) {
            boolean destroyed = false;

            while (!stc.isEmpty() && stc.peek() >= 0 && asteroid < 0) {
                int top = stc.peek();
                
                if (Math.abs(top) == Math.abs(asteroid)) {
                    stc.pop();  
                    destroyed = true;
                    break;
                } else if (Math.abs(top) > Math.abs(asteroid)) {
                    destroyed = true;
                    break;
                } else {
                    stc.pop();  
                }
            }
            
            if (!destroyed) {
                stc.push(asteroid);
            }
        }

        int[] result = new int[stc.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stc.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {10, 2, -5};
        int res[] = pub(arr);
        
        System.out.println("The desired output is : ");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
