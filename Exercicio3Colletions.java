package br.com.generation.colletions3;

public class Exercicio3Colletions {

	private String produto;
	private int quantidade;
	private double preco;
	private String codigo;
	
	public Exercicio3Colletions(String produto, int quantidade, double preco, String codigo) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.codigo = codigo;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Exercicio3Colletions [produto=" + produto + ", quantidade=" + quantidade + ", preco=" + preco
				+ ", codigo=" + codigo + "]";
	} 
	
	
	
	
}
