package br.com.gft.exercicio.quatro;

import java.util.Scanner;

public class CentralBoasVindasMain {

	public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
       
       String op = "";
       
       System.out.println("Em que turno voce trabalha? M-Manhã, T-Tarde, N-Noite");
       op = ler.next();
       while(!op.equalsIgnoreCase("M") && !op.equalsIgnoreCase("T") && !op.equalsIgnoreCase("N")) {
    	   System.out.println("Opção Inválida! Digite Novamente : ");
    	   op = ler.next();
       }
       
       if("M".equalsIgnoreCase(op)) {
          System.out.println("Bom dia!");
       } else if ("T".equalsIgnoreCase(op)) {
           System.out.println("Boa tarde!");
       } else {
           System.out.println("Boa noite");
       }
	}
}