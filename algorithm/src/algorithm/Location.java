package algorithm;


/**
 * Created by Xirui on 2015/10/26.
 */
public class Location implements Cloneable {
    private double x;
    private double y;

    public Location(double xInitial,double yInitial){
        this.x = xInitial;
        this.y = yInitial;
    }

    public Location clone() {
        Location answer;

        try {
            answer = (Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This class does not implements Cloneable");
        }

        return answer;
    }

    public static double distance(Location p1,Location p2) {
        double a,b,c_sqrt;

        if ((p1 == null) || (p2 == null))
            return Double.NaN;

        a = p1.x - p2.x;
        b = p1.y - p2.y;

        c_sqrt = a*a + b*b;

        return Math.sqrt(c_sqrt);
    }

    public boolean equals(Object obj){
        if (obj instanceof Location){
            Location candidate = (Location) obj;
            return (candidate.x == x) && (candidate.y == y);
        }
        else
            return false;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public static Location midpoint(Location p1,Location p2){
        double xMid,yMid;

        if ((p1 == null) || (p2 == null))
            return null;

        xMid = (p1.x / 2) + (p2.x / 2);
        yMid = (p1.y / 2) + (p2.y / 2);

        Location answer = new Location(xMid,yMid);
        return answer;
    }

    public void rotate90() {
        double xNew;
        double yNew;

        xNew = y;
        yNew = -x;
        x = xNew;
        y = yNew;
    }

    public void shift(double xAmount,double yAmount){
        x += xAmount;
        y += yAmount;
    }

    public String toString(){
        return "(x=" + x + " y =" + y + ")";
    }
}
