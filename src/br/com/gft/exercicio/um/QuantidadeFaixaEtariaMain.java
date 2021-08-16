package br.com.gft.exercicio.um;

import java.util.Scanner;

public class QuantidadeFaixaEtariaMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade = 0;
		int qtdPessoasMenor14 = 0;
		int qtdPessoasMenor29 = 0;
		int qtdPessoasMenor44 = 0;
		int qtdPessoasMenor60 = 0;
		int qtdPessoasMaior60 = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite a idade da " + i + "ª pessoa : ");
			idade = scan.nextInt();
			while(idade <= 0) {
				System.out.println("Idade inválida! Não pode ser menor ou igual a zero. Digite Novamente : ");
				idade = scan.nextInt();
			}
			if(idade > 0 && idade <= 14) {
				
				qtdPessoasMenor14 = qtdPessoasMenor14 + 1;
				
			} else if (idade > 14 && idade <= 29) {
				
				qtdPessoasMenor29 = qtdPessoasMenor29 + 1;
				
			} else if (idade > 29 && idade <= 44) {
				
				qtdPessoasMenor44 = qtdPessoasMenor44 + 1;
				
			} else if (idade > 44 && idade <= 59) {
				
				qtdPessoasMenor60 = qtdPessoasMenor60 + 1;
				
			} else {
				qtdPessoasMaior60 = qtdPessoasMaior60 +1;
			}
		}
		
		int pctPrimeiraFxEtaria = (qtdPessoasMenor14 * 100) / 10;
		int pctUltimaFxEtaria = (qtdPessoasMaior60 * 100) / 10;
		
		System.out.println("Quantidade de pessoas Até 14 anos : " + qtdPessoasMenor14);
		System.out.println("Quantidade de pessoas de 15 Até 29 anos : " + qtdPessoasMenor29);
		System.out.println("Quantidade de pessoas de 30 Até 44 anos : " + qtdPessoasMenor44);
		System.out.println("Quantidade de pessoas de 45 Até 59 anos : " + qtdPessoasMenor60);
		System.out.println("Quantidade de pessoas Acima de 60 anos : " + qtdPessoasMaior60);
		System.out.println("Porcentagem de Pessoas na primeira faixa etária : " + pctPrimeiraFxEtaria + "%" );
		System.out.println("Porcentagem de pessoas na última faixa etária: " + pctUltimaFxEtaria + "%");
	}
}