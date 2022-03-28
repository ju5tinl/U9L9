public class ThreeDPoint extends Point{
    private int z;

    public ThreeDPoint(String l, int x, int y, int z){
        super(l,x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object obj){
        ThreeDPoint obj3DPoint = (ThreeDPoint) obj;
        return (this.z == obj3DPoint.z) && super.equals(obj);
    }

    @Override
    public String toString(){
        return super.toString() + ", z = " + z;
    }

}
