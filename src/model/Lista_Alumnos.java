/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Lista_Alumnos {

    int idLista;
    ArrayList<Alumno> listaAlumno;

    public Lista_Alumnos() {
        super();
    }

    public int getIdLista() {
        return idLista;
    }

    @XmlAttribute
    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    public ArrayList<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    @XmlElement
    public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

}
