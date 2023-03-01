package entities;

public class Carro {
	
	String cor;
	String fabricante;
	String modelo;
	int ano;
	
	public Carro(String modelo, String fabricante, String cor, int ano) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.cor = cor;
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return "Modelo: " + this.modelo + 
				" | Fabricante: " + this.fabricante + 
				" | Cor: " + this.cor + 
				" | Ano: " + this.ano;
	}

}
