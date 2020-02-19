package es.iespablopicasso.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Bonus extends ObjetoVolador {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    ///////////////////////////////////////////////////////////////////////////////////

    static private final String NOMBRE_SPRITE = "Bonus.png";
    static private final float VELOCIDAD_Y = -2.0f;
    static private final float VELOCIDAD_X = 8.0f;
    static private final float POS_INICIAL_Y= Gdx.graphics.getHeight();
    private int incremento = -1;
    private boolean par =false;


    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES


    public Bonus(float nuevaPosX) {
        super(nuevaPosX, POS_INICIAL_Y, VELOCIDAD_X, VELOCIDAD_Y, NOMBRE_SPRITE);
    }

    //Resto de comportamiento

    //Modificamos el método pintarse, para cumplir las especificaciones
    @Override
    public void pintarse(SpriteBatch miSB) {
        super.pintarse(miSB);
      }
    public void moverse() {

        super.moverse();
        if (par) {
            velX+=incremento;
            if (velX>7 || velX<-7) {
                incremento=-incremento;
            }

        }
        par=!par;
    }
}

