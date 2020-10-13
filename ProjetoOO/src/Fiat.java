
public class Fiat extends Veiculo {
	
	public Fiat(String mensagem) {
		System.out.println(mensagem);
	}
	
	public Fiat() {
		System.out.println("Teste de Construtor");
	}


	@Override
	public String marca() {
		return "Uno";
	}
	
	public String marca(String marcaPersonalizada) {
		return marcaPersonalizada;
	}

	@Override
	public String rodas() {
		return "4 rodas";
	}
	
}
