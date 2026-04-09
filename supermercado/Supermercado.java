/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermercado;

/**
 *
 * @author rober
 */
public class Supermercado {

    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 25.50, 21);
        p1.exibirDados();
        p1.vender(2);
        p1.exibirDados();
        
        System.out.println(" ");
        
        Perecivel leite = new Perecivel("Leite", 5.0, 10, "10/05/2026");
        leite.exibirDados();
        leite.vender(2);
        leite.exibirDados();
        
        System.out.println(" ");
        
        ProdutoImportado chocolate = new ProdutoImportado("Chocolate Milka", 16.99, 50, 10);
        chocolate.exibirDados();
        chocolate.vender(13);
        chocolate.exibirDados();
        
        System.out.println(" ");
        
        
        Venda venda = new Venda();
        System.out.println("=== PROCESSANDO VENDA ===");
        venda.processarItem(p1, 2);
        venda.processarItem(leite, 2);
        venda.processarItem(chocolate, 15);
        
    }
}
