package com.mycompany.project11;
import java.util.Scanner;

public class Project11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int X = in.nextInt();
        if((X % 2) == 0){
            System.out.println("Sim, é multiplo de 2");
        }else{
            System.out.println("Não, não é multiplo de 2");
        }
    }
}
