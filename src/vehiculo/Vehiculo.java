/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author edwar
 */
public class Vehiculo {
    //Objeto vehiculo

    private String marca;
    private int modelo;
    private int precio;
    //creación de variables

    Scanner sc = new Scanner(System.in);
    //objeto que se instancia para reservar un espacio en la memoria
    Vehiculo vehiculos[] = new Vehiculo[4];
    //Arreglo de objetos instanciado para 4 objetos

    public Vehiculo() {//constructor vacio
    }

    public Vehiculo(String marca, int modelo, int precio) {//consturctor lleno
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void agregarVehiculo() {
        for (int i = 0; i < vehiculos.length; i++) {
            //recoore el arreglo
            
            System.out.print("Ingrese la marca: ");
            marca = sc.next();//atrapa los datos por el teclado
            System.out.print("Ingrese la modelo: ");
            modelo = sc.nextInt();//atrapa los datos por el teclado
            System.out.print("Ingrese la precio: ");
            precio = sc.nextInt(); //atrapa los datos por el teclado         
            vehiculos[i] = new Vehiculo(marca, modelo, precio);//guarda los datos en un objeto del arreglo
        }      
    }
    public void imprimir(){    
        DecimalFormat formatea = new DecimalFormat("###,###,###");//objeto que da el formato a los precios
        for (Vehiculo veh : vehiculos) {//recorre el arreglo de vehiculos
            System.out.println(veh.marca + " " + veh.modelo + " " 
                    + formatea.format(veh.precio) + " ");//imprime el arreglo
        }
    }

    public void vehiculoCaro() {
        int mprecio = 0;
        for (Vehiculo veh : vehiculos) {//for each de Tipo Vehiculo - instanciado veh - llamado vehiculos
            precio = veh.precio;//obtiene el precio en cada recorrido
            if (precio > mprecio) {//si el precio es mayor lo modifica
                mprecio = precio;
            }
        }
        System.out.println("El precio mayor es: " + mprecio);// imprime el precio mayor
    }
}
