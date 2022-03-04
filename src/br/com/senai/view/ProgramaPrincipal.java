package br.com.senai.view;

import br.com.senai.controller.DadosController;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        DadosController dadosController = new DadosController();
        String continuar = "s";
        int opcao;
        boolean finalizar = false;


        do{
            System.out.println("--------------------------------");
            System.out.println("Informe a opção desejada:");
            System.out.println("1) Cadastrar pessoa");
            System.out.println("2) Listar pessoa");
            System.out.println("3) Editar dados da pessoa");
            System.out.println("4) Excluir pessoa");
            System.out.println("9) Sair do sistema");
            System.out.println("--------------------------------");
            System.out.print("-->");
            opcao = in.nextInt();


            switch (opcao) {

                case 1:

                    dadosController.cadastrarPessoa();
                    break;

                case 2:

                    dadosController.listarPessoa();
                    break;

                case 3:

                    dadosController.editarPessoa();
                    break;

                case 4:

                    dadosController.deletarPessoa();
                    break;

                case 9:
                    System.out.println("Sistema finalizado!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;


                }
                System.out.println("Deseja realizar outra operação [s/n]");
                continuar = in.next();
            }while(continuar.equalsIgnoreCase ("s"));
        }
    }
