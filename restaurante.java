public class restaurante{
    private String nombre;
    private int beneficio;
    private boolean abierto;

    public restaurante(int newBeneficio, String newNombre){
        abierto = false;
        beneficio = newBeneficio;
        nombre = newNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getBeneficio(){
        return beneficio;
    }
    
    public boolean getAbierto(){
        return abierto;
    }
    
    public void setNombre(String newNombre){
        nombre = newNombre;
    }
    
    public void setBeneficio(int gastos){
        beneficio = beneficio - gastos;
    }
    
    public void setAbierto(){
        if (abierto == true){
            abierto = false;
        }
        else{
            abierto = true;
        }
    }
}