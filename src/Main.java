
import java.util.ArrayList;

/**
 * @author Fsociety
 */

public class Main {

	public static void main(String[] args) {
		ArrayList<Correntista> listaDeClientes = new ArrayList<Correntista>();
		
		CorrentistaFisico cf1 = new CorrentistaFisico("?", new ContaFisica());
		listaDeClientes.add(cf1);
		
		CorrentistaFisico cf2 = new CorrentistaFisico("?? ", new ContaFisica());
		listaDeClientes.add(cf2);

		CorrentistaJuridico cj1 = new CorrentistaJuridico("??? ", "???? ", new ContaJuridica());
		listaDeClientes.add(cj1);
		
		CorrentistaJuridico cj2 = new CorrentistaJuridico("????? ", "?????? ", new ContaJuridica());
		listaDeClientes.add(cj2);	
		
		
		cf1.exibeIdentificacao();
		cf2.exibeIdentificacao();
		cj1.exibeIdentificacao();
		cj2.exibeIdentificacao();
		
//simula empréstimo não é método do correntista e sim da sua conta. 
//é necessário obter a conta através do getConta. Após obter o objeto getConta
//Agora sim podemos chamar o método simulaEmprestimo 
		
		cf1.getConta().extrato();
		cf1.getConta().deposito(50);
		cf1.getConta().saque(25);
		cf1.getConta().acrescentaEmprestimo(5000);
		cf1.getConta().extrato();
		cf1.getConta().simulaEmprestimo(1000, 12);
		
		System.out.println("\n=============================== \n");
		
		cj1.getConta().extrato();
		cj1.getConta().deposito(50);
		cj1.getConta().saque(25);
		cj1.getConta().acrescentaEmprestimo(5000);
		cj1.getConta().extrato();
		cj1.getConta().simulaEmprestimo(1000, 12);
		

		
	}
}



/*Criar variável para armazenar valor da parcela 
 * 
		double valorParcela = cf1.getConta().simulaEmprestimo(1000, 12);
		System.out.println(valorParcela);

/*System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
ContaFisica C1 = new ContaFisica();
C1.deposito(100);
C1.extrato();
C1.saque(101);*/
