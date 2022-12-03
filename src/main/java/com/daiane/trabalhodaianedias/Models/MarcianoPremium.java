package com.daiane.trabalhodaianedias.Models;

public class MarcianoPremium  extends MarcianoAvancado implements IMarcianoPremium{
    private String palavra;

    public MarcianoPremium(){

        super();
        this.palavra = "";  
    }
    public void setPalavra(String palavra){
        this.palavra = palavra;
    }
    public String getPalavra(){
        return this.palavra;
    }
    public String responda(String valor, double num1, double num2, int operacao, String palavra){
        double resultado = 0.0;
        String texto = ExibirTexto(valor);
         String exibindo =ExibirDezVezesUmaPalavra(palavra);
        System.out.printf("%n %s",texto,"%n");
        System.out.printf("%n %s",exibindo,"%n");
        System.out.printf("%nEssa eu sei%n");
       
        if(operacao == 1){
            resultado = num1+num2;
          
        } 
        else if(operacao == 2){
            resultado = num1-num2;
           
           
        }
        else if(operacao == 3){
            resultado = num1*num2;
          
        }
        else if(operacao == 4){
            resultado = num1/num2;
           
        }
        
 return String.valueOf(resultado);
   }
    public String ExibirDezVezesUmaPalavra(String palavra){
if(!palavra.isEmpty()){
    for(int i = 0; i <= 9; i++){
        System.out.printf("%n %s",palavra);
    }
    }
    return "";
    }
    static String ExibirTexto(String valor){
        if (valor.isEmpty() || valor == "")
        {
            return "Não me incomode";
        }
       
        else if(valor == valor.toUpperCase() && valor.contains("?")){
            return "Relaxa, eu sei o que estou fazendo!";
        }
        else if(valor == valor.toUpperCase())
        {
            return "Opa! Calma aí!";
        }
        else if(!valor.isEmpty() && valor.contains("?")){
            return "Certamente";
        }
        else if(valor.contains("Eu")|| valor.contains("eu")){
            return "A responsabilidade é sua";
        } 
        else if(valor.contains("agir")){
            return  "É pra já!";
        }
       else{
        return "Tudo bem, como quiser";
       }
       }
}
