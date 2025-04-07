package view;
import controller.FilaController;
import java.util.Scanner;
public class mainchamado {

	public static void main(String[] args) {
		FilaController f = new FilaController();
		Scanner s= new Scanner(System.in);
		while(true) {
			System.out.println("\n### Sistema de Atendimento ###");
            System.out.println("1 - Adicionar senha prioritária");
            System.out.println("2 - Adicionar senha comum");
            System.out.println("3 - Chamar para atendimento");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = s.nextInt();
            s.nextLine(); 
            
            switch(opcao) {
            case 1:
            	System.out.print("Nome do cliente prioritário: ");
            	f.insertprioritario(s.nextLine());
            	break;
            case 2:
            	System.out.println("Nome do cliente comum: ");
            	f.insertcomum(s.nextLine());
            	break;
            case 3:
            	f.chamaratendimento();
            	break;
            case 4:
            	System.out.println("Encerrando sistema");
            	s.close();
            	return;
            }

		}
	}

}
