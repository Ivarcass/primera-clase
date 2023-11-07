public class Restaurante{
    private String nombre;
    private int beneficio;
    private boolean abierto;

    public Restaurante(int newBeneficio, String newNombre){
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
    
    public String devolverEstado(){
        String estado;
        String horario;
        if (abierto == true){
            horario = "Si";
        }
        else{
            horario = "No";
        }
        estado = "Mi restaurante se llama " + nombre + " tiene " + beneficio + " euros de beneficio y ¿Ahora esta abierto? " + horario;
        return(estado);
    }
    
    public void imprimirEstado(){
        String horario;
        if (abierto == true){
            horario = "Si";
        }
        else{
            horario = "No";
        }
        System.out.println("Mi restaurante se llama " + nombre + " tiene " + beneficio + " euros de beneficio y ¿Ahora esta abierto? " + horario);
    }
}