package es.iespablopicasso.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class EscuadronAliado {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //Definimos una constante para el nombre del fichero que contiene el sprite principal
    static private final String NOMBRE_SPRITE = "navealiada1.png";
    // lista de jugadores
    static private final byte NUM_NAVES_ALIADAS = 3;

    //Almacenaremos las naves aliadas en un array list
    protected ArrayList<NavesAliadas> listaAlia;
    protected ArrayList<NavesAliadas> listaExpl;


    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //CONSTRUCTORES
    public EscuadronAliado(EstadoTeclado et, short indiceNavesXwing) {
        byte i; //contador básico
        NavesAliadas jugador; //Para ir creando y añadiendo

       //creamos la lista de jugadores
        listaAlia = new ArrayList();
        listaExpl = new ArrayList();

        //Creamos y añadimos los enemigos...
        for (i=0;i<NUM_NAVES_ALIADAS;i++) {
            jugador = new NavesAliadas((float)((i+1)*40), (float) Gdx.graphics.getBackBufferHeight()/indiceNavesXwing, (short) Gdx.graphics.getWidth());
            listaAlia.add(jugador);
        }
    }

    public void pintarse(SpriteBatch miSB) {
        for (NavesAliadas minave :listaAlia) {
            minave.pintarse(miSB);
        }
    }

    //Resto de comportamiento
    public void moverse(EstadoTeclado et) {
        for (NavesAliadas minave :listaAlia) {
            minave.moverse(et);
        }
    }
    public void dispose(){
        for (NavesAliadas minave :listaAlia) {
            minave.dispose();
        }
    }
}
