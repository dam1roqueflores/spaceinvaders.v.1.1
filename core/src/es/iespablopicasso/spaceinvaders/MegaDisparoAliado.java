package es.iespablopicasso.spaceinvaders;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Clase MegaDisparoAliado. Representa a uno de nuestros MegaDisparos
 */

public class MegaDisparoAliado extends ObjetoVolador {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //Definimos una constante para el nombre del fichero que contiene el sprite principal
    static private final String NOMBRE_SPRITE = "disparo_aliado2.png";

    //Las constantes para definir la velocidad de estos disparos
    static private final float VELOCIDAD_INICIAL_Y = 4.0f;
    static private final float VELOCIDAD_INICIAL_X = 2.0f;

    static private float iVelocidad = 4.0f;
    protected int pasosDirX=1;
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES
    public MegaDisparoAliado(float nuevaPosX,float nuevaPosY) {
        super(nuevaPosX,nuevaPosY,VELOCIDAD_INICIAL_X*iVelocidad,VELOCIDAD_INICIAL_Y,NOMBRE_SPRITE);
        //el megadisparo puede ir a la izquierda o a la derecha.
        if (Math.random()>0.5) {
            this.velX= -this.velX;
        }
    }

    //Resto de comportamiento

    @Override
    public void pintarse(SpriteBatch miSB) {
        if (pasosDirX==20){
            this.velX=-this.velX;

            if (Math.random()>0.8) {
                this.velY= -this.velY;
            }
            this.velY=this.velY+(float) Math.random();
            
            pasosDirX=1;
        }else {
            pasosDirX++;
        }
        super.pintarse(miSB);
        /*miSB.begin();
        miSB.draw(img, posX-anchoDiv2, posY-altoDiv2);
        miSB.end();*/
    }
}

