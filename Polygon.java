
package interface23;


public class Polygon {
    int numSide;

    public Polygon(int numSide) {
        this.numSide = numSide;
    }
    
    
    public int getNumSide() {
        return numSide;
    }

    public void setNumSide(int numSide) {
        this.numSide = numSide;
    }
    public double Perimeter(){
        double a=20;
        return 5*a;
    }
    public double Area(){
        double a =20;
        return 0.5*Perimeter()*a;
    }

    
}
