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
        System.out.println("Proceda a ingresar su fecha de cumpleaños");
        String birthday = fechaCalculada();
        System.out.println("Su cumpleaños fue el "+ birthday);
        Human h1 = new Human(peso, birthday,altura );
        System.out.println("Quiere calcular su salud en base a su altura y peso?1.SiOtro.No");
        int opcion = scan.nextInt();
        if(opcion == 1){
            System.out.println("Procedemos a calcular su salud en base a su altura y peso");
            System.out.println(h1.esPesoIdeal());
        }

        System.out.println("Procedemos a calcular su edad");
        System.out.println("Ingrese la fecha actual");
        String actual = fechaCalculada();
        System.out.println("Ingresaste la fecha " +actual);
        System.out.println(h1.calcularEdad(actual));

    }
    public static String fechaCalculada(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ahora ingrese el dia");
        int dia = scan.nextInt();
        System.out.println("Ingrese el mes");
        int mes = scan.nextInt();
        System.out.println("Ingrese el anio");
        int anio = scan.nextInt();
        String fecha = dia+"/"+mes+"/"+anio;
        return fecha;
    }
}