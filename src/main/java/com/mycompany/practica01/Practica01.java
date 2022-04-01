/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica01;

/**
 *
 * @author Adrian
 */
public class Practica01 {
     public static void main(String[] args) {
        //Cargar autos
        var auto1 = new Auto();
        auto1.Color="rojo";
        auto1.IsUsed=true;
        auto1.Kilometraje=17800;
        auto1.Marca="chevrolet";        
        var auto2 = new Auto();
        auto2.Color="blanco";
        auto2.IsUsed=false;
        auto2.Kilometraje=0;
        auto2.Marca="Kia";
        
        //cargar Celulares
        var celular1 = new Celular();
        celular1.Marca="Xiaomi";
        celular1.Color="Negro";
        celular1.Modelo="redmi Note 10";
        celular1.Almacenamiento="128GB";        
        var celular2 = new Celular();
        celular2.Almacenamiento="512GB";
        celular2.Color="Azul";
        celular2.Marca="Apple";
        celular2.Modelo="Iphone 12";
        
        //Computador
        var computador1 = new Computador();
        computador1.Memoria=512;
        computador1.Procesador="Intel I5";
        computador1.Marca="lenovo";
        computador1.Precio=500;
        var computador2 = new Computador();
        computador2.Marca="lenovo";
        computador2.Memoria=512;
        computador2.Precio=600;
        computador2.Procesador="Ryzen 5";
                
        //Estudiante
        var estudiante1 = new Estudiante();
        estudiante1.calificacion = 80;
        estudiante1.carrera="Computacion";
        estudiante1.cedula="0107951170";
        estudiante1.nombre="Adrian Capoverde";
        var estudiante2 = new Estudiante();
        estudiante2.calificacion=76;
        estudiante2.carrera="Computacion";
        estudiante2.cedula="0106059495";
        estudiante2.nombre="Juan Arevalo";
        
        //Producto
        var producto1 = new Producto();
        producto1.Codigo="09395402";
        producto1.Categoria="Teclado";
        producto1.Descripcion="Teclado Inalambrico Genius";
        producto1.Precio=14.99;
        var producto2 = new Producto();
        producto2.Categoria="Celular";
        producto2.Codigo="84038492";
        producto2.Descripcion="Xiaomi Redmi Note 9";
        producto2.Precio=230.87;
        
        
       System.out.println("Auto 1");
        System.out.println("Color: " + auto1.Color + " Usado: " + auto1.IsUsed + " Marca: " + auto1.Marca + " kilometraje: " + auto1.Kilometraje);
        System.out.println("Auto 2");
        System.out.println("Color: " + auto2.Color + " Usado: " + auto2.IsUsed + " Marca: " + auto2.Marca + " kilometraje: " + auto2.Kilometraje);
        System.out.println("Celular 1");
        System.out.println("Almacenamiento: " + celular1.Almacenamiento + " Color: " + celular1.Color + " Marca " + celular1.Marca + " Modelo: " + celular1.Modelo);
        System.out.println("Celular 2");
        System.out.println("Almacenamiento: " + celular2.Almacenamiento + " Color: " + celular2.Color + " Marca " + celular2.Marca + " Modelo: " + celular2.Modelo);
        System.out.println("Computador 1");
        System.out.println(" Marca " + computador1.Marca + " procesador " + computador1.Procesador + " Memoria " + computador1.Memoria + " Precio " + computador1.Precio);
        System.out.println("Computador 2");
        System.out.println(" Marca " + computador2.Marca + " procesador " + computador2.Procesador + " Memoria " + computador2.Memoria + " Precio " + computador2.Precio);
        System.out.println("Estudiante 1");
        System.out.println(estudiante1.nombre + " Cedula: " + estudiante1.cedula + " Carrera " + estudiante1.carrera + " Calificacion: " + estudiante1.calificacion);
        System.out.println("Estudiante 1");
        System.out.println(estudiante2.nombre + " Cedula: " + estudiante2.cedula + " Carrera " + estudiante2.carrera + " Calificacion: " + estudiante2.calificacion);
        System.out.println("Producto 1");
        System.out.println( "codigo: " + producto1.Codigo + " Categoria: " + producto1.Categoria + " Descripcion: " + producto1.Descripcion + " precio: " + producto1.Precio);
        System.out.println("Producto 2");
        System.out.println( "codigo: " + producto2.Codigo + " Categoria: " + producto2.Categoria + " Descripcion: " + producto2.Descripcion + " precio: " + producto2.Precio);
        
    }  
}
