package br.com.gft.exercicio.tres;

import java.util.ArrayList;
import java.util.List;

public class VerificaGiriaMain {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList();
		pessoas.add(new Paulista());
		pessoas.add(new Mineiro());
		pessoas.add(new Carioca());
		pessoas.add(new Carioca());
		pessoas.add(new Paulista());
		pessoas.add(new Mineiro());
		
		for(Pessoa p : pessoas) {
			System.out.println("Fala : " + p.giria());
		}

	}

}