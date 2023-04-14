import java.sql.ResultSet;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		conexao con = new conexao();
		System.out.println("Gostaria de criar um novo\n1)Cliente\t2)Caixa");
		int num = scanner.nextInt();		
		System.out.println("Prencha os dados de sua conta");
		System.out.print("Nome: ");
		String nome = scanner.next();
		System.out.print("Email: ");
		String email= scanner.next();		
		switch (num) {
		case 1:
		String sql =" Insert into cliente (id, nome , email)"+
					"values (default,"+"'"+nome+"'"+",'"+email+"'"+")";
		
		int res = con.excutaSql(sql);
		if(res>0) {
			System.out.println("Cadastrado com sucesso");
		}else {
			  System.out.println("Erro durante o cadastro");
			  		}
		break;
		case 2: String sql =" Insert into cliente (id, nome , email)"+
				"values (default,"+"'"+nome+"'"+",'"+email+"'"+")";
		
				int res = con.excutaSql(sql);
				if(res>0) {
					System.out.println("Cadastrado com sucesso");
				}else {
					System.out.println("Erro durante o cadastro");
		  		}
		break;
		}
		
		/*conexao con = new conexao();
		System.out.println("Nosso cliente cadastrados");
		String sql= "Select * from cliente";
		ResultSet rs= con.executaBusca(sql);
		
		try {
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome= rs.getString("nome");
				String email=rs.getString("email");
				System.out.println(id+" - "+nome+" - "+email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
		
	}

}
