/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editoriala;

import java.util.ArrayList;
import java.util.Iterator;
import jerarquiaHerencia.Libro;
import jerarquiaHerencia.Periodico;
import jerarquiaHerencia.Publicaciones;
import jerarquiaHerencia.Revista;
import vista.tablaLibros;
import vista.tablaPeriodicos;
import vista.tablaRevista;

/**
 *
 * @author areli
 */
public class ManPublica {

    static ArrayList<Publicaciones> Arrpublica = new ArrayList<Publicaciones>();
    private Libro objLibro;
    private Revista objRevista;
    private Periodico objPeriodico;
    private Publicaciones objPublicaciones;

    public ManPublica(String tit, double precio, int np) {

        objPublicaciones = new Publicaciones();
        objPublicaciones.setTitulo(tit);
        objPublicaciones.setPrecio(precio);
        objPublicaciones.setNoPag(np);
    }

    public ManPublica() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void alta(String ISBN, String Autor, String edicion) {
        objLibro = new Libro();
        objLibro.setTitulo(objPublicaciones.getTitulo());
        objLibro.setPrecio(objPublicaciones.getPrecio());
        objLibro.setNoPag(objPublicaciones.getNoPag());
        objLibro.setAutor(Autor);
        objLibro.setISBN(ISBN);
        objLibro.setEdicion(edicion);
        Arrpublica.add(objLibro);
        
        String a, b, c, d, e, f;
        tablaLibros tl = new tablaLibros();
        a = objLibro.getTitulo();
        b = String.valueOf(objLibro.getPrecio());
        c = String.valueOf(objLibro.getNoPag());
        d = objLibro.getAutor();
        e = objLibro.getISBN();
        f = objLibro.getEdicion();
        String tpi[] = {a, b, c, d,e};
        tl.llenarT(tpi);
    }

   /* public void desplegar() {
        System.out.println("...OBJETOS EN LA PUBLICACION...");

        Iterator<Publicaciones> itrPublica = Arrpublica.iterator();
        while (itrPublica.hasNext()) {
            Publicaciones publica = itrPublica.next();
            if (publica instanceof Libro) {
                Libro book = new Libro();
                book = (Libro) publica;
                System.out.println("Titulo: " + book.getTitulo());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Autor: " + book.getAutor());

            } else if (publica instanceof Revista) {
                Revista maga = new Revista();
                maga = (Revista) publica;
                System.out.println("Titulo: " + maga.getTitulo());
                System.out.println("ISSN: " + maga.getISSN());
                System.out.println("Número : " + maga.getNumero());

            } else if (publica instanceof Periodico) {
                Periodico peri = new Periodico();
                peri = (Periodico) publica;
                System.out.println("Titulo: " + peri.getTitulo());
                System.out.println("Autor: " + peri.getEditor());

            }
        }
    }/*

    /* public void tablas() {
        String a, b, c, d, e, f;
        tablaPeriodicos tp = new tablaPeriodicos();
        // tp.limpiarT();
        Iterator<Publicaciones> itrTable = Arrpublica.iterator();
        while (itrTable.hasNext()) {
            Publicaciones p = itrTable.next();
            if (p instanceof Periodico) {
                Periodico peri = new Periodico();
                peri = (Periodico) p;
                a = p.getTitulo();
                b = String.valueOf(p.getPrecio());
                c = String.valueOf(p.getNoPag());
                d = ((Periodico) p).getEditor();
                String tpi[] = {a, b, c, d};
                tp.llenarT(tpi);
            }
        }
    }*/
    public void alta(String ISSN, int num) {
        objRevista = new Revista();
        objRevista.setTitulo(objPublicaciones.getTitulo());
        objRevista.setPrecio(objPublicaciones.getPrecio());
        objRevista.setNoPag(objPublicaciones.getNoPag());
        objRevista.setISSN(ISSN);
        objRevista.setNumero(num);
        Arrpublica.add(objRevista);

        String a, b, c, d, e, f;
        tablaRevista tr = new tablaRevista();
        a = objRevista.getTitulo();
        b = String.valueOf(objRevista.getPrecio());
        c = String.valueOf(objRevista.getNoPag());
        d = objRevista.getISSN();
        e = String.valueOf(objRevista.getNumero());
        String tpi[] = {a, b, c, d,e};
        tr.llenarT(tpi);

    }

    public ArrayList Datos() {
        return Arrpublica;
    }

    public void alta(String editor) {
        objPeriodico = new Periodico();
        objPeriodico.setTitulo(objPublicaciones.getTitulo());
        objPeriodico.setPrecio(objPublicaciones.getPrecio());
        objPeriodico.setNoPag(objPublicaciones.getNoPag());
        objPeriodico.setEditor(editor);
        Arrpublica.add(objPeriodico);

        String a, b, c, d, e, f;
        tablaPeriodicos tp = new tablaPeriodicos();
        a = objPeriodico.getTitulo();
        b = String.valueOf(objPeriodico.getPrecio());
        c = String.valueOf(objPeriodico.getNoPag());
        d = ((Periodico) objPeriodico).getEditor();
        String tpi[] = {a, b, c, d};
        tp.llenarT(tpi);

    }
}
