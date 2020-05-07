package Logic;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class CargarFicheros {
    private HashMap<String, ArrayList<Elementos>> _listElem;
    private ArrayList<double[]> centros;

    public CargarFicheros(){
        this._listElem = new HashMap<String,ArrayList<Elementos>>();
        centros = new ArrayList<double[]>();

        lecturaArchivos();
    }

    private void lecturaArchivos(){
        String dir = new File("").getAbsolutePath();
        File file = new File(dir, "Iris2Clases.txt");
    }

}
