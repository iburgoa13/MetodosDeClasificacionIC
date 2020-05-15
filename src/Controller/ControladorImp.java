package Controller;

import Command.Command;
import Dispatcher.dispatcher;
import Factory.FactoriaCommand;
import View.Contexto;

public class ControladorImp extends Controlador {

    @Override
    public void accion(Contexto contexto) {
        Command command = FactoriaCommand.getInstance().generarComando(contexto.getEvento());
        Contexto contextoResult = null;
        if (command != null) {
            contextoResult = command.execute(contexto.getDato());
            dispatcher.getInstance().generarVista(contextoResult);
        }
        else dispatcher.getInstance().generarVista(contexto);
    }

}