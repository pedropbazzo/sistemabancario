import java.io.Serializable;

public interface Conta extends Serializable {
	
	public void extrato();
	public void saque (double valor);
	public void deposito (double valor);
	
	//cf = capital financiado n = meses
	public double simulaEmprestimo(double cf,int n);
	
	public double acrescentaEmprestimo(double valor);
	
}
