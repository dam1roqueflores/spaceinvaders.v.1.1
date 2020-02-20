package es.iespablopicasso.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class EscuadronBonus {

/////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    // lista de bonus
    static private final byte NUM_BONUS = 3;

    //Almacenaremos las naves aliadas en un array list
    protected ArrayList<Bonus> listaBonus;



    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //CONSTRUCTORES
    public EscuadronBonus() {
        byte i; //contador básico
        Bonus miBonus; //Para ir creando y añadiendo

        //creamos la lista de jugadores
        listaBonus = new ArrayList();

        //Creamos y añadimos los los bonus...
        for (i=0;i<NUM_BONUS;i++) {
            miBonus = new Bonus((float)(Math.random()*Gdx.graphics.getWidth())-20);
            listaBonus.add(miBonus);
        }
    }

    public void pintarse(SpriteBatch miSB) {
        for (Bonus miBonus :listaBonus) {
            miBonus.pintarse(miSB);
        }
    }

    //Resto de comportamiento
    public void moverse() {
        for (Bonus miBonus :listaBonus) {
            miBonus.moverse();
        }
    }
    public void dispose(){
        for (Bonus miBonus :listaBonus) {
            miBonus.dispose();
        }
    }
}
