/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

public class Perecivel extends Produto{
    private String dataValidade;
    
    public Perecivel(String n, double p, int e, String data) {
        super(n, p, e);
        this.dataValidade = data;
    }
    
    @Override
    public void vender(int qtd){
        System.out.println("Verificando estoque...");
        if (getEstoque()>=0) {
            super.vender(qtd);
            System.out.println("Item perecível vendido");
        }else{
            System.out.println("Item perecível não vendido por estoque insuficiente");
        }
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Data de Validade: " + dataValidade);
    }
}
