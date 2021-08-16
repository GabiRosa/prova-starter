package br.com.gft.exercicio.dois;

import java.util.Scanner;

public class CalculaReajusteSalarioMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Colaborador colaborador = new Colaborador();

        System.out.println("Bem vindo ao Programa Calculo de Reajuste de salário");

        System.out.println("Digite o nome do colaborador");
        colaborador.setNome(scan.next());

        System.out.println("Digite o salário do colaborador");
        Double salario = scan.nextDouble();
        while (salario < 0){
            System.out.println("Salário não pode ser negativo, digite novamente.");
            salario = scan.nextDouble();
        }
        colaborador.setSalario(salario);

        double valorTaxa = verificaTaxaReajuste(colaborador.getSalario());

        System.out.println("Sistema de reajuste do colaborador: " + colaborador.getNome());

        System.out.println("Salário Antes do Reajuste: " + colaborador.getSalario());
        System.out.println("O percentual de aumento aplicado: " + (valorTaxa * 100) + "%");

        System.out.println("O valor do aumento: R$" + colaborador.getSalario() * valorTaxa);
        System.out.println("O novo salário, após o aumento: R$" + (colaborador.getSalario() + (colaborador.getSalario() * valorTaxa)));

    }

    private static double verificaTaxaReajuste(Double salario) {
        if (salario <= 1600){
            return 0.25;
        } else if (salario > 1600 && salario < 3000) {
            return 0.20;
        } else if (salario >= 3000 && salario < 5000) {
            return 0.15;
        }
        return 0.10;
    }
}
