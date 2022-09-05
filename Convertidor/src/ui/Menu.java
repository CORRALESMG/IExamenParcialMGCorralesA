/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author GCAM
 */
public class Menu implements iMenu {
Scanner sn = new Scanner (System.in);
    private int num1;
    @Override
    public void mostrar() {
        mostrarOpciones();
    }

    @Override
    public void mostrarOpciones() {
            System.out.println("Selecciona una Opcion");
            System.out.println("1. Bytes a Kilobytes ");
    System.out.println("2. Kilobytes a Megabytes");
    System.out.println("3. Salir");
    
    int Opcion = sn.nextInt();
    mostrarOpcionseleccionada(Opcion);
    }

    @Override
    public void mostrarOpcionseleccionada(int Opcion) {
        boolean volver = false;
		float Bytes, kiloBytes, megabytes, result;
		switch(Opcion){


			case 1:
				System.out.println("Ha Seleccionado Bytes a Kilobytes ");
				System.out.println("Ingrese la cantidad de Bytes");
                                Bytes = sn.nextFloat();
				float kB = Bytes / 1000;
				System.out.println("El tamaÃ±o en KB es =" + kB + "   " );

				while (!volver) {
					System.out.println(" desea Volver al menÃº  ?");
					System.out.println("1-Seguir calculando");
					System.out.println("2-Volver al menu");
					num1 = sn.nextInt();
					if (Opcion == 1) {
						mostrarOpcionseleccionada(Opcion);
						boolean back = true;
					} else {
						mostrar();
						break;
					}

				}
				break;
			case 2:
				System.out.println("Ha Seleccionado Kilobytes a Megabiytes");
				System.out.println("Introduzca La Cantidad de Kilobytes");
        float kilobytes = sn.nextFloat();
				result = kilobytes/1024;
				System.out.println("El Resultado de Kilobytes a Megabytes Es " + result);
				while (!volver) {
					System.out.println(" desea Volver al menÃº  ?");
					System.out.println("1-Seguir calculando");
					System.out.println("2-Volver al menu");
					num1 = sn.nextInt();
					if (Opcion == 1) {
						mostrarOpcionseleccionada(Opcion);
						boolean back = true;
					} else {
						mostrar();
						break;
					}

				}

				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Solo Numeros entre 1 y 3");
				break;
			}
}
}