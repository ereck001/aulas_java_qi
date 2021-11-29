package view;

import java.util.Scanner;

import model.Locadora;

public class TesteLocadora {

	public static void main(String[] args) {
		char res = 'e';
		Scanner teclado = new Scanner(System.in);
		Locadora cliente = new Locadora();
		
		System.out.println("informe nome do cliente:");
		cliente.setNomeUsr(teclado.nextLine());
		System.out.println("informe a idade:");
		cliente.setIdade(teclado.nextInt());
		
		if(cliente.getIdade()>=18) {
			teclado.nextLine();
				do {
			System.out.println("O cliente possui cartão de crédito?(s/n)");
			res = teclado.next().charAt(0);
			}while(res != 's'&& res != 'n');
			if(res == 's') {
				cliente.setPossuiCartao(true) ;
			}else {
				cliente.setPossuiCartao(false)  ;
				System.out.println("O cliente precisa de cartão de crédito");
			}
			do {	if(cliente.isPossuiCartao()) {
					System.out.println("Qual o limite disponivel?(O limite do cartão deve ser maior que R$499,00)");
					cliente.setLimiteCartao(teclado.nextDouble());
				}
			}while(cliente.getLimiteCartao()< 500);	
			
			teclado.nextLine();
			System.out.println("informe telefone:");			
			cliente.setTelefone(teclado.nextLine());
			System.out.println("informe cpf:");
			cliente.setCpf(teclado.nextLine());
			
			do{
				System.out.println("informe a Cidade de retitrada do veículo:"
					+"\n[1]=> Porto Alegre"
					+ "\n[2]=> Canoas"
					+"\n[3]=> Novo Hamburgo"
					+"\n[4]=> Gramado"
					);
				cliente.setCidade(teclado.nextInt());
			}while(cliente.getCidade()< 1 || cliente.getCidade()> 4);
			do{
					System.out.println("informe o tipo de veículo:"
					+"\n[1]=> Executivo"
					+ "\n[2]=> Passeio"
					);
					cliente.setTipoNum(teclado.nextInt());
			}while(cliente.getTipoNum()!= 1 && cliente.getTipoNum()!=2 );
			teclado.nextLine();
			System.out.println("informe a marca do veículo:");
			cliente.setMarca(teclado.nextLine());	
			System.out.println("informe o modelo do veículo:");
			cliente.setModelo(teclado.nextLine());			
			System.out.println("informe o números de diarias:(no max 30 e no min 1)");
			cliente.setDiarias(teclado.nextDouble());
			
			System.out.println(cliente.toString());
		}else {
			System.out.println("O cliente precisa ser maior de idade para alugar um veículo");
		}

	}

}
