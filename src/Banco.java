import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author Fsociety
 */
	

public class Banco {
	
	private ArrayList<Correntista> listaDeClientes;
	
	public Banco() { // construtor 
		listaDeClientes = new ArrayList<Correntista>();
	}
	
	public ArrayList<Correntista> getListaDeClientes(){
		return listaDeClientes;
	}
	
	public void setListaDeClientes(ArrayList<Correntista> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}

	public void salvaClientela() throws IOException { // tratamento 
		File file = new File("database.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(Correntista c : listaDeClientes) {
			oos.writeObject(c); // persiste cliente no arquivo clientes.dat
		}
		
		oos.close();
	}
	
	public void leClientela() throws IOException, ClassNotFoundException { // tratamento 
		File file = new File("database.dat");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = null; // lê objetos um a um
		try {
			while((obj = ois.readObject()) != null) { // null  = EOF 
				this.listaDeClientes.add((Correntista)obj); // TypeCasting
			}
		}
		catch(EOFException e) {
			
		}
		finally {
			ois.close();
		}
		
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {		
		Banco banco = new Banco();
		
		CorrentistaFisico cf1 = new CorrentistaFisico("?", new ContaFisica());
		banco.getListaDeClientes().add(cf1);
		
		CorrentistaJuridico cj1 = new CorrentistaJuridico("?? ", "??? ", new ContaJuridica());
		banco.getListaDeClientes().add(cj1);
	
		try {
			banco.salvaClientela();
		}
		catch(IOException e) {
		}
		
		
		try {
		banco.leClientela();
		
		for(Correntista c : banco.getListaDeClientes()) {
			System.out.println(c.getNome());
		}
		
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}



	/*
		for(int i=0; i<list.size(); i++) {
			Correntista c = list.get(1);
			System.out.println(c.getNome());
		}
		
		System.out.println("\n");
		
	*/
