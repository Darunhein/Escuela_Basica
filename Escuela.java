import java.util.Scanner;
public class Escuela{
    String alumno1, alumno2, alumno3, alumno4, alumno5;
    Scanner sc = new Scanner(System.in);
    public void agregarAlumno(){
        System.out.println("INGRESE SU NOMBRE: ");
        String nombre = sc.nextLine();
        System.out.println("INGRESE SU MATRICULA: ");
        String matricula = sc.nextLine();
        System.out.println("INGRESE CALIFICACION 1: ");
        double cal1 = sc.nextDouble();
        System.out.println("INGRESE CALIFICACION 2: ");
        double cal2 = sc.nextDouble();
        System.out.println("INGRESE CALIFICACION 3: ");
        double cal3 = sc.nextDouble();
    }


}