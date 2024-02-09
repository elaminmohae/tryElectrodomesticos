/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electrodomesticos;
import electrodomesticos.*;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int precio = 0;
        try {
            precio = lector.nextInt();
        } catch (Exception ex) {
            System.out.println("Incorrecto");
        }
        
        try {
            precio = lector.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        
        Electrodomestico[] arrElectrodomesticos = new Electrodomestico[10];
        arrElectrodomesticos[0] = new Lavadora(precio, 100, "blanco", 'A', 45);
        arrElectrodomesticos[1] = new Lavadora(50, 900, "negro", 'C', 45);
        arrElectrodomesticos[2] = new Lavadora(40, 23, "rojo", 'D', 20);
        arrElectrodomesticos[3] = new Lavadora(59, 12, "griis", 'O', 45);
        arrElectrodomesticos[4] = new Lavadora(400, 60, "gris", 'A', 89);
        
        arrElectrodomesticos[5] = new Television(100, 76, "blanco", 'F', 45, true);
        arrElectrodomesticos[6] = new Television(100, 90, "blanco", 'A', 50, true);
        arrElectrodomesticos[7] = new Television(32, 79, "rojo", 'D', 80, false);
        arrElectrodomesticos[8] = new Television(89, 34, "negro", 'F', 9000, false);
        arrElectrodomesticos[9] = new Electrodomestico(70, 909, "Rojo", 'A');
 
        for (int i = 0; i < arrElectrodomesticos.length ; i++) {
            arrElectrodomesticos[i].precioFinal();
            
        }
        int sumaElectrodomesticos = 0;
        int sumaTelevisiones = 0;
        int sumaLavadoras = 0;
        for (int i = 0; i < arrElectrodomesticos.length ; i++){
            sumaElectrodomesticos += arrElectrodomesticos[i].getPrecioBase();
            if (arrElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras += arrElectrodomesticos[i].getPrecioBase();
            }
            else if (arrElectrodomesticos[i] instanceof Television){
                sumaTelevisiones += arrElectrodomesticos[i].getPrecioBase();
            }
            
        }
        System.out.println(arrElectrodomesticos[3]);
        System.out.println("Precio televisiones:"+sumaTelevisiones);
        System.out.println("Precio lavadores:"+sumaLavadoras);
        System.out.println("Precio electrodomesticos:"+sumaElectrodomesticos);
        
        
        
        
    }
    
}
