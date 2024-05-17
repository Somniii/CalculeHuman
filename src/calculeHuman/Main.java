package calculeHuman;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido humano ingrese su peso");
        double peso = scan.nextDouble();
        System.out.println("Ahora ingrese su altura");
        double altura = scan.nextDouble();
        System.out.println("Ahora ingrese su dia de nacimiento");
        int dia = scan.nextInt();
        System.out.println("Su mes de nacimiento");
        int mes = scan.nextInt();
        System.out.println("Su año de nacimiento");
        int anio = scan.nextInt();
        String birthday = dia+"/"+mes+"/"+anio;
        System.out.println("Su cumpleaños fue el "+ birthday);
        Human h1 = new Human(peso, birthday,altura );
        System.out.println("Procedemos a calcular su salud en base a su altura y peso");
        System.out.println(h1.esPesoIdeal());


    }
}