public class fibonaci {

	
	public static void main (String[] args){
	
	int num,num1,z;// criação de 3 variaveis 
	num=0;
	num1=1;
	
		System.out.print("0 1");// impressao de 0 e 1 na tela
			for(int i= 0; i<50; i++){ //o for controla a quantidade de números a serem exibidos o exemplo foi de 50
				System.out.print(" " + (num+num1));
				z=num;
				num=num1;
				num1=z+num;
		}
		
	}
}
