package Factory;

import Command.Command;

public abstract class FactoriaCommand {

    private static FactoriaCommand instance;

    public synchronized static FactoriaCommand getInstance() {
        if(instance == null){
            instance = new FactoriaCommandImp();
        }
        return instance;
    }

    public abstract Command generarComando(int evento);
}
