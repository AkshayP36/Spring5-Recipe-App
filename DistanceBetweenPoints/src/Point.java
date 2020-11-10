public class Point {
    private int x;
    private int y;
    public Point(){    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){return this.x;}
    public int getY(){return this.y;}
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
    public double distance(){  return (Math.sqrt((Math.pow(this.x ,2))+(Math.pow(this.y , 2))));   }

    public double distance(int x, int y){
        double xCoordinate = (this.x-x)*(this.x-x);
        double yCoordinate = (this.y-y)*(this.y-y);
        double distanceAdded = xCoordinate+yCoordinate;
        return Math.sqrt(distanceAdded);
    }
    public double distance(Point point){
        double xCoordinate = (this.x-point.x)*(this.x-point.x);
        double yCoordinate = (this.y-point.y)*(this.y-point.y);
        double distanceAdded = xCoordinate+yCoordinate;
        return Math.sqrt(distanceAdded);
    }

    /*public void displayValues(){
        System.out.println("value of x = "+this.x);
        System.out.println("value of y = "+this.y);
    }*/
}
