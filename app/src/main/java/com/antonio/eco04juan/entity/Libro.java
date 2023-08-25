package com.antonio.eco04juan.entity;

public class Libro {

    private int codlibro;
    private String nomlibro;
    private String autor;
    private String genero;
    private String resumen;
    private double precio;
    private String imgurl;
    private Boolean favorito;

    public Libro() {
    }

    public Libro(int codlibro, Boolean favorito) {
        this.favorito = favorito;
        this.codlibro = codlibro;
    }

    public Libro(int codlibro, String nomlibro, String autor, String genero, String resumen, double precio, String imgurl, Boolean favorito) {
        this.codlibro = codlibro;
        this.nomlibro = nomlibro;
        this.autor = autor;
        this.genero = genero;
        this.resumen = resumen;
        this.precio = precio;
        this.imgurl = imgurl;
        this.favorito = favorito;
    }

    public int getCodlibro() {
        return codlibro;
    }

    public void setCodlibro(int codlibro) {
        this.codlibro = codlibro;
    }

    public String getNomlibro() {
        return nomlibro;
    }

    public void setNomlibro(String nomlibro) {
        this.nomlibro = nomlibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }
}
