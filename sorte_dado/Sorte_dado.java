package sorte_dado;
import java.util.Scanner;
import java.util.Random;

public class Sorte_dado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos lados deverá ter o dado a ser jogado?\n");
		int l= sc.nextInt();	
	for(int i=10;i>0;i--) {
		System.out.println("Tente sua sorte, chances restantes: "+i+"\n");
		System.out.println("Tente acertar o lado do dado\t\taperte 0 para sair\n");
		int lancdado = sc.nextInt();
	Random n = new Random();
	int dado = n.nextInt(l)+1;
		if(lancdado==0) {
			System.out.println("Até breve");
			break;
		}
		else {
			if (lancdado==dado) {
				System.out.println("Parabéns você acertou ^~^\n");
				System.out.println("Fim de jogo");
				break;}
		else {
			System.out.println("Infelizmente você errou -.-");
			if(i==0) {
				System.out.println("Fim de jogo");
				break;}
	};
	}
	}
	sc.close();
	}

}
