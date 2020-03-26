public class Shape3D extends Shape2D {
    private float z= 0.0f;

    public Shape3D() {
    }

    public Shape3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(float x, float y,float z){
        return new float[]{super.getX(),super.getY(),this.z};
    }

    @Override
    public String toString() {
        return "{" +super.toString()+
                "z=" + z +
                '}';
    }
}
