public class Alumno {
    String nombre, matricula;
    double cal1, cal2, cal3, promedio;


    public Alumno (String nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public void setCalificacion(double cal1, double cal2, double cal3){
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;

    }

    public void calcularPromedio(){
        double promedio = (cal1 + cal2 +cal3)/3;
        this.promedio = promedio;
    }
    
    public void mostrarAlumno(){
        System.out.print("NOMBRE: "+this.nombre);
        System.out.print("MATRICULA: "+this.nombre);
        System.out.print("CALIFICACION 1: "+this.cal1+"\nCALIFICACION 2: "+this.cal2+"\nCALIFICACION 3: "+this.cal3);
        System.out.print("TU PROMEDIO: "+this.promedio);
    }





   



}