
public class ContaFisica implements Conta{

	private double saldo = 0.0;
	
	//taxa de juros aplicada, constante
	public static final double I = 0.03;

	public void extrato() {
		System.out.println("Seu saldo é: "+ saldo);
	}

	public void saque(double valor) {
		if(valor > saldo) {
			System.out.println("Operação invalida");
		}
		else {
			saldo -= valor;
			System.out.println("Valor sacado: "+ valor);
		}
		}

	public void deposito(double valor) {
		if(valor < 1) {
			System.out.println("Operação invalida");
		}
		else {
			saldo += valor;
			System.out.println("Valor depositado: "+ valor);
		}
		}
	
	public double simulaEmprestimo(double cf, int n) {
		System.out.println("Simula Emprestimo: ");
		System.out.println("Credito solicitado: "+cf+" Dividido em: "+n+" Meses "+"Juros de 3% ao mês");
		System.out.println(n+" parcelas com valor de: "+ I/(1-1/Math.pow(1+I, n))*cf);
		System.out.println("Sua divida é: "+I/(1-1/Math.pow(1+I, n))*cf *(n));
		return I/(1-1/Math.pow(1+I, n))*cf;
		
		
	}
	
	public double acrescentaEmprestimo(double valor) {
		System.out.println("Valor adicionado a conta: "+ valor);
		return saldo += valor;
	}

	@Override
	public void consultaDivida() {
		// TODO Auto-generated method stub
		
	}

	}

