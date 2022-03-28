public class Point {
    private int x;
    private int y;
    private String label;

    public Point(String label,int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Point)){
            return false;
        }
        Point objPoint = (Point) obj;
        return (this.x == objPoint.x) && (this.y == objPoint.y);
    }

    @Override
    public String toString(){
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }
}
