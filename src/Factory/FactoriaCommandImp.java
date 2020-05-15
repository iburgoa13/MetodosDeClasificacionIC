package Factory;

import Command.Command;
import Command.CommandBayes;
import Command.CommandKMedias;
import Command.CommandLloyd;
import View.Events;

public class FactoriaCommandImp extends FactoriaCommand {

    @Override
    public Command generarComando(int evento) {
        switch(evento){
            case(Events.BAYES):
                return new CommandBayes();
            case(Events.KMEDIAS):
                return new CommandKMedias();
            case(Events.LLOYD):
                return new CommandLloyd();
        }
        return null;

    }
}