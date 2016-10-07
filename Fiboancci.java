public class fibonaci {

	
	public static void main (String[] args){
	
	int num,num1,z;
	num=0;
	num1=1;
	
		System.out.print("0 1");
			for(int i= 0; i<50; i++){
				System.out.print(" " + (num+num1));
				z=num;
				num=num1;
				num1=z+num;
		}
		
	}
}
