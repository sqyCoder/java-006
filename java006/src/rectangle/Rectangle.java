package rectangle;

class Rectangle{
    private double length;
    private double width;
    public Rectangle(){
        this.length=0;
        this.width=0;
    }
    public void setXY(double a,double b){
        this.length=a;
        this.width=b;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return length*2+width*2;
    }
}