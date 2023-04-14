package lista2;
/*Um programa "Total de produtos" irá solicitar que o cliente digite quantos
produtos irá comprar. Depois, exibe a mensagem: "Parabéns por comprar x
produtos!", substituindo x pela quantidade.*/
import java.util.Scanner;
public class totalprodutos {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bem vindo");
		System.out.print("Quantos produtos gostaria de comprar? ");
		int pedido = s.nextInt();
		System.out.println("Parabéns por comprar "+pedido+" produtos");
		s.close();
	}

}
