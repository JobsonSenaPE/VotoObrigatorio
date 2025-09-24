
import java.util.Scanner;
public class AnoNascimento {

    public static void main(String[] args) {


        //Faça um programa que leia o ano de nascimento de uma pessoa,
        //calcule a idade dela e depois mostre se ela pode ou não votar.
        Scanner scan = new Scanner(System.in);


        int idade = 0;
        int ano=0;
        int anoNascimento = 0;
        System.out.println("Digite o ano que você nasceu:");
        anoNascimento = scan.nextInt();

        int votar = 2025-anoNascimento;
        if(votar<16) {
            System.out.println("Você tem " + votar + " anos. Você não pode votar!");}
        else if (votar>= 16 && votar <18) {
            System.out.println("Você tem " + votar + " anos. Seu voto é opcional! Vote se quiser");}
        else if (votar>=65) {
            System.out.println("Você tem " + votar + " anos. Seu voto é opcional! Vote se quiser");}
        else {System.out.println("Você tem " + votar + " anos. Seu voto é obrigatório!");

        }




    }

}
