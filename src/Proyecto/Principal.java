/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author IDEMNIAS
 */
public class Principal{

public static Menu m=new Menu ();
public static Agregarcontacto a=new Agregarcontacto();
public static Buscar b=new Buscar();
public static Eliminar e=new Eliminar();
public static Listar l=new Listar();
public static Modificar md=new Modificar();
public static Calendario c = new Calendario();
public static Ventanaerror v= new Ventanaerror();
public static String mensaje ;
public static Ventanacorrecto vc= new Ventanacorrecto();
public static int contador=0;
public static Fuente f = new Fuente();
public static ArrayList <Contacto> Contactos = new ArrayList <Contacto>();
public static int posicion;
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
    Scanner sc= new Scanner(System.in);
    File archivo = new File("contacto");
        
    try{    
        if (!archivo.exists()){ //DEVOLVE TRUE SI O ARQUICO EXISTE
            Contactos=new  ArrayList <Contacto>(); //SI o ARCHIVO NON EXISTE CREO A LISTA VACIA
        }
         else{//SI EXISTE O ARCHIVO LEEO A LISTA QUE HAI DENTRO DO ARCHIVO
            ObjectInputStream LContactos = new ObjectInputStream(new BufferedInputStream(new FileInputStream("contacto")));
            Contactos=(ArrayList <Contacto>) LContactos.readObject();
            LContactos.close();
        }
    }catch (Exception ex ){
            System.out.println("error de lectura");
           System.out.println(ex.getMessage());
    }
    System.out.println(Contactos.size());
    m.setVisible(true);
    
    }
    
}
