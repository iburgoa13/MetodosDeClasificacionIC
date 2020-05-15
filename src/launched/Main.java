package launched;

import Controller.Controlador;
import View.Contexto;
import View.Events;

public class Main {

    public static void main(String[] args) {
        Controlador.getInstance().accion(new Contexto(Events.GUI_MAIN, null) );
    }

}