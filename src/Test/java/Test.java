/**
 * Created by Josean on 19/04/2017.
 */

import Controlador.Eetakemonclass;
import Controlador.EetakemonManager;
import Modelo.Usuario;
import Modelo.Objeto;


public class Test {

    @org.junit.Test;
    public void prueba(){
        Eetakemonclass x = Eetakemonclass.getEetakemonclass ();
        Usuario u = new Usuario("josean");
        x.adduser(u);
    }
}
