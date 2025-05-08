import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public Menu() {
        Scanner input = new Scanner(System.in);
        List<Disciplina> disciplinas = new ArrayList<>();
        List<Estudante> estudantes = new ArrayList<>();

        System.out.println("---------- MENU ----------\n");
        System.out.println("1 - Cadastrar\n2 - Deletar\n3 - Editar\n4 - Listar\n5 - Sair\n");
        System.out.print("Escolha uma opcao: ");
        int choice = input.nextInt();
        input.nextLine();

        if (input.hasNextInt()) {
            while (true) {
                switch (choice) {
                    case 1:
                        System.out.println("1 - Disciplinas\n2 - Estudantes\n3 - Estudantes em uma disciplina\n");
                        choice = input.nextInt();
                        input.nextLine();
                        if(input.hasNextInt()) {
                            switch (choice) {
                                case 1: //Cadastrar disciplina
                                    System.out.print("Qual o nome da disciplina? ");
                                    String nomeDisciplina = input.nextLine();
                                    System.out.print("Qual a carga horaria da disciplina? ");
                                    String cargaHoraria = input.nextLine();
                                    if(!input.hasNextInt()) System.out.println("Entrada errada!");
                                    disciplinas.add(new Disciplina(nomeDisciplina, Integer.parseInt(cargaHoraria)));
                                    System.out.printf("Disciplina cadastrada com o nome de '%s' e uma carga horaria de %s horas!\n", nomeDisciplina, cargaHoraria);
                                    break;
                                case 2: //Cadastrar estudante
                                    System.out.print("Qual o nome do estudante? ");
                                    String nomeEstudante = input.nextLine();
                                    System.out.print("Qual a matricula do estudante? ");
                                    String matriculaEstudante = input.nextLine();
                                    System.out.print("Qual o email do estudante? ");
                                    String emailEstudante = input.nextLine();
                                    System.out.print("Qual o endereco do estudante? ");
                                    String enderecoEstudante = input.nextLine();
                                    System.out.print("Qual o CPF do estudante? ");
                                    String cpfEstudante = input.nextLine();
                                    estudantes.add(new Estudante(matriculaEstudante, nomeEstudante, emailEstudante, enderecoEstudante, cpfEstudante));
                                    System.out.printf("Estudante %s foi cadastrado(a)!", nomeEstudante);
                                    break;
                                default:
                                    System.out.println("Opcao invalida!");
                            }
                        } else {
                            System.out.println("Escolha invalida! Reinicie o programa.");
                            input.nextLine();
                            System.exit(0);
                        }
                        break;

                    case 2:
                        System.out.println("1 - Disciplinas\n2 - Estudantes\n");
                        System.out.print("O que deseja deletar? ");
                        choice = input.nextInt();
                        if(input.hasNextInt()) {
                            switch (choice) {
                                case 1:
                                    
                                    break;
                                case 2:
    
                                    break;
                                default:
                                    System.out.println("Opcao invalida!");
                            }
                        } else {
                            System.out.println("Escolha invalida! Reinicie o programa.");
                            input.nextLine();
                            System.exit(0);
                        }
                        break;

                    case 3:
                        
                        break;

                    case 4:
                        
                        break;

                    case 5: 
                        System.out.println("Sistema encerrado!");
                        input.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.print("Escolha invalida! Tente novamente: ");
                }
            }
        } else {
            System.out.println("Escolha invalida! Reinicie o programa.");
            input.nextLine();
            System.exit(0);
        }
    }

    public static void listar(ArrayList<Object> objetos) {
        for (Object objeto : objetos) {
            
        }
    }
}
