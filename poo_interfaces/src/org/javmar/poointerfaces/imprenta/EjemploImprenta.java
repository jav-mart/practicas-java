package org.javmar.poointerfaces.imprenta;

import org.javmar.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("Javier", "Beltran"), "Ingeniero Informático", "Graduado en ingenieria informática y con experiencia en desarrollo de software.");
                cv.addExperiencia("Java");
                cv.addExperiencia("React");
                cv.addExperiencia("Nextjs");
                cv.addExperiencia(".NET");

        Informe informe = new Informe(new Persona("Javier", "Beltran"), "Jhon Doe", "Estudio sobre Ciber Seguridad");

        imprimir(cv);
        imprimir(informe);


        Libro libro = new Libro(new Persona("Javier", "Beltran"), "Patrones de diseño", Genero.PROGRAMACION);

        libro.addPagina(new Pagina("Página de contenido"))
                .addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"));

        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
