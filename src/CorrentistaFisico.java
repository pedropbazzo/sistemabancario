
public class CorrentistaFisico extends Correntista {
	
	public CorrentistaFisico(String nome, Conta conta){
		super(nome,conta);
	}

	public void exibeIdentificacao() {
	System.out.println(getCodigo()+" - "+getNome()+" - "+getConta());
	System.out.println("=================================================================");
	}

}


/*System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
ContaFisica C1 = new ContaFisica();
C1.deposito(100);
C1.extrato();
C1.saque(101);*/