package br.com.impacta.lab;

import java.util.ArrayList;
import br.com.impacta.models.*;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		/*
		 * Transforme a tabela produto em uma classe separadas
		 * no pacote br.com.impacta.models
		 * 
		 *  Criar a classe produto agora utilizando o encapsulamento.
		 *  Atributos privados e os metodos get e set para cada atributo.
		 *  
		 *  Tabela de Carro
		 *  
		 *  Cor				Ano							Valor do Carro
		 * 	Amarelo			2010						10000.00
 		 * 
		 * -----------------------------------------------------------------
		 * 
		 * 
		 * 
		 */
		
		
		Carro carro = new Carro();
		carro.setCor("Amarelo");
		carro.setAno(2010);
		carro.setValor(10000.00);
		
		
		System.out.println(carro.getCor());
	}

}
