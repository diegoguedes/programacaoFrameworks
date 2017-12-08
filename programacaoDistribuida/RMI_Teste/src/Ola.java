import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Ola extends Remote {
	String showMsg(String msg) throws
	RemoteException;
	
	Pessoa mudarNomePessoa(Pessoa pessoa) throws
	RemoteException;
}

