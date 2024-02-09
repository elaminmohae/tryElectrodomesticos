/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticos;


public class Television extends Electrodomestico {
    private int resolucion = RESOLUCION;
    private boolean sintonizadorTdt = SINTONIZADORTDT;
    public final static int RESOLUCION = 20;
    public final static boolean SINTONIZADORTDT = false;

    public Television() {}
    public Television(int precio, int peso) throws Exception {
        super(precio, peso);
    }
    public Television(int precio, int peso, String color, char consumo, int resolucion, boolean sintonizadorTdt) throws Exception {
        super(precio, peso, color, consumo);
        setResolucion(resolucion);
        setSintonizadorTdt(sintonizadorTdt);
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }
    
    
    @Override
    public void precioFinal() throws Exception{
        super.precioFinal();
        if (resolucion > 40){
            setPrecioBase((int) (getPrecioBase() + (getPrecioBase() * 0.30)));
            
        }
        if (sintonizadorTdt){
            setPrecioBase(getPrecioBase() + 50);
        }
        
    }
    
    
}
