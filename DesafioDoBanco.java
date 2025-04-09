package desafios;

import java.util.Scanner;

public record DesafioDoBanco() {
    public static void main(String[] args) {

        Scanner opcaoDesejada = new Scanner(System.in);
        int saldo = 2500;

        System.out.println("""
                *********************************************
                Dados iniciais do cliente:
                
                Nome:           Lucas Bezerra da Cruz
                Tipo conta:     Corrente
                Saldo inicial:  R$ """ + saldo + """  
                
                *********************************************
                
                        Operações
                
                        1. Consultar saldos
                        2. Receber valor
                        3. Transferir valor
                        4. Encerrar atendimento
                
                        Digite a opção desejada:
                """);

        int opcaoEscolhida = opcaoDesejada.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("Seu saldo é de: R$ " + saldo);
            } else if (opcaoEscolhida == 2) {
                Scanner valorRecebido = new Scanner(System.in);
                System.out.println("Qual o valor que irá receber?");
                int tantoRecebido = valorRecebido.nextInt() + saldo;
                System.out.println("Você possui " + tantoRecebido + " de saldo");
            } else if (opcaoEscolhida == 3) {
                System.out.println("Quanto irá transferir?");
                Scanner valorTransferido = new Scanner(System.in);
                int ficouNaConta = saldo - valorTransferido.nextInt();
                if (ficouNaConta < 0) {
                    System.out.println("Não pode realizar essa transferência, saldo insuficiente");
                } else {
                    System.out.println("Seu saldo atual é de: R$ " + ficouNaConta);
                }
            } else if (opcaoEscolhida == 4) {
                System.out.println("Atendimento encerrado.");
            } else {
                System.out.println("Opção inválida");
            }
        }
    }