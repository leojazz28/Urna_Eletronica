package utility;

public class Lista {
	private String nome;
	private Double numero ;
	private Double saldo;	
	
	public Lista() {
	}
	
	public Lista(String nome, Double numero,  Double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
}
