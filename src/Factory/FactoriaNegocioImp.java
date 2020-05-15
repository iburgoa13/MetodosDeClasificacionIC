package Factory;

import Algoritmos.BayesImp;
import Algoritmos.KMediasImp;
import Algoritmos.LloydImp;

public class FactoriaNegocioImp extends FactoriaNegocio{

    @Override
    public KMediasImp crearKMedias() {
        return new KMediasImp();
    }

    @Override
    public BayesImp crearBayes() {
        return new BayesImp();
    }

    @Override
    public LloydImp crearLloyd() {
        return new LloydImp();
    }

}