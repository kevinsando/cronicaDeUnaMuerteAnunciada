package accesoDatos;

import java.util.ArrayList;
import logicaNegocios.usuario;

public class DALUsuarios {

    private static DALUsuarios mInstance;
    private ArrayList<usuario> al;

    public static DALUsuarios getInstance() {
        if (mInstance == null) {
            mInstance = new DALUsuarios();
        }

        return mInstance;
    }

    public DALUsuarios() {
        al = new ArrayList<usuario>();

    }

    public void insertar(usuario a) {//Listo
        al.add(a);
    }

    public void eliminar(usuario a) {
        al.remove(a);
    }

    public void actualizar(int pos, usuario a) {
        al.set(pos, a);
    }
//    public int consultar(int v){
//      int pos=0;  
//      for(Integer value: al){
//        if(value.intValue()==v){
//          return pos;
//        }
//        pos++;
//      }
//      return pos;
//    }

    public int consultar(usuario a) {
        return al.indexOf(a);
    }

    public usuario consultar(int index) {
        return al.get(index);

    }

//    public avion consultaID(String id) {
//        avion a= null;
//        for (int i = 0; i < al.size(); i++) {
//            if (al.get(i).getId() == id) {
//                e = al.get(i);
//            }
//        }
//        return e;
//    }
    public ArrayList listar() {
        return al;
    }

    public void add(usuario a) {
        al.add(a);
    }

}
