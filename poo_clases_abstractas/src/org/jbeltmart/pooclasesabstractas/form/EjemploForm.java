package org.jbeltmart.pooclasesabstractas.form;

import org.jbeltmart.pooclasesabstractas.form.elementos.ElementoForm;
import org.jbeltmart.pooclasesabstractas.form.elementos.InputForm;
import org.jbeltmart.pooclasesabstractas.form.elementos.SelectForm;
import org.jbeltmart.pooclasesabstractas.form.elementos.TextareaForm;
import org.jbeltmart.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "Javascript"))
        .addOpcion(new Opcion("4", "Typecript"))
        .addOpcion(new Opcion("5", "PHP"));

        username.setValor("jav.beltmart");
        password.setValor("a1b2c3");
        email.setValor("javmart@email.com");
        edad.setValor("29");
        experiencia.setValor("... más de 3 años de experiencia ...");
        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        for(ElementoForm e: elementos) {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }

    }
}
