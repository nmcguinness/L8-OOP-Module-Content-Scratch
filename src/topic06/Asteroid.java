package topic06;

import topic0.Vector3;

public class Asteroid {

    //region Static Fields
    private static final float DEFAULT_AST_SIZE = 100;
    private static final Vector3 DEFAULT_AST_COLOR = new Vector3(0.5, 0.5, 0.5);
    private static final Vector3 DEFAULT_AST_VELOCITY = new Vector3(-1, 0, 0) ;
    //endregion

    //region Fields
    private float size;
    private Vector3 color;
    private Vector3 velocity;
    //imagine we also have position, rotationRate, texture
    //endregion

    //region Getters & Setters
    public Vector3 getColor() {
        return color;
    }

    public void setColor(Vector3 color) {
        this.color = color;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public Vector3 getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector3 velocity) {
        this.velocity = velocity;
    }
    //endregion


    public Asteroid() {
        this(DEFAULT_AST_SIZE, DEFAULT_AST_COLOR, DEFAULT_AST_VELOCITY);
    }

    public Asteroid(float size, Vector3 color, Vector3 velocity) {
        this.size = size;
        this.color = color;
        this.velocity = velocity;
    }
}
