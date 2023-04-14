package lista1;
import java.util.Scanner;

public class termometro {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		System.out.println("Conversor de temperatura");
		System.out.print("Digite a temperatura desejada em C°:");
		float temp = s.nextFloat();
		float calc = (float) (temp *1.8+32);
		System.out.println("A temperatura convertida é: "+calc);
		s.close();
	}
}
