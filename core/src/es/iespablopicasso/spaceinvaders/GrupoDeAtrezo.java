package es.iespablopicasso.spaceinvaders;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class GrupoDeAtrezo {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    ///////////////////////////////////////////////////////////////////////////////////
    int NUMOVNIS=3;
    int ANCHOVNI=100;

    ArrayList <OvniAtrezo> listaOvni;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    public GrupoDeAtrezo(int miPosX) {
        int i;
        OvniAtrezo miOvni;
        listaOvni= new ArrayList();

        for (i=0;i<NUMOVNIS;i++) {
            miPosX=miPosX+(ANCHOVNI+i);

            miOvni= new OvniAtrezo(miPosX);
            listaOvni.add(miOvni);
        }
    }


    public void pintarse (SpriteBatch miSB){

        for (OvniAtrezo miOvni:listaOvni) {
            miOvni.pintarse(miSB);
        }

    }
    public void moverse (){

        for (OvniAtrezo miOvni:listaOvni) {
            miOvni.moverse();
        }

    }
    public void dispose (){

        for (OvniAtrezo miOvni:listaOvni) {
            miOvni.dispose();
        }
    }
    public float getPosY (){
        //devolvemos Y para controlar si se ha salido de la pantalla
        float resultado;
        resultado=listaOvni.get(0).posY;
        return resultado;
    }

}
