package es.iespablopicasso.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class OvniAtrezo extends ObjetoVolador {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    ///////////////////////////////////////////////////////////////////////////////////

    protected int pasos;
    protected int inc=1;
    protected Texture imgatrezo;

    public static final int PASOS_EXP = 20;
    public static final int VELOCIDAD_Y = 2;


    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES
    public OvniAtrezo() {
        super();
        posX=20;
        posY=20;
        velX=0;
        velY=VELOCIDAD_Y;
        imgatrezo=new Texture("OvniAtrezo.png");
        pasos = 0;
    }

    public OvniAtrezo(float nuevaPosX,float nuevaPosY,float nuevaVelX, String nombreImg) {
        super(nuevaPosX, nuevaPosY, nuevaVelX, VELOCIDAD_Y, nombreImg);
        velX=0;
    }

    //Resto de comportamiento

    //Modificamos el método pintarse, para que en caso de necesitar pintar una explosión, lo haga
    @Override
    public void pintarse(SpriteBatch miSB) {
            super.pintarse(miSB);
    }
    public void moverse(SpriteBatch miSB) {
        if (Math.random()>0.5) {
            inc=-inc;
        }
        velX=velX+inc;
        if (velX>5) { velX=5;}
        if (velX<-5) {velX=-5;}
        super.moverse();

    }
}

