import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class OlaImpl extends UnicastRemoteObject implements Ola {
	public OlaImpl() throws RemoteException {
		super(); 
	}
	public String showMsg(String msg) {
		System.out.println("msg: " + msg);
		return("msg enviada"); 
	}
	
	public Pessoa mudarNomePessoa(Pessoa pessoa) throws RemoteException {
		pessoa.setNome("Sr. (a)"+pessoa.getNome());
		
		return pessoa;
	}
		
	
	public static void main(String args[]) {
		try { 
			OlaImpl obj = new OlaImpl();
			//Naming.rebind("OlaServidor", obj);
			Registry registry = LocateRegistry.createRegistry(2001);
		    registry.rebind("OlaServidor", obj);
			System.out.println("Servidor carregado no registry");
		} catch (Exception e) {
			System.out.println("OlaImpl erro: " + e.getMessage());
		}
	}
	
}

