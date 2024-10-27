package org.javmart.genericsclasss;

public class EjemploGenericos {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Josefino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));

        for(Animal a: transporteCaballos) {
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }
    }
}
