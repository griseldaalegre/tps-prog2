package tp11.sitioWebNoticias;


import tp11.sitioWebNoticias.condiciones.Condicion;

import java.util.ArrayList;

//Simple
public class Noticia extends ComponenteNoticia {
    private ComponenteNoticia asociadaA; // categoria, seccion subseccion
    private String titulo;
    private String introduccion;
    private String texto;
    private String autor;
    private String linkAsociado; // el link asociado a que apunta?
    private ArrayList<String> palabrasClaves;

    public Noticia(ComponenteNoticia asociadaA, String titulo, String introduccion, String texto, String autor, String linkAsociado) {
        this.asociadaA = asociadaA;
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.linkAsociado = linkAsociado;
        this.palabrasClaves = new ArrayList<String>();
    }

    public ComponenteNoticia getAsociadaA() {
        return asociadaA;
    }

    public void setAsociadaA(ComponenteNoticia asociadaA) {
        this.asociadaA = asociadaA;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLinkAsociado() {
        return linkAsociado;
    }

    public void setLinkAsociado(String linkAsociado) {
        this.linkAsociado = linkAsociado;
    }

    public void addPalabraClave(String palabra) {
        if (!tienePalabraClave(palabra)) { //uso el metodo de abajo
            this.palabrasClaves.add(palabra.toUpperCase());
        }
    }

    public void deletePalabra(String palabra) {
        this.palabrasClaves.remove(palabra.toUpperCase());
    }

    public boolean tienePalabraClave(String palabra) {
        return this.palabrasClaves.contains(palabra.toUpperCase());
    }

    public int cantidadDeNoticias() {
        return 1;
    }

    public ArrayList<Noticia> noticiasCon(Condicion c) {
        ArrayList resultado = new ArrayList<>();
        if (c.cumple(this)) { //EN LA ESTRUCTURA SIMPLE SI SE PUEDE HACER UN IF
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public int cantidadNoticias() {
        return 0;
    }



    @Override
    public ComponenteNoticia crearContenedor() {
        return null;
    }

    @Override
    public ComponenteNoticia getCopia() {
        return new Noticia(
                this.getAsociadaA(),
                this.getTitulo(),
                this.getIntroduccion(),
                this.getTexto(),
                this.getAutor(),
                this.linkAsociado);
    }

    public ArrayList<String> copiaPalabrasClaves() {
        ArrayList<String> copia = new ArrayList<>();
        for (String p : palabrasClaves) {
            copia.add(p);
        }
        return copia;
    }


}
