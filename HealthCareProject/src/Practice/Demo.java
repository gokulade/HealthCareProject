package Practice;

public class Demo {

	public static void main(String[]args) {
		
		int num=54748;    //1634   
		int i=0;
		int j;
		
		while(num>0) {
			
		j=num%10;
		i=j*j*j*j*j+i;
		num=num/10;
			
		}
		System.out.println(i);
		
		
	
	}
}
