package Dispatcher;

import View.Contexto;
import View.Events;
import View.GUIMain;

public class DispatcherImp extends dispatcher {

    @Override
    public void generarVista(Contexto contexto) {
        int evento = contexto.getEvento();
        switch(evento) {
            case(Events.GUI_MAIN):
                GUIMain.getInstance().actualizar(contexto);
                break;
            case(Events.LLOYD_KO):
                GUIMain.getInstance().actualizar(contexto);
                break;
            case(Events.LLOYD_OK):
                GUIMain.getInstance().actualizar(contexto);
                break;
            case(Events.BAYES_KO):
                GUIMain.getInstance().actualizar(contexto);
                break;
            case(Events.BAYES_OK):
                GUIMain.getInstance().actualizar(contexto);
                break;
            case(Events.KMEDIAS_KO):
                GUIMain.getInstance().actualizar(contexto);
                break;
            case(Events.KMEDIAS_OK):
                GUIMain.getInstance().actualizar(contexto);
                break;
        }
    }
}