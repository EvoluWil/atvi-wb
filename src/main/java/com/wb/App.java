package com.wb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.Consumo;
import com.wb.modelo.Empresa;
import com.wb.modelo.Produto;
import com.wb.modelo.Servico;
import com.wb.modelo.Telefone;
import com.wb.negocio.Editar;
import com.wb.negocio.EditarCliente;
import com.wb.negocio.EditarProduto;
import com.wb.negocio.EditarServico;
import com.wb.negocio.Cadastro;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.CadastroConsumo;
import com.wb.negocio.CadastroProduto;
import com.wb.negocio.CadastroServico;
import com.wb.negocio.Deletar;
import com.wb.negocio.DeletarCliente;
import com.wb.negocio.DeletarProduto;
import com.wb.negocio.DeletarServico;
import com.wb.negocio.Buscar;
import com.wb.negocio.BuscarCliente;
import com.wb.negocio.BuscarProduto;
import com.wb.negocio.BuscarServico;
import com.wb.negocio.Listagem;
import com.wb.negocio.ListarTodosClientes;
import com.wb.negocio.ListarTodosClientesPorGenero;
import com.wb.negocio.ListarTodosProdutos;
import com.wb.negocio.ListarTodosServicos;
import com.wb.negocio.Listar10Maior;
import com.wb.negocio.Listar10Menor;
import com.wb.negocio.Listar5Valor;

public class App {
	public static void main(String[] args) {
		try {
			System.out.println("\nBem-vindo ao Grupo World Beauty");

			Empresa empresa = new Empresa();

			//Telefones
			List<Telefone> telefonesC1 = new ArrayList<Telefone>();
			List<Telefone> telefonesC2 = new ArrayList<Telefone>();
			List<Telefone> telefonesC3 = new ArrayList<Telefone>();
			List<Telefone> telefonesC4 = new ArrayList<Telefone>();
			List<Telefone> telefonesC5 = new ArrayList<Telefone>();
			List<Telefone> telefonesC6 = new ArrayList<Telefone>();
			List<Telefone> telefonesC7 = new ArrayList<Telefone>();
			List<Telefone> telefonesC8 = new ArrayList<Telefone>();
			List<Telefone> telefonesC9 = new ArrayList<Telefone>();
			List<Telefone> telefonesC10 = new ArrayList<Telefone>();
			List<Telefone> telefonesC11 = new ArrayList<Telefone>();
			List<Telefone> telefonesC12 = new ArrayList<Telefone>();
			List<Telefone> telefonesC13 = new ArrayList<Telefone>();
			List<Telefone> telefonesC14 = new ArrayList<Telefone>();
			List<Telefone> telefonesC15 = new ArrayList<Telefone>();
			List<Telefone> telefonesC16 = new ArrayList<Telefone>();
			List<Telefone> telefonesC17 = new ArrayList<Telefone>();
			List<Telefone> telefonesC18 = new ArrayList<Telefone>();
			List<Telefone> telefonesC19 = new ArrayList<Telefone>();
			List<Telefone> telefonesC20 = new ArrayList<Telefone>();
			Telefone telefone = new Telefone("12", "123456789");
			telefonesC1.add(telefone);
			telefonesC1.add(telefone);
			telefonesC1.add(telefone);
			telefonesC2.add(telefone);
			telefonesC3.add(telefone);
			telefonesC4.add(telefone);
			telefonesC5.add(telefone);
			telefonesC6.add(telefone);
			telefonesC7.add(telefone);
			telefonesC8.add(telefone);
			telefonesC9.add(telefone);
			telefonesC10.add(telefone);
			telefonesC11.add(telefone);
			telefonesC12.add(telefone);
			telefonesC13.add(telefone);
			telefonesC14.add(telefone);
			telefonesC15.add(telefone);
			telefonesC16.add(telefone);
			telefonesC17.add(telefone);
			telefonesC18.add(telefone);
			telefonesC19.add(telefone);
			telefonesC20.add(telefone);

			//CPF
			DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate emmissao1 = LocalDate.parse("07/12/2021", format1);
			CPF cpf1 = new CPF(emmissao1, "1231");
			CPF cpf2 = new CPF(emmissao1, "1232");
			CPF cpf3 = new CPF(emmissao1, "1233");
			CPF cpf4 = new CPF(emmissao1, "1234");
			CPF cpf5 = new CPF(emmissao1, "1235");
			CPF cpf6 = new CPF(emmissao1, "1236");
			CPF cpf7 = new CPF(emmissao1, "1237");
			CPF cpf8 = new CPF(emmissao1, "1238");
			CPF cpf9 = new CPF(emmissao1, "1239");
			CPF cpf10 = new CPF(emmissao1, "12310");
			CPF cpf11 = new CPF(emmissao1, "12311");
			CPF cpf12 = new CPF(emmissao1, "12312");
			CPF cpf13 = new CPF(emmissao1, "12313");
			CPF cpf14 = new CPF(emmissao1, "12314");
			CPF cpf15 = new CPF(emmissao1, "12315");
			CPF cpf16 = new CPF(emmissao1, "12316");
			CPF cpf17 = new CPF(emmissao1, "12317");
			CPF cpf18 = new CPF(emmissao1, "12318");
			CPF cpf19 = new CPF(emmissao1, "12319");
			CPF cpf20 = new CPF(emmissao1, "12320");
			CPF cpf21 = new CPF(emmissao1, "12321");
			CPF cpf22 = new CPF(emmissao1, "12322");
			CPF cpf23 = new CPF(emmissao1, "12323");
			CPF cpf24 = new CPF(emmissao1, "12324");
			CPF cpf25 = new CPF(emmissao1, "12325");
			CPF cpf26 = new CPF(emmissao1, "12326");
			CPF cpf27 = new CPF(emmissao1, "12327");
			CPF cpf28 = new CPF(emmissao1, "12328");
			CPF cpf29 = new CPF(emmissao1, "12329");
			CPF cpf30 = new CPF(emmissao1, "12330");
			CPF cpf31 = new CPF(emmissao1, "12331");
			CPF cpf32 = new CPF(emmissao1, "12332");
			CPF cpf33 = new CPF(emmissao1, "12333");
			CPF cpf34 = new CPF(emmissao1, "12334");
			CPF cpf35 = new CPF(emmissao1, "12335");
			CPF cpf36 = new CPF(emmissao1, "12336");
			CPF cpf37 = new CPF(emmissao1, "12337");
			CPF cpf38 = new CPF(emmissao1, "12338");
			CPF cpf39 = new CPF(emmissao1, "12339");
			CPF cpf40 = new CPF(emmissao1, "12340");

			//Clientes
			Cliente cliente1 = new Cliente("Will", "W", cpf1, "m");
			cliente1.setTelefones(telefonesC1);
			empresa.getClientes().add(cliente1);

			Cliente cliente2 = new Cliente("tom", "t", cpf2, "m");
			cliente2.setTelefones(telefonesC2);
			empresa.getClientes().add(cliente2);	

			Cliente cliente3 = new Cliente("jeff", "j", cpf3, "m");
			cliente3.setTelefones(telefonesC3);
			empresa.getClientes().add(cliente3);	

			Cliente cliente4 = new Cliente("bill", "b", cpf4, "m");
			cliente4.setTelefones(telefonesC4);
			empresa.getClientes().add(cliente4);

			Cliente cliente5 = new Cliente("kill", "k", cpf5, "m");
			cliente5.setTelefones(telefonesC5);
			empresa.getClientes().add(cliente5);

			Cliente cliente6 = new Cliente("dill", "d", cpf6, "m");
			cliente6.setTelefones(telefonesC6);
			empresa.getClientes().add(cliente6);
						
			Cliente cliente7 = new Cliente("till", "t", cpf7, "m");
			cliente7.setTelefones(telefonesC7);
			empresa.getClientes().add(cliente7);	

			Cliente cliente8 = new Cliente("man", "m", cpf8, "m");
			cliente8.setTelefones(telefonesC8);
			empresa.getClientes().add(cliente8);

			Cliente cliente9 = new Cliente("marcio", "marcim", cpf9, "m");
			cliente9.setTelefones(telefonesC9);
			empresa.getClientes().add(cliente9);

			Cliente cliente10 = new Cliente("mateus", "matim", cpf10, "m");
			cliente10.setTelefones(telefonesC10);
			empresa.getClientes().add(cliente10);	

			Cliente cliente11 = new Cliente("gui", "guizim", cpf11, "m");
			cliente11.setTelefones(telefonesC11);
			empresa.getClientes().add(cliente11);	

			Cliente cliente12 = new Cliente("bob", "bob", cpf12, "m");
			cliente12.setTelefones(telefonesC12);
			empresa.getClientes().add(cliente12);	

			Cliente cliente13 = new Cliente("kelvim", "k", cpf13, "m");
			cliente13.setTelefones(telefonesC13);
			empresa.getClientes().add(cliente13);	

			Cliente cliente14 = new Cliente("danilo", "dan", cpf14, "m");
			cliente14.setTelefones(telefonesC14);
			empresa.getClientes().add(cliente14);	

			Cliente cliente15 = new Cliente("diego", "dig", cpf15, "m");
			cliente15.setTelefones(telefonesC15);
			empresa.getClientes().add(cliente15);	

			Cliente cliente16 = new Cliente("Bri", "bri", cpf16, "m");
			cliente16.setTelefones(telefonesC16);
			empresa.getClientes().add(cliente16);	

			Cliente cliente17 = new Cliente("fael", "fa", cpf17, "m");
			cliente17.setTelefones(telefonesC17);
			empresa.getClientes().add(cliente17);	

			Cliente cliente18 = new Cliente("rafa", "rafa", cpf18, "m");
			cliente18.setTelefones(telefonesC18);
			empresa.getClientes().add(cliente18);	

			Cliente cliente19 = new Cliente("thiago", "thg", cpf19, "m");
			cliente19.setTelefones(telefonesC19);
			empresa.getClientes().add(cliente19);	

			Cliente cliente20 = new Cliente("Gerson", "GG", cpf20, "m");
			cliente20.setTelefones(telefonesC20);
			empresa.getClientes().add(cliente20);

			Cliente cliente21 = new Cliente("guinifer", "gui", cpf21, "f");
			cliente21.setTelefones(telefonesC1);
			empresa.getClientes().add(cliente21);

			Cliente cliente22 = new Cliente("alice", "lice", cpf22, "f");
			cliente22.setTelefones(telefonesC2);
			empresa.getClientes().add(cliente22);	

			Cliente cliente23 = new Cliente("maria", "maria", cpf23, "f");
			cliente23.setTelefones(telefonesC3);
			empresa.getClientes().add(cliente23);	

			Cliente cliente24 = new Cliente("joana", "jo", cpf24, "f");
			cliente24.setTelefones(telefonesC4);
			empresa.getClientes().add(cliente24);

			Cliente cliente25 = new Cliente("josefa", "zefa", cpf25, "f");
			cliente25.setTelefones(telefonesC5);
			empresa.getClientes().add(cliente25);

			Cliente cliente26 = new Cliente("rita", "desgraçada", cpf26, "f");
			cliente26.setTelefones(telefonesC6);
			empresa.getClientes().add(cliente26);
						
			Cliente cliente27 = new Cliente("emily", "emy-lim", cpf27, "f");
			cliente27.setTelefones(telefonesC7);
			empresa.getClientes().add(cliente27);	

			Cliente cliente28 = new Cliente("jan", "jan", cpf28, "f");
			cliente28.setTelefones(telefonesC8);
			empresa.getClientes().add(cliente28);

			Cliente cliente29 = new Cliente("cris", "cris", cpf29, "f");
			cliente29.setTelefones(telefonesC9);
			empresa.getClientes().add(cliente29);

			Cliente cliente30 = new Cliente("mi", "mi", cpf30, "f");
			cliente30.setTelefones(telefonesC10);
			empresa.getClientes().add(cliente30);	

			Cliente cliente31 = new Cliente("manu", "manu", cpf31, "f");
			cliente31.setTelefones(telefonesC11);
			empresa.getClientes().add(cliente31);	

			Cliente cliente32 = new Cliente("manuela", "manu", cpf32, "f");
			cliente32.setTelefones(telefonesC12);
			empresa.getClientes().add(cliente32);	

			Cliente cliente33 = new Cliente("manuele", "manu", cpf33, "f");
			cliente33.setTelefones(telefonesC13);
			empresa.getClientes().add(cliente33);	

			Cliente cliente34 = new Cliente("manuely", "manu", cpf34, "f");
			cliente34.setTelefones(telefonesC14);
			empresa.getClientes().add(cliente34);	

			Cliente cliente35 = new Cliente("manuelem", "manu", cpf35, "f");
			cliente35.setTelefones(telefonesC15);
			empresa.getClientes().add(cliente35);	

			Cliente cliente36 = new Cliente("manuelle", "manu", cpf36, "f");
			cliente36.setTelefones(telefonesC16);
			empresa.getClientes().add(cliente36);	

			Cliente cliente37 = new Cliente("manuelly", "manu", cpf37, "f");
			cliente37.setTelefones(telefonesC17);
			empresa.getClientes().add(cliente37);	

			Cliente cliente38 = new Cliente("manuella", "manu", cpf38, "f");
			cliente38.setTelefones(telefonesC18);
			empresa.getClientes().add(cliente38);	

			Cliente cliente39 = new Cliente("mirian", "mily", cpf39, "f");
			cliente39.setTelefones(telefonesC19);
			empresa.getClientes().add(cliente39);	

			Cliente cliente40 = new Cliente("miria", "miry", cpf40, "f");
			cliente40.setTelefones(telefonesC20);
			empresa.getClientes().add(cliente40);
			
			//Produtos
			Produto produto1 = new Produto( "creme", 30 );
			empresa.getProdutos().add(produto1);
			Produto produto2 = new Produto( "hidratante", 40 );
			empresa.getProdutos().add(produto2);
			Produto produto3 = new Produto( "shampoo", 20 );
			empresa.getProdutos().add(produto3);
			Produto produto4 = new Produto( "condicionador", 25 );
			empresa.getProdutos().add(produto4);
			Produto produto5 = new Produto( "esmalte", 10 );
			empresa.getProdutos().add(produto5);
			Produto produto6 = new Produto( "gel", 10 );
			empresa.getProdutos().add(produto6);
			Produto produto7 = new Produto( "cera", 30 );
			empresa.getProdutos().add(produto7);
			Produto produto8 = new Produto( "lixa", 15 );
			empresa.getProdutos().add(produto8);
			Produto produto9 = new Produto( "perfume", 60 );
			empresa.getProdutos().add(produto9);
			Produto produto10 = new Produto( "sabonete", 20 );
			empresa.getProdutos().add(produto10);

			// Serviços
			Servico servico1 = new Servico( "escova", 30 );
			empresa.getServicos().add(servico1);
			Servico servico2 = new Servico( "limpeza", 40 );
			empresa.getServicos().add(servico2);
			Servico servico3 = new Servico( "pintura", 20 );
			empresa.getServicos().add(servico3);
			Servico servico4 = new Servico( "hidratação", 30 );
			empresa.getServicos().add(servico4);
			Servico servico5 = new Servico( "depilação", 40 );
			empresa.getServicos().add(servico5);
			Servico servico6 = new Servico( "cilios", 40 );
			empresa.getServicos().add(servico6);
			Servico servico7 = new Servico( "massagem", 30 );
			empresa.getServicos().add(servico7);
			Servico servico8 = new Servico( "tratamento", 40 );
			empresa.getServicos().add(servico8);
			Servico servico9 = new Servico( "reconstrução", 30 );
			empresa.getServicos().add(servico9);
			Servico servico10 = new Servico( "drenagem", 60 );
			empresa.getServicos().add(servico10);

			//Consumo
			Consumo consumoP1 = new Consumo(produto1, cliente1);
			Consumo consumoP2 = new Consumo(produto2, cliente1);
			Consumo consumoP3 = new Consumo(produto3, cliente1);
			Consumo consumoP4 = new Consumo(servico3, cliente1);
			Consumo consumoP5 = new Consumo(servico4, cliente1);
			Consumo consumoP6 = new Consumo(servico6, cliente1);
			empresa.getConsumos().add(consumoP1);
			empresa.getConsumos().add(consumoP2);
			empresa.getConsumos().add(consumoP3);
			empresa.getConsumos().add(consumoP4);
			empresa.getConsumos().add(consumoP5);
			empresa.getConsumos().add(consumoP6);
			cliente1.getConsumos().add(consumoP1);
			cliente1.getConsumos().add(consumoP2);
			cliente1.getConsumos().add(consumoP3);
			cliente1.getConsumos().add(consumoP4);
			cliente1.getConsumos().add(consumoP5);
			cliente1.getConsumos().add(consumoP6);
			
			Consumo consumoP7 = new Consumo(produto1, cliente2);
			Consumo consumoP8 = new Consumo(produto2, cliente2);
			Consumo consumoP9 = new Consumo(produto3, cliente2);
			Consumo consumoP10 = new Consumo(servico10, cliente2);
			empresa.getConsumos().add(consumoP7);
			empresa.getConsumos().add(consumoP8);
			empresa.getConsumos().add(consumoP9);
			empresa.getConsumos().add(consumoP10);
			cliente2.getConsumos().add(consumoP7);
			cliente2.getConsumos().add(consumoP8);
			cliente2.getConsumos().add(consumoP9);
			cliente2.getConsumos().add(consumoP10);

			Consumo consumoP11 = new Consumo(produto3, cliente3);
			Consumo consumoP12 = new Consumo(produto2, cliente3);
			Consumo consumoP13 = new Consumo(produto5, cliente3);
			Consumo consumoP14 = new Consumo(servico3, cliente3);
			Consumo consumoP15 = new Consumo(servico9, cliente3);
			Consumo consumoP16 = new Consumo(servico6, cliente3);
			empresa.getConsumos().add(consumoP11);
			empresa.getConsumos().add(consumoP12);
			empresa.getConsumos().add(consumoP13);
			empresa.getConsumos().add(consumoP14);
			empresa.getConsumos().add(consumoP15);
			empresa.getConsumos().add(consumoP16);
			cliente3.getConsumos().add(consumoP11);
			cliente3.getConsumos().add(consumoP12);
			cliente3.getConsumos().add(consumoP13);
			cliente3.getConsumos().add(consumoP14);
			cliente3.getConsumos().add(consumoP15);
			cliente3.getConsumos().add(consumoP16);

			Consumo consumoP17 = new Consumo(produto8, cliente4);
			Consumo consumoP18 = new Consumo(produto2, cliente4);
			Consumo consumoP19 = new Consumo(produto10, cliente4);
			Consumo consumoP20 = new Consumo(servico3, cliente4);
			empresa.getConsumos().add(consumoP17);
			empresa.getConsumos().add(consumoP18);
			empresa.getConsumos().add(consumoP19);
			empresa.getConsumos().add(consumoP20);
			cliente4.getConsumos().add(consumoP17);
			cliente4.getConsumos().add(consumoP18);
			cliente4.getConsumos().add(consumoP19);
			cliente4.getConsumos().add(consumoP20);

			Consumo consumoP21 = new Consumo(produto1, cliente5);
			Consumo consumoP22 = new Consumo(produto8, cliente5);
			Consumo consumoP23 = new Consumo(produto5, cliente5);
			Consumo consumoP24 = new Consumo(servico3, cliente5);
			Consumo consumoP25 = new Consumo(servico4, cliente5);
			Consumo consumoP26 = new Consumo(servico2, cliente5);
			Consumo consumoP27 = new Consumo(servico1, cliente5);
			Consumo consumoP28 = new Consumo(servico10, cliente5);
			Consumo consumoP29 = new Consumo(servico8, cliente5);
			empresa.getConsumos().add(consumoP21);
			empresa.getConsumos().add(consumoP22);
			empresa.getConsumos().add(consumoP23);
			empresa.getConsumos().add(consumoP24);
			empresa.getConsumos().add(consumoP25);
			empresa.getConsumos().add(consumoP26);
			empresa.getConsumos().add(consumoP27);
			empresa.getConsumos().add(consumoP28);
			empresa.getConsumos().add(consumoP29);
			cliente5.getConsumos().add(consumoP21);
			cliente5.getConsumos().add(consumoP22);
			cliente5.getConsumos().add(consumoP23);
			cliente5.getConsumos().add(consumoP24);
			cliente5.getConsumos().add(consumoP25);
			cliente5.getConsumos().add(consumoP26);
			cliente5.getConsumos().add(consumoP27);
			cliente5.getConsumos().add(consumoP28);
			cliente5.getConsumos().add(consumoP29);

			Consumo consumoP30 = new Consumo(produto5, cliente6);
			empresa.getConsumos().add(consumoP30);
			cliente6.getConsumos().add(consumoP30);

			Consumo consumoP31 = new Consumo(produto1, cliente7);
			Consumo consumoP32 = new Consumo(produto7, cliente7);
			empresa.getConsumos().add(consumoP31);
			empresa.getConsumos().add(consumoP32);
			cliente7.getConsumos().add(consumoP31);
			cliente7.getConsumos().add(consumoP32);

			Consumo consumoP33 = new Consumo(produto1, cliente8);
			Consumo consumoP34 = new Consumo(servico3, cliente8);
			Consumo consumoP35 = new Consumo(servico7, cliente8);
			empresa.getConsumos().add(consumoP33);
			empresa.getConsumos().add(consumoP34);
			empresa.getConsumos().add(consumoP35);
			cliente8.getConsumos().add(consumoP33);
			cliente8.getConsumos().add(consumoP34);
			cliente8.getConsumos().add(consumoP35);

			Consumo consumoP36 = new Consumo(servico6, cliente9);
			empresa.getConsumos().add(consumoP36);
			cliente9.getConsumos().add(consumoP36);

			Consumo consumoP37 = new Consumo(servico3, cliente10);
			Consumo consumoP38 = new Consumo(servico4, cliente10);
			Consumo consumoP39 = new Consumo(servico6, cliente10);
			empresa.getConsumos().add(consumoP37);
			empresa.getConsumos().add(consumoP38);
			empresa.getConsumos().add(consumoP39);
			cliente10.getConsumos().add(consumoP37);
			cliente10.getConsumos().add(consumoP38);
			cliente10.getConsumos().add(consumoP39);

			Consumo consumoP40 = new Consumo(produto1, cliente11);
			Consumo consumoP41 = new Consumo(produto8, cliente11);
			empresa.getConsumos().add(consumoP40);
			empresa.getConsumos().add(consumoP41);
			cliente11.getConsumos().add(consumoP40);
			cliente11.getConsumos().add(consumoP41);

			Consumo consumoP42 = new Consumo(produto2, cliente12);
			Consumo consumoP43 = new Consumo(produto3, cliente12);
			Consumo consumoP44 = new Consumo(servico3, cliente12);
			empresa.getConsumos().add(consumoP42);
			empresa.getConsumos().add(consumoP43);
			empresa.getConsumos().add(consumoP44);
			cliente12.getConsumos().add(consumoP42);
			cliente12.getConsumos().add(consumoP43);
			cliente12.getConsumos().add(consumoP44);

			Consumo consumoP45 = new Consumo(produto5, cliente13);
			Consumo consumoP46 = new Consumo(servico6, cliente13);
			empresa.getConsumos().add(consumoP45);
			empresa.getConsumos().add(consumoP46);
			cliente13.getConsumos().add(consumoP45);
			cliente13.getConsumos().add(consumoP46);

			boolean execucao = true;

			while (execucao) {
				System.out.println("\nQue tipo de operação você deseja fazer:");
				System.out.println("\nOPERAÇÕES\n");
				System.out.println("1️ - Cadastrar");
				System.out.println("2 - Editar");
				System.out.println("3 - Apagar");
				System.out.println("4 - Consumo");
				System.out.println("5 - Buscar");
				System.out.println("0 - Sair");

				Entrada entrada = new Entrada();
				int escolha = entrada.receberNumeroInteiro();

				switch (escolha) {
					case 0:
						execucao = false;
						break;
					case 1: {
						System.out.println("\n Que tipo de operação você deseja fazer: \n");
						System.out.println("1 - Cadastrar Cliente");
						System.out.println("2 - Cadastrar Produto");
						System.out.println("3 - Cadastrar Serviço");
						System.out.println("0 - Sair");

						int cadastrar = entrada.receberNumeroInteiro();

						switch (cadastrar) {
							case 0:
								execucao = false;
								break;

							case 1:
								Cadastro cadastroCliente = new CadastroCliente(empresa.getClientes());
								cadastroCliente.cadastrar();
								break;

							case 2: {
								Cadastro cadastroProdruto = new CadastroProduto(empresa.getProdutos());
								cadastroProdruto.cadastrar();
								break;
							}

							case 3: {
								Cadastro cadastroServico = new CadastroServico(empresa.getServicos());
								cadastroServico.cadastrar();
								break;
							}
						}
						break;
					}
					case 2: {
						System.out.println("\n Que tipo de operação você deseja fazer: \n");
						System.out.println("1 - Editar Cliente");
						System.out.println("2 - Editar Produto");
						System.out.println("3 - Editar Serviço");
						System.out.println("0 - Sair");

						int editar = entrada.receberNumeroInteiro();

						switch (editar) {
							case 0:
								execucao = false;
								break;

							case 1: {
								Buscar _cliente = new BuscarCliente(empresa.getClientes());
								Cliente cliente = _cliente.buscar();
								if (cliente == null) {
									System.out.println("\ncliente não registrado");
									break;
								}
								Editar clienteEditar = new EditarCliente(cliente);
								clienteEditar.editar();
								break;
							}

							case 2: {
								Buscar buscar = new BuscarProduto(empresa.getProdutos());
								Produto produto = buscar.buscar();
								if (produto == null) {
									System.out.println("\nproduto não registrado");
									break;
								}
								Editar produtoEditar = new EditarProduto(produto);
								produtoEditar.editar();
								break;
							}

							case 3: {
								Buscar buscar = new BuscarServico(empresa.getServicos());
								Servico servico = buscar.buscar();
								if (servico == null) {
									System.out.println("\nservico não registrado");
									break;
								}
								Editar servicoEditar = new EditarServico(servico);
								servicoEditar.editar();
								break;
							}
							
						}
						break;
					}
					case 3: {
						System.out.println("\n Que tipo de operação você deseja fazer: \n");
						System.out.println("1 - Remover Cliente");
						System.out.println("2 - Remover Produto");
						System.out.println("3 - Remover Serviço");
						System.out.println("0 - Sair");

						int remover = entrada.receberNumeroInteiro();

						switch (remover) {
							case 0:
								execucao = false;
								break;
							
							case 1: {
								Buscar _cliente = new BuscarCliente(empresa.getClientes());

								Cliente cliente = _cliente.buscar();

								if (cliente == null) {
									System.out.println("\ncliente não registrado");
									break;
								}
								Deletar clienteDeletar = new DeletarCliente(empresa.getClientes(), cliente);
								clienteDeletar.deletar();
								break;
							}

							case 2: {
								Buscar _produto = new BuscarProduto(empresa.getProdutos());
								Produto produto = _produto.buscar();
								if (produto == null) {
									System.out.println("\nproduto não registrado");
									break;
								}
								Deletar produtoDeletar = new DeletarProduto(empresa.getProdutos(), produto);
								produtoDeletar.deletar();
								break;
							}

							case 3: {
								Buscar _servico = new BuscarServico(empresa.getServicos());
								Servico servico = _servico.buscar();
								if (servico == null) {
									System.out.println("\nservico não registrado");
									break;
								}
								Deletar servicoDeletar = new DeletarServico(empresa.getServicos(), servico);
								servicoDeletar.deletar();
								break;
							}
						}
						break;
					}
					case 4: {
						System.out.println("\n Que tipo de operação você deseja fazer: \n");
						System.out.println("1 - Novo Consumo(s)");
						System.out.println("2 - Buscar clientes que mais consomem");
						System.out.println("3 - Buscar clientes que menos consomem");
						System.out.println("4 - Buscar clientes que mais consomem em valor");
						System.out.println("0 - Sair");

						int consumo = entrada.receberNumeroInteiro();

						switch (consumo) {
							case 0:
								execucao = false;
								break;

							case 1:
								Cadastro cadastro = new CadastroConsumo(empresa.getProdutos(), empresa.getServicos(),
								empresa.getClientes(), empresa.getConsumos());
								cadastro.cadastrar();
								break;
							
							case 2:
								Listagem top10 = new Listar10Maior(empresa.getClientes());
								top10.listar();
								break;
							case 3:
								Listagem top10menos = new Listar10Menor(empresa.getClientes());
								top10menos.listar();
								break;
							case 4:
								Listagem top5valor = new Listar5Valor(empresa.getClientes());
								top5valor.listar();
								break;
							}
						break;
					}
					case 5: {
						System.out.println("\n Que tipo de operação você deseja fazer: \n");
						System.out.println("1 - Buscar Cliente(s)");
						System.out.println("2 - Buscar Produto(s)");
						System.out.println("3 - Buscar Serviço(s)");
						System.out.println("0 - Sair");
					
						int buscar = entrada.receberNumeroInteiro();
						
						switch (buscar) {
							case 0:
								execucao = false;
								break;
							
							case 1:
								System.out.println("\n Que tipo de operação você deseja fazer: \n");
								System.out.println("1 - Buscar todos clientes");
								System.out.println("2 - Buscar cliente por genero");
								System.out.println("3 - Buscar clientes com maior consumo em R$");
								System.out.println("4 - Buscar clientes com maior consumo em quantiodade");
								System.out.println("5 - Buscar clientes com menor consumo em quantiodade");
								System.out.println("0 - Sair");
								
								int buscarClintes = entrada.receberNumeroInteiro();

								switch (buscarClintes) {
									case 0:
										execucao = false;
										break;

									case 1: {
										Listagem listagem = new ListarTodosClientes(empresa.getClientes());
										listagem.listar();
										break;
									}

									case 2: {
										Entrada _genero = new Entrada();
										System.out.println("\nQual genero você deseja visualizar? (M/F)");
										String genero = _genero.receberTexto();
										Listagem listagem = new ListarTodosClientesPorGenero(empresa.getClientes(), genero);
										listagem.listar();
										break;
									}

									case 3:
										Listagem top10 = new Listar10Maior(empresa.getClientes());
										top10.listar();
										break;

									case 4:
										Listagem top10menos = new Listar10Menor(empresa.getClientes());
										top10menos.listar();
										break;

									case 5: {

										Listagem top5valor = new Listar5Valor(empresa.getClientes());
										top5valor.listar();
										break;
									}	
								}
								break;

							case 2:
								System.out.println("\n Que tipo de operação você deseja fazer: \n");
								System.out.println("1 - Buscar todos produtos");
								System.out.println("0 - Sair");
								
								int buscarProdutos = entrada.receberNumeroInteiro();

								switch (buscarProdutos) {
									case 0:
										execucao = false;
										break;
									
									case 1: {
										Listagem produtos = new ListarTodosProdutos(empresa.getProdutos());
										produtos.listar();
										break;
									}
								}
								break;

							case 3: {
								System.out.println("\n Que tipo de operação você deseja fazer: \n");
								System.out.println("1 - Buscar todos serviços");
								System.out.println("0 - Sair");
								
								int buscarServicos = entrada.receberNumeroInteiro();

								switch (buscarServicos) {
									case 0:
									execucao = false;
									break;
									
									case 1: {
										Listagem servicos = new ListarTodosServicos(empresa.getServicos());
										servicos.listar();
										break;
									}
								}
							}
						}
						break;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Operação não entendida \n");
			System.out.println(e);
		}
	}
}