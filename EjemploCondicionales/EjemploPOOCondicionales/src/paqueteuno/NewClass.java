
package paqueteuno;

public class NewClass {
    public static void main(String[] args) {
        Hospital n1=new Hospital("Isidro Ayora",200,30);
        System.out.printf(" %s\n",n1.obtenerCiudadHospital());
        n1.establecerCiudadHospital("Loja");
         System.out.printf(" %s\n",n1.obtenerCiudadHospital());
         System.out.printf(" %s\n",n1);
    }
}
