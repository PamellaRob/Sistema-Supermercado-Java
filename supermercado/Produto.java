/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto(String n, double p, int e){
        this.nome = n;
        this.preco = p;
        this.estoque = e;
    }
    
    public void adicionarEstoque(int qtd){
        if(qtd > 0){
        estoque += qtd;
        } else {
        System.out.println("Quantidade inválida");
    }
    }
    
    public void vender(int qtd){
        if (qtd <= estoque) {
            estoque -= qtd;
            System.out.println("Vendido: " + qtd + " unidades.");
        } else {
            System.out.println("Estoque Insuficiente");
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double p){
        if (p>=0) {
            this.preco = p;
        } else {
            System.out.println("ERRO! O preço não pode ser negativo");
        }
    }
    
    public int getEstoque(){
        return estoque;
    }
    
    public void setEstoque(int e){
        if (e>=0) {
            this.estoque = e;
        } else {
            System.out.println("ERRO! O valor do estoque não pode ser negativo");
        }
    }
    
    public double getValorFinal(){
    return preco;
}
    
    public void exibirDados(){
        System.out.println("=== INFORMAÇÕES SOBRE O PRODUTO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Estoque: " + estoque);
    }
}
