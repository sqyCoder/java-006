package vehicle;

class Bus extends Vehicle{
    private int passengers;
    public Bus(){
    }
    public Bus(String plateNo,int wheel,int passengers){
        super(plateNo,wheel);
        this.passengers=passengers;
    }
    public void show(){
        super.show();
        System.out.println("限载人数："+passengers);
    }
}
