public class AreaCalculator {
    /*public static void main(String[] args){
     double radius=5d;
     double x=-50d;
     double y=60d;
     double carea=area(radius);
     double rarea=area(x,y);
     System.out.println("carea = "+carea);
     System.out.println("rarea = "+rarea);
    }*/
    public static double area(double radius){
        if (radius<0){
            return -1.0;
        }
        else {
            return (radius*radius* Math.PI);
        }

    }
    public static double area(double x, double y){
        if(x<0 || y<0){
            return -1.0;

        }
        else {
            return (x*y);
        }
    }
}
