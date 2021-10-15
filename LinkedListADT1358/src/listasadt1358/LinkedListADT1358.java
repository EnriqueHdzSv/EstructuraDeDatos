package listasadt1358;
import ico.fes.unam.edd1358.LinkedListADT;
import ico.fes.modelo.Empleado;
public class LinkedListADT1358 {
    public static void main(String[] args ){
    LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("José"));
        lsl.append(new String("Mariana"));
        lsl.append(new String("Diego"));
        lsl.append(new String("Eiram"));
        lsl.append("Daniela");
        lsl.transversal();
    LinkedListADT lsl2 = new LinkedListADT();
        lsl2.append(new Empleado(1, "José", "Pérez","García" , 1850.5f, 2015, 4));
        lsl2.append(new Empleado(1, "Diego", "Pérez","Hernández" , 1950.5f, 2017, 5));
        lsl2.append(new Empleado(1, "Diana", "Bonilla","García" , 2850.5f, 2010, 7));
        lsl2.append(new Empleado(1, "Daniela", "Casilla","López" , 3850.5f, 2019, 8));
        lsl2.transversal();
    }  
}
