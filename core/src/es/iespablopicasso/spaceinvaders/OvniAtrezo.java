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
    static private final float VELOCIDAD_Y = 4.0f;
    static private final float VELOCIDAD_X = 0.0f;
    static private final float POS_INICIAL_Y=0.0f;

    private int incY=-1;

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
        float incX;
        float resultador;
        float resultador2;
        super.moverse();

// comprobamos los límites de velocidad Y
        if (velY>=4) {
            velY=4;
            incY=-incY;
        }
        if (velY<=-2) {
            velY=-2;
            incY=-incY;
        }
        resultador2=velY+incY;
        velY+=incY;

        // comprobamos los limites de velocidad X
        if (Math.random()>0.5){
            incX=-1;
        } else {
            incX=1;
        }
        resultador=(float) (Math.random()+Math.random())*incX;
        velX=resultador;

    }
}

