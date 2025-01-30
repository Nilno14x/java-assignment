import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int low = 0, high = n - 1, flag =-1 , k;

        System.out.println("Enter the values in sorted manner : ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value you want to search : ");
        k = sc.nextInt();


        while(low<=high){
            int mid = low + ((high - low ) /2);
            if(arr[mid] == k){
                flag = mid;
                break;
            }
            else{
                if(arr[mid] > k){
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        if(flag != -1)
            System.out.println("The Element is present at index number "+flag);
        else
            System.out.println("The Element is not present");

        sc.close();
    }
}
