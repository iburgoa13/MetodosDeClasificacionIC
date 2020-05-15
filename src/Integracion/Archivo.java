package Integracion;

import Algoritmos.TDatos;
import Algoritmos.TIntegracion;
import Logic.Elementos;

import java.util.ArrayList;
import java.util.HashMap;

public interface Archivo {
    public TIntegracion leerElementos(TDatos tDatos);
    public Object leerClases(TDatos tDatos, HashMap<String, ArrayList<Elementos>> elemento);
    public Object leerEjemplo(TDatos tDatos);
}