import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public static void main(String[] args) {
		Ola obj = null;
		String msg = "minha mensagem";
		Pessoa retorno = null;
		try {
			// obj = (Ola)Naming.lookup("//172.62.11.90/OlaServidor");
			Registry registry = LocateRegistry.getRegistry("172.16.1.166", 2001);
			obj = (Ola) registry.lookup("OlaServidor");
			
			Pessoa pessoa = new Pessoa("Diego",20);
			
			retorno = obj.mudarNomePessoa(pessoa);			
			
			System.out.println("O novo nome é "+retorno.getNome());
		} catch (Exception e) {
			System.out.println("Client exception: " + e.getMessage());
		}
	}
}
