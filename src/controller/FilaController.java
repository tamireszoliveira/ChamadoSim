package controller;
import model.queue;
public class FilaController {
	private queue<Cliente> filaPrioritarios;
	private queue<Cliente> filaComuns;
	private int contsenha;
	
	
	private class Cliente{
		int numero;
		String nome;
		
		public Cliente(int numero, String nome) {
			this.numero= numero;
			this.nome = nome;
		}
		@Override
		public String toString() {
			return "Senha: " + numero + " - Cliente: " + nome;
		}
	}
	public FilaController(){
		filaPrioritarios = new queue<>();
		filaComuns = new queue<>();
		contsenha = 1;
	}
	
	public void insertprioritario(String nome) {
		filaPrioritarios.insert(new Cliente(contsenha++, nome));
		System.out.println("Senha prioritária gerada!");
	}
	
	public void insertcomum(String nome) {
		filaComuns.insert(new Cliente(contsenha++, nome));
		System.out.println("Senha comum gerada!");
	}
	
	public void chamaratendimento() {
		int chamadasPrioritarias = 0;
		while(chamadasPrioritarias < 3 && !filaPrioritarios.isEmpty()) {
			try {
				System.out.println("atender prioritario " + filaPrioritarios.remove());
				chamadasPrioritarias++;
			}catch(Exception e) {
				System.out.println("Erro");
			}
		}
		if(!filaComuns.isEmpty()) {
			try {
				System.out.println("Atendendo comum: " + filaComuns.remove());
			}catch(Exception e) {
				System.out.println("Erro");
			}
		}else if(filaPrioritarios.isEmpty()) {
            System.out.println("Nenhum cliente na fila!");

		}
	}
}
