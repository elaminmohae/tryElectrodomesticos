package electrodomesticos;

public class Lavadora extends Electrodomestico{
    private int carga = CARGA;
    public static final int CARGA = 5;

    public Lavadora() {}
    public Lavadora(int precio, int peso) throws Exception {
        super(precio, peso);
    }
    public Lavadora(int precio, int peso, String color, char consumo, int carga) throws Exception {
        super(precio, peso, color, consumo);
        setCarga(carga);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public void precioFinal() throws Exception{
        super.precioFinal();
        if (carga >= 30){
            setPrecioBase(getPrecioBase() + 50);
        }
        
    }
    
}
