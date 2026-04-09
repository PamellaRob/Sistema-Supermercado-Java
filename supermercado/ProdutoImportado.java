/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

public class ProdutoImportado extends Produto{
    private double taxaImportacao;
    
    public ProdutoImportado(String n, double p, int e, double taxa) {
        super(n, p, e);
        
        this.taxaImportacao = taxa;
    }
   
    public double getTaxaImportacao(){
        return taxaImportacao;
    }
    
    public void setTaxaImportacao(double taxa){
        if (taxa>0) {
            this.taxaImportacao = taxa;
        } else {
            System.out.println("ERRO! O preço da taxa não pode ser negativo");
        }
    }
    
    public double getPrecoFinal(){
    return getPreco() +  taxaImportacao;
     }
    
    @Override
    public void vender(int qtd){
        double valorFinal = getPreco() + getTaxaImportacao();
        System.out.println("Preço final com taxa de importação aplicada: R$" + getPrecoFinal());
        super.vender(qtd);
    }
    
}

