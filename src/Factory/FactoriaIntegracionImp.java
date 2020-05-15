package Factory;

import Integracion.Archivo;
import Integracion.ArchivoImp;

public class FactoriaIntegracionImp extends FactoriaIntegracion{

    @Override
    public Archivo crearArchivo() {
        return new ArchivoImp();
    }

}