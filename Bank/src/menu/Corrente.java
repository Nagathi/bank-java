package menu;

public class Corrente extends Conta {
	public int contaMensal = 0;
	Corrente(){
		this.setNome(null);
		this.setNascimento(null);
		this.setCpf(null);
		this.setUsuario(null);
		this.setSenha(null);
		this.setTipo("Conta Corrente");
		this.setDinheiro(500);
		this.setMensal(50f);
	}
	public void fecharConta() {
		this.setNome(null);
		this.setNascimento(null);
		this.setCpf(null);
		this.setUsuario(null);
		this.setSenha(null);
		this.setTipo("Conta Corrente");
	}
	public void abrirConta(String nome, String nascimento, String cpf, String usuario, String senha, String tipo) {
		this.setNome(nome);
		this.setNascimento(nascimento);
		this.setCpf(cpf);
		this.setUsuario(usuario);
		this.setSenha(senha);
	}
	public void sacar(float valor) {
		this.setDinheiro(this.getDinheiro() - valor);
	}
	public void depositar(float valor) {
		this.setDinheiro(this.getDinheiro() + valor);
	}
	public void emprestar(float valor) {
		this.setDinheiro(this.getDinheiro() + valor);
		this.setMensal(this.getMensal() + valor/12);
	}
	public void pagarMensal() {
		this.setDinheiro(this.getDinheiro() - this.getMensal());
		if(this.getEmprestimo()) {
			contaMensal++;
			if(contaMensal >= 12) {
				contaMensal = 0;
				this.setMensal(150);
				this.setEmprestimo(false);
			}
		}
	}
	public void listarContas() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nascimento: " + this.getNascimento());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Usuário: " + this.getUsuario());
		System.out.println("Senha: " + this.getSenha());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo: " + this.getDinheiro());
		System.out.println("Mensalidade: " + this.getMensal());
	}
}
