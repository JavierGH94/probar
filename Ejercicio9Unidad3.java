import java.util.Scanner;

public class Ejercicio9Unidad3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Dame numero");
		int numero= sc.nextInt();
		
		int valor2= numero%10; 
		int valor1= (numero-valor2)/10;  
		
		if(valor2%2==0) 
			System.out.println(valor2 + " es par");
		else
			System.out.println(valor2 + " NO es par");
		
		if(valor1%2==0) 
			System.out.println(valor1 + " es par");
		else
			System.out.println(valor1 + " NO es par");
		
		System.out.println("su media es: "+ ((valor1+valor2)/2));
	}

}
