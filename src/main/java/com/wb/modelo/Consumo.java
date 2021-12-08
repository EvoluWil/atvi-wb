package com.wb.modelo;

public class Consumo {
  private Produto produto;
  private Servico servico;
  private Cliente consumidor;
  private String tipo;

  public Consumo(Produto produto, Cliente consumidor) {
    this.consumidor = consumidor;
    this.produto = produto;
    this.tipo = "produto";
  }

  public Consumo(Servico servico, Cliente consumidor) {
    this.consumidor = consumidor;
    this.servico = servico;
    this.tipo = "servico";
  }

  public String getTipo() {
    return tipo;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public Servico getServico() {
    return servico;
  }

  public void setServico(Servico servico) {
    this.servico = servico;
  }

  public Cliente getConsumidor() {
    return consumidor;
  }

  public void setConsumidor(Cliente consumidor) {
    this.consumidor = consumidor;
  }

}
