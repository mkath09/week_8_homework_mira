package poolarea;

import abstractexample23.Rectangle;

public class Cuboid extends Rectangle {
    double height;
    //this constuctor used to initilzed the value of height
    public Cuboid(double width, double length , double height){
        super();
        if(height<0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    //this method used to get the value of height
    public double getHeight() {
        return height;
    }

    public  double getVolume(){
        return getHeight() * height;
    }
}