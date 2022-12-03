package com.daiane.trabalhodaianedias.Models;

public class Marciano {

    private String pergunta;

    public Marciano(){
        this.pergunta = "";
    }
public void setPergunta(String pergunta){
    this.pergunta = pergunta;
}
public String getPergunta(){
    return this.pergunta;
}
   public String responda(String valor){
    return  ExibirTexto(valor);
   
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
   else{
    return "Tudo bem, como quiser";
   }
   }
}
