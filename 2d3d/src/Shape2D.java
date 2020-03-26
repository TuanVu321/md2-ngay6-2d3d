public class Shape2D {
    private float x = 0.0f;
    private float y= 0.0f;

    public Shape2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Shape2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(float x,float y){
        return new float[]{this.x,this.y};
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
