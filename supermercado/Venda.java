/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

public class Venda {    
    
    public void processarItem(Produto p, int qtd){
        double precoUnidade = p.getValorFinal();
        double valorTotal = precoUnidade * qtd;
     
        System.out.println("=== ITEM DA VENDA ===");
        System.out.println("Produto: " + p.getNome());
        System.out.println("Quantidade: " + qtd);
        System.out.printf("Preço unitário: %.2f\n", precoUnidade);
        System.out.printf("Total: %.2f\n", valorTotal);
        System.out.println("----------------------");
        
        p.vender(qtd);
    }
}
