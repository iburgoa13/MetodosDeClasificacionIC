package Algoritmos;

import Logic.Elementos;

import java.util.ArrayList;
import java.util.HashMap;

public class TIntegracion {
    private HashMap<String,ArrayList<Elementos>> listaElementos;
    private ArrayList<ArrayList<Double>> matrizDatos;

    public TIntegracion(HashMap<String,ArrayList<Elementos>> listaElementos, ArrayList<ArrayList<Double>> matrizDatos) {
        this.listaElementos = listaElementos;
        this.matrizDatos = matrizDatos;
    }

    public HashMap<String, ArrayList<Elementos>> getListaElementos() {
        return listaElementos;
    }


    public void setListaElementos(HashMap<String, ArrayList<Elementos>> listaElementos) {
        this.listaElementos = listaElementos;
    }


    public ArrayList<ArrayList<Double>> getMatrizDatos() {
        return matrizDatos;
    }

    public void setMatrizDatos(ArrayList<ArrayList<Double>> matrizDatos) {
        this.matrizDatos = matrizDatos;
    }
}
