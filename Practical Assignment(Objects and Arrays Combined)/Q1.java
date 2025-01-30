
class test{
    
    public void get_in(int a,int b,int c){
        System.out.println("The sum of a + b + c = "+(a+b+c));
    }
    
    public void get_in(int a,float b,float c){
        System.out.printf("The sum of a + b + c = %.2f%n", (a + b + c));
    }
    
    public void get_in(float a,float b,double c){
        System.out.printf("The sum of a + b + c = %.2f%n", (a + b + c));
    }
    
}
public class Q1
{
	public static void main(String[] args) {
		test t1 = new test();
		t1.get_in(1,2,3);
		
		t1.get_in(2,3.1f,2.3f);
		
		t1.get_in(4.2f,1.9f,2.7);
	}
}