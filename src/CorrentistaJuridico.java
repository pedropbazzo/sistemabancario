
public class CorrentistaJuridico extends Correntista {
	
	private String nomeResponsavel;
	
	public CorrentistaJuridico (String nome, String nomeResponsavel, Conta conta){
		super(nome,conta);
		this.nomeResponsavel = nomeResponsavel;
	}

	public void exibeIdentificacao() {
		System.out.println(getCodigo()+" - "+getNome()+" - "+getNomeResponsavel()+" - "+getConta());
		System.out.println("=================================================================");
		}
	
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
}
