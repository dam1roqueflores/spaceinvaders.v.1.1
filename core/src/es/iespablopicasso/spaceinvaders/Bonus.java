package es.iespablopicasso.spaceinvaders;

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
    static private final float POS_INICIAL_Y=0.0f;
    private int incremento = -1;
    private int cuenta =0;


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

        cuenta=cuenta+1;
        super.moverse();

        if (contador % 2 == 0) {
            if (velX <= 0){
                incremento = incremento - 1
            } else if (velX>0)
                incremento=incremento+1;
            }
        }
        velX+=incremento;
        if (velX>8) { velX=5;}
        if (velX<-8) {velX=-5;}
}

