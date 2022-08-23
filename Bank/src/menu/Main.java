package menu;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declarando as variáveis
		
		String nome, nascimento, cpf, usuario, senha, confirmarSenha;
		float dinheiro, valor;
		int op, select;
		boolean verificar = false;
		int posP = 0, posC = 0, qtdContas = 100, guardarPos = 0;
		
		//Criando os objetos
		
		Style s1 = new Style();
		
		
		//Criando o array e a lista, um para manipular no programa e outro para guardar todos os dados sem perdas
		
		Poupanca[] p1 = new Poupanca[qtdContas];
		Corrente[] c1 = new Corrente[qtdContas];
		
		for(int i = 0; i < c1.length; i++){
			p1[i] = new Poupanca();
			c1[i] = new Corrente();
		}
		List lista = new ArrayList();
		
		//Programa
		
		s1.chamarMenu();
		op = sc.nextInt();
		
		while(op!=0) {
			
			//Método Abrir Conta
			if(op == 1) {
				System.out.println("Insira seu nome: ");
				nome = sc.next();
				System.out.println("Insira sua data de nascimento: ");
				nascimento = sc.next();
				System.out.println("Insira seu CPF: ");
				cpf = sc.next();
				System.out.println("Escolha seu usuário: ");
				usuario = sc.next();
				System.out.println("Escolha sua senha: ");
				senha = sc.next();
				System.out.println("Confirme sua senha: ");
				confirmarSenha = sc.next();
				
				while(!senha.equals(confirmarSenha)) {
					System.out.println("SENHAS NÃO COINCIDEM!");
					System.out.println("");
					System.out.println("Escolha sua senha: ");
					senha = sc.next();
					System.out.println("Confirme sua senha: ");
					confirmarSenha = sc.next();
				}
				
				System.out.println("Estamos quase finalizando!");
				System.out.println("Selecione o tipo de conta: ");
				System.out.println("(1) - Conta Poupança || (2) Conta Corrente");
				select = sc.nextInt();
				
				if(select == 1) {
					//Abrindo conta poupança
					String tipo = "Conta Poupança";
					
					p1[posP].abrirConta(nome, nascimento, cpf, usuario, senha, tipo);
					posP++;
				}
				if(select == 2) {
				 //Abrindo conta corrente
					String tipo = "Conta Corrente";
					
					c1[posC].abrirConta(nome, nascimento, cpf, usuario, senha, tipo);
					posC++;
				}
				
			}
			
			//Método Fechar Conta
			if(op == 2) {
				System.out.println("Digite sua senha: ");
				senha = sc.next();
				
				System.out.println("Digite o tipo de conta: ");
				System.out.println("(1) - Conta Poupança || (2) Conta Corrente");
				select = sc.nextInt();
				
				if(select == 1) {
					for(int i = 0; i < p1.length; i++) {
						if(senha.equals(p1[i].getSenha()) && p1[i].getDinheiro() <= 0f) {
							p1[i].fecharConta();
							verificar = true;
							System.out.println("Conta encerrada!");
						}
					}
				}
				if(select == 2) {
					for(int i = 0; i < c1.length; i++) {
						if(senha.equals(c1[i].getSenha()) && c1[i].getDinheiro() <= 0f) {
							c1[i].fecharConta();
							verificar = true;
							System.out.println("Conta encerrada!");
						}
					}
				}
				if(!verificar) {
					System.out.println("Senha incorreta ou há saldo na conta!");
				}
			}
			
			//Método Sacar
			if(op == 3) {
				System.out.println("Digite sua senha: ");
				senha = sc.next();
				
				System.out.println("Digite o tipo de conta: ");
				System.out.println("(1) - Conta Poupança || (2) Conta Corrente");
				select = sc.nextInt();

				
				
				if(select == 1) {
					for(int i = 0; i < p1.length; i++) {
						if(senha.equals(p1[i].getSenha())) {
							System.out.println("Escolha o valor para sacar");
							valor = sc.nextFloat();
							
							if(p1[i].getDinheiro() >= valor) {
								p1[i].sacar(valor);
								verificar = true;
								System.out.println("Saque efetuado!");
							}
						}
					}
				}
				
				if(select == 2) {
					for(int i = 0; i < c1.length; i++) {
						if(!senha.equals(c1[i].getSenha())) {
							System.out.println("Escolha o valor para sacar");
							valor = sc.nextFloat();
							
							if(c1[i].getDinheiro() >= valor) {
								c1[i].sacar(valor);
								verificar = true;
								System.out.println("Saque efetuado!");
							}
						}
					}
				}

				if(!verificar) {
					System.out.println("Senha incorreta ou saldo insuficiente!");
				}
			}
			
			//Método Depositar
			if(op == 4) {
				System.out.println("Digite sua senha: ");
				senha = sc.next();
				
				System.out.println("Digite o tipo de conta: ");
				System.out.println("(1) - Conta Poupança || (2) Conta Corrente");
				select = sc.nextInt();
				
				if(select == 1) {
					for(int i = 0; i < p1.length; i++) {
						if(senha.equals(p1[i].getSenha())) {
							
							System.out.println("Escolha o valor para depositar");
							valor = sc.nextFloat();
							
							p1[i].depositar(valor);
							verificar = true;
							System.out.println("Depósito efetuado!");
						}
					}
				}
				if(select == 2) {
					for(int i = 0; i < c1.length; i++) {
						if(senha.equals(c1[i].getSenha())) {
							
							System.out.println("Escolha o valor para depositar");
							valor = sc.nextFloat();
							
							c1[i].depositar(valor);
							verificar = true;
							System.out.println("Depósito efetuado!");
						}
					}
				}
				if(!verificar) {
					System.out.println("Senha incorreta!");
				}
			}
			
			//Método Emprestar
			if(op == 5) {
				
				//Aqui o valor deverá ser pago em até um ano, será adicionado o valor/12 em cada mensalidade;
				
				System.out.println("Digite sua senha: ");
				senha = sc.next();
				
				System.out.println("Digite o tipo de conta: ");
				System.out.println("(1) - Conta Poupança || (2) Conta Corrente");
				select = sc.nextInt();						
				
				for(int i = 0; i < p1.length; i++) {
					if(select == 1) {
						if(senha.equals(p1[i].getSenha())) {
							if(p1[guardarPos].getEmprestimo()) {
								System.out.println("Essa conta já possui empréstimo ativo!");
								verificar = true;
								select = 3;
							}
						}
					}
					if(select == 2) {
						if(senha.equals(c1[i].getSenha())) {
							if(c1[guardarPos].getEmprestimo()) {
								System.out.println("Essa conta já possui empréstimo ativo!");
								verificar = true;
								select = 3;
							}
						}
					}
				}
				
				if(select == 1) {
					for(int i = 0; i < p1.length; i++) {
						if(senha.equals(p1[i].getSenha()) && !p1[i].getEmprestimo()) {
							
							System.out.println("Escolha o valor a ser emprestado");
							valor = sc.nextFloat();
							
							p1[i].emprestar(valor);
							verificar = true;
							p1[i].setEmprestimo(true);
							guardarPos = i;
							System.out.println("Empréstimo efetuado!");
						}
					}
				}
				if(select == 2) {
					for(int i = 0; i < c1.length; i++) {
						if(senha.equals(c1[i].getSenha()) && !c1[i].getEmprestimo()) {
							
							System.out.println("Escolha o valor a ser emprestado");
							valor = sc.nextFloat();
							
							c1[i].emprestar(valor);
							verificar = true;
							c1[i].setEmprestimo(true);
							guardarPos = i;
							System.out.println("Empréstimo efetuado!");
						}
					}
				}
				if(!verificar) {
					System.out.println("Senha incorreta!");
				}
			}
			
			//Método Pagar Mensalidade
			if(op == 6) {
				System.out.println("Digite sua senha: ");
				senha = sc.next();
				
				System.out.println("Digite o tipo de conta: ");
				System.out.println("(1) - Conta Poupança || (2) Conta Corrente");
				select = sc.nextInt();
				
				//Aqui o valor deverá ser pago em até um ano, será adicionado o valor/12 em cada mensalidade;
				
				if(select == 1) {
					for(int i = 0; i < p1.length; i++) {
						if(senha.equals(p1[i].getSenha()) && c1[i].getDinheiro() >= c1[i].getMensal()) {
							p1[i].pagarMensal();
							verificar = true;
							System.out.println("Mensalidade paga!");
						}
					}
				}
				if(select == 2) {
					for(int i = 0; i < c1.length; i++) {
						if(senha.equals(c1[i].getSenha()) && c1[i].getDinheiro() >= c1[i].getMensal()) {
							c1[i].pagarMensal();
							verificar = true;
							System.out.println("Mensalidade paga!");
						}
					}
				}
				if(!verificar) {
					System.out.println("Senha incorreta ou saldo insuficiente!");
				}
			}
			
			//Listar Contas
			if(op == 7) {
				for(int i = 0; i < c1.length; i++) {
					if(p1[i].getNome() != null) {
						p1[i].listarContas();
					}
					if(c1[i].getNome() != null) {
						c1[i].listarContas();
					}
						
				}
			}
			
			verificar = false;
			s1.chamarMenu();
			op = sc.nextInt(); 
		}	
	}
}
