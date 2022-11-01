package utility;

import java.util.ArrayList;
import java.util.List;
import utility.Lista;

public class Dados {
	private String nome;
	private Double numero ;
	private Double saldo;	
	
		
	public Dados() { 
	 }
	 
	 public Dados(String nome, Double numero) {
		 this.nome = nome;
		 this.numero = numero;
		 
	 }
	 
	 public Double votos(Double saldo) {
		  return this.saldo += saldo;
	 }
	 
	 
	 
}
