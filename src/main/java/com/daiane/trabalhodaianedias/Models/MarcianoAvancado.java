package com.daiane.trabalhodaianedias.Models;


public class MarcianoAvancado extends Marciano {
    private double num1;
    private double num2;
    private int operacao;
    public  MarcianoAvancado(){
        super();
        this.num1 = 0.0;
        this.num2 = 0.0;
        this.operacao = 0;

    }
    public void setNum1(double num1){
        this.num1 = num1;
    }
    public double getNum1(){
        return this.num1;
    }
    public void setNum2(double num2){
        this.num2 = num2;
    }
    public double getNum2(){
        return this.num2;
    }
    public void setOperacao(int operacao){
        this.operacao = operacao;
    }
    public int getOperacao(){
        return this.operacao;
    }
   
    public String responda(String valor, double num1, double num2, int operacao){
        double resultado;
        String texto = ExibirTexto(valor);

        System.out.printf("%s",texto,"%n");
        System.out.printf("%nEssa eu sei%n");
       
        if(operacao == 1){
            resultado = num1+num2;
           return String.valueOf(resultado);
        } 
        else if(operacao == 2){
            resultado = num1-num2;
           
           return String.valueOf(resultado);
        }
        else if(operacao == 3){
            resultado = num1*num2;
            return String.valueOf(resultado);
        }
        else if(operacao == 4){
            resultado = num1/num2;
            return String.valueOf(resultado);
        }
 return null;
   }
   
}