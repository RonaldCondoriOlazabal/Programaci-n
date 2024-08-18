package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello and welcome\n");
        int nomVec1[] ={1,2,3,4,5,6,7,8,9,10};


        for (int dato: nomVec1) {
            System.out.println(dato);

        }
        Personas nomVec2[] = {new Personas( " Juan ","", 'M'),(new Personas(" Pablito ", "", 'M'))};
        System.out.println("Registro de asistencia");

        Scanner leer = new Scanner(System.in);

        for (Personas p:nomVec2){
            System.out.println(" Esta presente " +p.nombre+ " : ");

            p.fechaReg=new Date();
            p.setEstadoAsis(leer.nextLine());
        }
        System.out.println("Mostrar registro de asistencia");

        for (Personas p:nomVec2){
            System.out.println(p.getNombre()+"-"+p.getEstadoAsis()+"-"+p.fechaReg);
        }
    }
}