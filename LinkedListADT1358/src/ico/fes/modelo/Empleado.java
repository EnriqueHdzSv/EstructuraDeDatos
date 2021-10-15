package ico.fes.modelo;
public class Empleado {
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private float sueldobase;
    private int anioIngreso;
    private int horasExtras;
    
    public Empleado(){
    }
    public Empleado(int id, String nombre, String paterno, String materno, float sueldobase, int anioIngreso,int horasExtras){
        this.id=id;
        this.nombre=nombre;
        this.paterno=paterno;
        this.materno=materno;
        this.sueldobase=sueldobase;
        this.anioIngreso=anioIngreso;
        this.horasExtras=horasExtras;        
    }
}
