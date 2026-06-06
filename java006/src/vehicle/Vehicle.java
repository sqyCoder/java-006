package vehicle;

class Vehicle{
    private String plateNo;
    private int wheel;
    public Vehicle(){
    }
    public Vehicle(String plateNo,int wheel){
        this.plateNo=plateNo;
        this.wheel=wheel;
    }
    public void show(){
        System.out.println("车牌号："+plateNo);
        System.out.println("轴距："+wheel);
    }
}
