/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticos;

/**
 *
 * @author Mati
 */
public class Electrodomestico {
    public static final String COLOR = "blanco";
    public static final int PRECIO = 100;
    public static final char CONSUMO = 'F';
    public static final int PESO = 5;
    private int precioBase = PRECIO;
    private String color  = COLOR;
    private char consumo = CONSUMO;
    private int peso = PESO;

    public Electrodomestico() {}
    public Electrodomestico(int precio, int peso) throws Exception {
        setPrecioBase(precio);
        setPeso(peso);
    }
    public Electrodomestico(int precio, int peso, String color, char consumo) throws Exception {
        setPrecioBase(precio);
        setPeso(peso);
        setColor(color);
        setConsumo(consumo);
        comprobarColor(this.color);
        comprobarConsumoEnergetico(this.consumo);
    }
    

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) throws Exception {
        if (precioBase < 0)
            throw new Exception("Could not be zero");
        this.precioBase = precioBase;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(char letra) {
        switch(letra) {
            case 'A' -> {
                if (getPrecioBase() != 100);
                setConsumo(CONSUMO);
            }
            case 'B' -> {
                if (getPrecioBase() != 80);
                setConsumo(CONSUMO);
            }
            case 'C' -> {
                if (getPrecioBase() != 60);
                setConsumo(CONSUMO);
            }
            case 'D' -> {
                if (getPrecioBase() != 50);
                setConsumo(CONSUMO);
            }
            case 'E' -> {
                if (getPrecioBase() != 30);
                setConsumo(CONSUMO);
            }
            case 'F' -> {
                if (getPrecioBase() != 10);
                setConsumo(CONSUMO);
            }
            default -> setConsumo(CONSUMO);
        }
    }
    
    public void comprobarColor(String color) {
        switch(color) {
            case "blanco", "negro", "rojo", "azul", "gris" -> {
            }
            default -> setColor(COLOR);
        }
    }
    
    public void precioFinal() throws Exception {
        switch(getConsumo()) {
            case 'A' -> {
                setPrecioBase(precioBase+100);
            }
            case 'B' -> {
                setPrecioBase(precioBase+80);
            }
            case 'C' -> {
                setPrecioBase(precioBase+60);
            }
            case 'D' -> {
               setPrecioBase(precioBase+50);
            }
            case 'E' -> {
               setPrecioBase(precioBase+30);
            }
            case 'F' -> {
                setPrecioBase(precioBase+10);
            }
        }
        if (getPeso()<= 19) {
            setPrecioBase(precioBase+10);
        } else if (getPeso()<= 49) {
            setPrecioBase(precioBase+50);
        } else if (getPeso()<= 79) {            
            setPrecioBase(precioBase+80);
        } else {
            setPrecioBase(precioBase+100);
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
}
