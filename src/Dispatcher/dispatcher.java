package Dispatcher;

import View.Contexto;

public abstract class dispatcher {

        private static dispatcher instance;

        public static dispatcher getInstance() {
            if(instance == null) {
                instance = new DispatcherImp();
            }
            return instance;
        }

        public abstract void generarVista(Contexto contexto);

}
