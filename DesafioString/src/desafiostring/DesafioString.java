/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiostring;

import java.io.IOException;
import java.io.DataInputStream;

public class DesafioString {


    public static void main(String[] args) throws IOException{
        Double valor = 0.0, valorTotal = 0.0;
        String estado = "";
        DataInputStream dado;
        
        System.out.println("Digite seu valor: ");
        dado = new DataInputStream(System.in);
        valor = Double.parseDouble(dado.readLine());
        
        System.out.println("Digite seu estado: ");
        dado = new DataInputStream(System.in);
        estado = dado.readLine();
        
        if(estado.equalsIgnoreCase("MG")){
            valorTotal = valor + (valor * 0.07);
            System.out.println("O valor final do produto é de: " + valorTotal);
        }else if (estado.equalsIgnoreCase("SP")){
            valorTotal = valor + (valor * 0.12);
            System.out.println("O valor final do produto é de: " + valorTotal);
        }else if (estado.equalsIgnoreCase("RJ")){
            valorTotal = valor + (valor * 0.15);
            System.out.println("O valor final do produto é de: " + valorTotal);
        }else if(estado.equalsIgnoreCase("MS")){
            valorTotal = valor + (valor * 0.08);
            System.out.println("O valor final do produto é de: " + valorTotal);
        }else{
            System.out.println("Informação inválida, por favor insira uma opção válida!");
        }
    }
}