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
    
    public void estado(){
        System.out.println(nombre + beneficio + abierto);
    }
    
    public void stEstado(){
        System.out.println("Mi restaurante se llama " + nombre + " tiene " + beneficio + " euros de beneficio y ¿Ahora esta abierto? " + abierto);
    }
}