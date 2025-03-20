import java.util.*;

public class Q1
{
    public static int max_squ(int[][] arr){
        int height[] = new int[arr[0].length];
        int max = 0;
        
        for(int i = 0; i < arr.length; i++){
            for(int j=0 ; j<arr[0].length; j++){
                height[j] = arr[i][j] == 1 ? height[j] + 1 : 0; // to sepearte the block when it get 0
            }
            max = Math.max(max,sum_height(height));
        }
        
        return max;
    }
    
    public static int sum_height(int[] arr){
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int area[] = new int[arr.length];
        int max = 0;
        
        Stack<Integer> stack1 = new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            
            while(!stack1.empty() && arr[stack1.peek()] >= arr[i])
                stack1.pop();
            
            if(stack1.empty()){
                left[i] = -1;
            }
            else{
                left[i] = stack1.peek();
            }
            stack1.push(i);
        }
        
        while(!stack1.empty())
            stack1.pop();
        
        for(int i = arr.length - 1 ; i>= 0 ; i--){
            while(!stack1.empty() && arr[stack1.peek()] >= arr[i]){
                stack1.pop();
            }
            
            if(stack1.empty())
                right[i] = arr.length;
            else
                right[i] = stack1.peek();
                
            stack1.push(i);
        }
        
        for(int i = 0 ;i<arr.length;i++){
            area[i] = (right[i] - left[i] - 1) * arr[i];
            max = Math.max(max,area[i]);
        }
        
        return max;
    }
    
    
	public static void main(String[] args) {
		
		int[][] arr = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
		
		int max = max_squ(arr);
		System.out.println(max);
	}
}