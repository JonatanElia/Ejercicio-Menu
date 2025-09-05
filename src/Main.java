import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu (){
        int opcion;
        boolean bandera=true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Menu de opciones:");
            System.out.println("1.Dado 2 20 rondas");
            System.out.println("2.Dado 3 20 rondas");
            System.out.println("3.Ejercicio IMC");
            System.out.println("4.Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    dados2();
                    break;
                case 2:
                    dados3();
                    break;
                case 3:
                    System.out.println(ejercicioIMC());
                    break;
                case 4:
                    bandera=false;
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        }while (bandera);
    }
    public static void dados2 (){
        Random aleatorio = new Random();
        int primerDado=0,segundoDado=0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Ronda "+i);
            primerDado += aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Acumulado primer dado "+primerDado);
            segundoDado += aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Acumulado segundo dado "+segundoDado);
        }
        if (primerDado > segundoDado) {
            System.out.println("Gana dado 1");
        }
        else if (primerDado < segundoDado) {
            System.out.println("Gana dado 2");
        }
        else  {
            System.out.println("Empate");
        }
    }
    public static void dados3 (){
        Random aleatorio = new Random();
        int primerDado=0,segundoDado=0,tercerDado=0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Ronda "+i);
            primerDado += aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Acumulado primer dado "+primerDado);
            segundoDado += aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Acumulado segundo dado "+segundoDado);
            tercerDado += aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Acumulado tercer dado "+tercerDado);

        }
        if (primerDado==segundoDado && segundoDado==tercerDado) {
            System.out.println("Todos los dados empataron");
        }
        if (primerDado==segundoDado || segundoDado==tercerDado || primerDado==tercerDado) {
            if(primerDado==segundoDado) {
                System.out.println("Primer dado es igual a segundo dado");
            } else if(segundoDado==tercerDado) {
                System.out.println("Segundo dado es igual a tercer dado");
            }
            else {
                System.out.println("Primer dado es igual a tercer dado");
            }
        }
        if (primerDado>segundoDado || primerDado>tercerDado ) {
            if (primerDado>segundoDado && primerDado>tercerDado){
                System.out.println("Primer dado esta en la 1° posicion");
            }
            else {
                System.out.println("Primer dado esta en la 2° posicion");
            }
        }else if (primerDado<segundoDado && primerDado<tercerDado) {
            System.out.println("Primer dado esta en la 3° posicion");
        }
        if (segundoDado>primerDado || segundoDado>tercerDado ) {
            if (segundoDado>primerDado && segundoDado>tercerDado) {
                System.out.println("Segundo dado esta en la 1° posicion");
            }
            else {
                System.out.println("Segundo dado esta en la 2° posicion");
            }
        }else  if (segundoDado<primerDado && segundoDado<tercerDado) {
            System.out.println("Segundo dado esta en la 3° posicion");
        }
        if (tercerDado>primerDado || tercerDado>segundoDado ) {
            if (tercerDado>primerDado && tercerDado>segundoDado){
                System.out.println("Tercer dado esta en la 1° posicion");
            }
            else {
                System.out.println("Tercer dado esta en la 2° posicion");
            }
        }else if (tercerDado<primerDado && tercerDado<segundoDado){
            System.out.println("Tercer dado esta en la 3° posicion");
        }
    }
    public static String ejercicioIMC (){
        Scanner sc = new Scanner(System.in);
        String situacion="";
        double peso, altura,IMC;
        System.out.println("Ejercicio IMC");
        System.out.println("Ingrese el peso:");
        peso = sc.nextDouble();
        System.out.println("Ingrese el altura:");
        altura = sc.nextDouble();
        IMC = peso/(altura*altura);
        if (IMC<18.5){
            situacion = "Bajo peso";
        }else if (IMC<25){
            situacion = "Peso normal";
        }else if (IMC<27){
            situacion = "Sobrepeso tipo 1";
        }else if (IMC<30){
            situacion = "Sobrepeso tipo 2";
        }else if (IMC<35){
            situacion = "obesidad tipo 1";
        }else if (IMC<40){
            situacion = "obesidad tipo 2";
        }else if (IMC<50){
            situacion = "Obesidad tipo 3 morbida";
        }else if (IMC>50){
            situacion = "Obesidad extrema";
        }
        return situacion;
    }

}