package menu;

public class Conta {
	private String nome;
	private String nascimento;
	private String cpf;
	private String usuario;
	private String senha;
	private String tipo;
	
	private float dinheiro;
	private float mensal;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}
	public float getMensal() {
		return mensal;
	}
	public void setMensal(float mensal) {
		this.mensal = mensal;
	}
	
	public void abrirConta(String nome, String nascimento, String cpf, String usuario, String senha, String tipo) {
		//Override
	}
	public void fecharConta() {
		//Override
	}
	public void sacar(float valor) {
		//Override
	}
	public void depositar(float valor) {
		//Override
	}
	public void emprestar(float valor) {
		//Override
	}
	public void pagarMensal() {
		//Override
	}
	public void listarContas() {
		//Override
	}
}
