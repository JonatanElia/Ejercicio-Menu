import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu (){
        Scanner sc = new Scanner(System.in);

        int opcion,a;
        boolean bandera=true;
        do{
            System.out.println("Menu de opciones:");
            System.out.println("1.Dado 2 20 rondas");
            System.out.println("2.Dado 3 20 rondas");
            System.out.println("3.Ejercicio IMC");
            System.out.println("4.Notas de estudiantes");
            System.out.println("5.Carrera");
            System.out.println("6.Salir");
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
                    promedioNotasDeEstudiantes();
                    break;
                case 5:
                    carrera();
                    break;
                case 6:
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
    public static void promedioNotasDeEstudiantes(){
        Scanner sc = new Scanner(System.in);
        int numeroNotas,nota,numeroEstudiantes,promedio=0,sumaPromedio=0;
        System.out.println("Ingrese número de estudiantes:");
        numeroEstudiantes= sc.nextInt();
        System.out.println("Ingrese número de notas:");
        numeroNotas= sc.nextInt();
        for (int i=1; i<=numeroEstudiantes; i++) {
            System.out.println("\nEstudiante "+i);
            for (int k=1; k<=numeroNotas; k++) {
                System.out.println("Ingrese nota "+k+" de 10 a 50");
                nota=sc.nextInt();
                if(nota<=50 && nota>=10){
                    promedio+=nota/k;
                }else{
                    System.out.println("El valor es invalido");
                    k-=1;
                }
            }
            System.out.println("El promedio del estudiante es:"+promedio);
            sumaPromedio+=promedio/i;
        }
        System.out.println("El promedio de los estudiantes es: "+sumaPromedio);
    }
    public static void carrera(){
        Random aleatorio = new Random();
        boolean carrera=true;
        int corredor1,corredor2,contadorCorredor1=0,contadorCorredor2=0,momento=0;
        do {
            corredor1=aleatorio.nextInt((6-1)+1)+1;
            corredor2=aleatorio.nextInt((6-1)+1)+1;
            momento++;
            if(corredor1==6||corredor2==6){
                if(corredor1==6){
                    contadorCorredor1-=2;
                }
                else{
                    contadorCorredor1+=corredor1;
                }
                if(corredor2==6){
                    contadorCorredor2-=2;
                }
                else {
                    contadorCorredor2+=corredor2;
                }
            }else {
                contadorCorredor1+=corredor1;
                contadorCorredor2+=corredor2;
            }
            System.out.println("--En el "+momento+"° momento--");
            System.out.println("El corredor 1 saco:"+corredor1);
            System.out.println("El corredor 2 saco:"+corredor2);
            System.out.println("El contador corredor 1 es:"+contadorCorredor1);
            System.out.println("El contador corredor 2 es:"+contadorCorredor2);
            if(contadorCorredor1>=50 || contadorCorredor2>=50){
                if(contadorCorredor1>contadorCorredor2){
                    System.out.println("Gana corredor 1");;
                }else if(contadorCorredor1<contadorCorredor2){
                    System.out.println("Gana corredor 2");;
                }else{
                    System.out.println("Empatan los dos corredores");
                }
                carrera=false;
            }
        }while(carrera);
    }

}