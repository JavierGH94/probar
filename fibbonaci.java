import java.util.*;
public class fibbonaci {

	public static void main(String[] args) {
		int numAnterior=0;  // número anterior a fibonacci
		int numSiguiente=1; //número fibonacci
		int numGuardar=1; // variable de guardado
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Digame cuantos números de fibonnaci quiere");
		int numero= sc.nextInt();
		
		for(int i=0;i<numero;i++) {
			
			numSiguiente+=numAnterior; // aqui calculo el fibonacci
			numAnterior=numGuardar; // aqui tomo lo que habia en el fibonacci anteriormente		
			numGuardar=numSiguiente; // aqui guardo el fibonacci para darselo luego a numAnterior
			
			System.out.print(numAnterior+ " ");
			
		}
	}

}
