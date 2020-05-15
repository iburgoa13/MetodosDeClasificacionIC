package Factory;

import Algoritmos.BayesImp;
import Algoritmos.KMediasImp;
import Algoritmos.LloydImp;

public abstract class FactoriaNegocio {

    private static FactoriaNegocio instance;

    public static FactoriaNegocio getInstance() {
        if(instance == null) {
            instance = new FactoriaNegocioImp();
        }
        return instance;
    }

    public abstract KMediasImp crearKMedias();

    public abstract LloydImp crearLloyd();

    public abstract BayesImp crearBayes();
}