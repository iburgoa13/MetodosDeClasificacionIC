package Command;

import View.Contexto;

public interface Command {

    public Contexto execute(Object dato);
}
