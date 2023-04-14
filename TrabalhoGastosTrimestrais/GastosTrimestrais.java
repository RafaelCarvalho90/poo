package trabalho04_04_2023;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GastosTrimestrais {

	public static void main(String[] args) {
		inicio();	
	}
	public static void inicio(){
	Scanner sc = new Scanner(System.in);
	System.out.println("+------------------------------------------------------+");
	System.out.println("|Bem vindo ao sistema de controle de Balanço Financeiro|");
	System.out.println("+------------------------------------------------------+");
	System.out.println("Qual o periodo que gostaria de solicitar?");
	System.out.println("1)Janeiro\t2)Fevereiro\t3)Março\t   4)Trimestral\t0)Sair");
	int option = sc.nextInt();
	
	switch (option) {
	case 1: GastoJaneiro();
	break;
	case 2: GastoFevereiro();
	break;
	case 3: GastoMarco();
	break;
	case 4: GastoTrimestral();
	break;
	case 0: System.out.println("Muito obrigado por usar o programa"+"\n");
	break;
	case 5: ;
	default: System.out.println("Opção inválida, tente novamente\n");
	}
	sc.close();
	}
	private static double GastoJaneiro() {
		
		double gastJaneiro = 15000.00;
		DecimalFormat formato = new DecimalFormat("R$ #,###.00");
	    System.out.println("O valor de Janeiro é " + formato.format(gastJaneiro));
		return (gastJaneiro);
	}
	private static double GastoFevereiro() {
		double gastFevereiro = 23000.00;
		DecimalFormat formato = new DecimalFormat("R$ #,###.00");
	    System.out.println("O valor de Fevereiro é " + formato.format(gastFevereiro));
		return (gastFevereiro);
	}
	private static double  GastoMarco() {
		double  gastMarco =  17000.00;
		DecimalFormat formato = new DecimalFormat("R$ #,###.00");
	    System.out.println("O valor de Março é " + formato.format(gastMarco));
		return (gastMarco);
	}
	private static double GastoTrimestral() {
		double gastTrimestre = GastoJaneiro()+GastoFevereiro()+GastoMarco();
		DecimalFormat formato = new DecimalFormat("R$ #,###.00");
	    System.out.println("O valor Trimestral é " + formato.format(gastTrimestre));
		return (gastTrimestre);
	}
	public static void Aguarde() {
	
	}
	
}
