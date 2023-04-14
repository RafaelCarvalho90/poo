package pedra_papel_tesoura;
import java.util.Scanner;
import java.util.Random;


//papel ganha de pedra e perde tesoura
//tesoura ganha de papel e perde pedra
//pedra ganha tesoura e perde papel
public class Pedra_papel_tesoura {

	public static void main(String[] args) {
		inicio();
		
	}
		public static void inicio() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tEscolha uma das opções abaixo:\n");
		System.out.println("1)Pedra\t2)Papel\t3)Tesoura");
		int escolha = sc.nextInt();
			Random n= new Random();
		if (escolha>3) {
			System.out.println("Escolha invalida");
			limpa();
			inicio();
		}
			if (escolha==1) {System.out.println("\nVocê escolheu: Pedra");}
			if (escolha==2) {System.out.println("\nVocê escolheu: Papel");}
			if (escolha==3) {System.out.println("\nVocê escolheu: Tesoura");}
		int maquina = n.nextInt(2)+1;
		if (maquina==1) {System.out.println("\nSeu adversário escolheu: Pedra\n");}
		if (maquina==2) {System.out.println("\nSeu adversário escolheu: Papel\n");}
		if (maquina==3) {System.out.println("\nSeu adversário escolheu: Tesoura\n");}
		//System.out.println("Seu adversário escolheu: "+ maquina);
			if (escolha==maquina) {
				System.out.println("Empate");
			};
			if(escolha==1 & maquina==2){
				System.out.println("Você perdeu!!");	
			};
			if(escolha==1 & maquina==3){
				System.out.println("Você ganhou!!");	
				};
			if(escolha==2 & maquina==1){
				System.out.println("Você ganhou!!");
			};
			if(escolha==2 & maquina==3){
				System.out.println("Você perdeu!!");
			};
			if(escolha==3 & maquina==1){
				System.out.println("Você perdeu!!");
			};
			if(escolha==3 & maquina==2){
				System.out.println("Você ganhou!!");
			};
			System.out.println("\nDeseja jogar novamente?");
			System.out.println("1)SIM\t2)NÃO");
			int fim= sc.nextInt();
			switch (fim) {
			case 1: limpa();
			inicio();
			; 
				
			case 2: break;
			}
			sc.close();
		}
	
	public static void limpa() {
		for(int i=1;i<14;i++)
			System.out.println("\n ");
		
	}

}
