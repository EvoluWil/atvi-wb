package com.wb.negocio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import com.wb.modelo.Cliente;

public class Listar10Menor extends Listagem {
	private List<Cliente> clientes;
	public Listar10Menor(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		Map<Cliente, Integer> lista = new HashMap<Cliente, Integer>();
		for (Cliente cliente : clientes) {
			int produtos = cliente.getConsumos().size();
			lista.put(cliente, produtos);
		}

		Map<Cliente, Integer> listOrder = new TreeMap<Cliente, Integer>();
		listOrder.putAll(lista);

		int i = 0;
		for (Entry<Cliente, Integer> entry : lista.entrySet()) {
			String chave = entry.getKey().nome; 
			Object valor = entry.getValue();
			System.out.println("Nome: " + chave + ", " + "Quantidade: " + valor);
			i++;
			if(i > 9){
				break;
			}
		}
		System.out.println("--------------------------------------");
	}
}
