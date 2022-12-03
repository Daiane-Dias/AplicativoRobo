package com.daiane.trabalhodaianedias.Controller;

import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.daiane.trabalhodaianedias.Models.MarcianoPremium;

@RestController
public class IndexController {
    @GetMapping(value="/")
    public void getResposta(){
        String opcao = "S";
        Scanner scan = new Scanner(System.in);
        while(opcao.equals("S") || opcao.equals("s")){
		MarcianoPremium pergunta = new MarcianoPremium();
		System.out.printf("%nDigite sua pergunta: ");
        pergunta.setPergunta(scan.nextLine());
        System.out.printf("%nDigite o primeiro numero: ");
        pergunta.setNum1(scan.nextDouble());
        System.out.printf("%nDigite o segundo numero: ");
        pergunta.setNum2(scan.nextDouble());
        System.out.printf("%nDigite qual a operação matematica deseja realizar:%n1 para Adição %n2 para subtração %n3 para multiplicação %n4 para divisão%n");
        pergunta.setOperacao(scan.nextInt());
        System.out.printf("%nDigite a palavra a ser repitida 10 vezes: ");
        pergunta.setPalavra(scan.next());
		System.out.printf(pergunta.responda(pergunta.getPergunta(),pergunta.getNum1(),pergunta.getNum2(),pergunta.getOperacao(),pergunta.getPalavra()));
        System.out.printf("%nDeseja fazer mais uma pergunta, se não digite FIM para finalizar ou S para continuar.");
        opcao = scan.next();
        System.out.printf("%n%n%n");
   
    }
    scan.close();
}
    
}
