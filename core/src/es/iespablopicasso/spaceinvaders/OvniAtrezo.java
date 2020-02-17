package es.iespablopicasso.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class OvniAtrezo extends ObjetoVolador {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    ///////////////////////////////////////////////////////////////////////////////////

    static private final String NOMBRE_SPRITE = "OvniAtrezo.png";
    static private final float VELOCIDAD_Y = 2.0f;
    static private final float VELOCIDAD_X = 0.0f;
    static private final float POS_INICIAL_Y=0.0f;


    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES


    public OvniAtrezo(float nuevaPosX) {
        super(nuevaPosX, POS_INICIAL_Y, VELOCIDAD_X, VELOCIDAD_Y, NOMBRE_SPRITE);
    }

    //Resto de comportamiento

    //Modificamos el método pintarse, para que en caso de necesitar pintar una explosión, lo haga
    @Override
    public void pintarse(SpriteBatch miSB) {
        super.pintarse(miSB);
      }
    public void moverse() {
        float valor;
        int inc;

        valor = (float) Math.random();

        super.moverse();

        if (valor<0.33) {
            inc=1;
        } else {
            if (valor>0.66) {
                inc=-1;
            } else {
                inc=0;
            }
        }
        velX+=inc;
        if (velX>5) { velX=5;}
        if (velX<-5) {velX=-5;}
    }
}

