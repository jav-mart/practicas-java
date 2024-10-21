package org.jbeltmart.pooclasesabstractas.form.validador;

public class LargoValidador extends Validador{
    protected String mensaje = "el campo debe tener mínimo %d caractere y máximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        this.mensaje = String.format(this.mensaje, min, max);

        if(valor == null) {
            return true;
        }

        if (valor.length() >= min && valor.length() <= max) {
            return true;
        }

        return false;
    }
}