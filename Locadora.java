package model;

public class Locadora {
	private String nomeUsr, telefone, cpf, marca,modelo,tipo;
	private int idade,cidade,tipoNum;	
	private double diarias,limiteCartao;
	private boolean possuiCartao;
	
	public String getNomeUsr() {
		return nomeUsr;
	}
	public int getTipoNum() {
		return tipoNum;
	}
	public void setTipoNum(int tipoNum) {
		this.tipoNum = tipoNum;
	}
	public void setNomeUsr(String nomeUsr) {
		this.nomeUsr = nomeUsr;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getLimiteCartao() {
		return limiteCartao;
	}
	public void setLimiteCartao(double limiteCartao) {
		this.limiteCartao = limiteCartao;
	}
	public double getDiarias() {
		return diarias;
	}
	public void setDiarias(double diarias) {
		this.diarias = diarias;
	}
	public int getCidade() {
		return cidade;
	}
	public void setCidade(int cidade) {
		this.cidade = cidade;
	}
	public boolean isPossuiCartao() {
		return possuiCartao;
	}
	public void setPossuiCartao(boolean possuiCartao) {
		this.possuiCartao = possuiCartao;
	}
	private String qualCidade() {
		switch(this.cidade) {
		case 1: return "Porto Alegre";
		case 2: return  "Canoas";
		case 3: return  "Novo Hamburgo";
		case 4: return  "gramado";
		default: return"valor inválido";
		}
	}
	private String qualTipo() {
		switch(this.tipoNum) {
		case 1: return "Executivo";
		case 2: return  "Passeio";		
		default: return"valor inválido";
		}
	}
	
	public double calcular() {
		double aux,taxaServiço;
		 
		if(idade > 24) {
			
			aux = (this.diarias -1)* 29 + 189.34;
			taxaServiço = aux * 12/100;
			
			
		}else {			
			aux = (this.diarias -1)* 35 + 189.34;;
			taxaServiço = aux * 15/100;
		}
		return aux + taxaServiço;
	}
	public String toString() {
		return "Cliente: "+ this.nomeUsr+
				" idade: "+this.getIdade()+" anos"+
				" CPF: "+this.getCpf()+
				"\ntelefone: "+this.telefone+
				"\nCidade de retirada: "+ qualCidade()+
				"\nVeículo "+this.marca+" "+this.modelo+
				" do tipo "+qualTipo()+
				"\nNúmero de diárias: "+this.diarias+
				"\nO valor total será de R$"+ this.calcular();
	}
	
}

