package up.edu.br.telas;

import java.util.Scanner;
import up.edu.br.modelos.Pessoa;

public class MostrarEnderecoEPessoa {
    
    Scanner ler = new Scanner(System.in);

    public void exibirMenu() {
        

        System.out.println("--------- MENU ---------");
        System.out.println("1 - Adicionar Pessoa");
        System.out.println("2 - Adicionar Endereço novo");
        System.out.println("3 - Listar Pessoas");
        System.out.println("4 - Remover Pessoa");
        System.out.println("5 - Sair");

        int opcao = ler.nextInt();
        ler.nextLine();

        switch (opcao) {
            case 1:
                
                System.out.println("-------------------------");
                adicionarPessoa();

                break;
            case 2:


                break;
            case 3:

            break;
            case 4:

            break;
            case 5:

            break;
        }
    }

        public void adicionarPessoa(){
            
            Pessoa objpessoa = new Pessoa();
        
        System.out.println("Digite o nome da pessoa: ");
        objpessoa.setNome(ler.nextLine());

        System.out.println("Digite o código da pessoa: ");
        objpessoa.setCodigo(ler.nextInt());
        ler.nextLine();

        System.out.println("Digite a cidade da pessoa: ");
        objpessoa.setCidade(ler.nextLine());

        System.out.println("Digite a rua da pessoa: ");
        objpessoa.setNome(ler.nextLine());
            
        
        }
}
