package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Servico;

public class CadastroServico extends Cadastro {
  private List<Servico> servicos;
  private Entrada entrada;

  public CadastroServico(List<Servico> servicos) {
    this.servicos = servicos;
    this.entrada = new Entrada();
  }

  @Override
  public void cadastrar() {
		System.out.println("\nInicio do cadastro do serviço");
		System.out.println("Por favor informe o nome do serviço:");

    String nome = entrada.receberTexto();

		System.out.println("Por favor informe o preco do serviço:");

		double preco = entrada.receberNumeroDouble();

    servicos.add(new Servico(nome, preco));
  }
}

