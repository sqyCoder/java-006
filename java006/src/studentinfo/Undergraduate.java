package studentinfo;

class Undergraduate extends Student{
    private final String major;
    public Undergraduate(String name,int age,String major){
        this.name=name;
        this.age=age;
        this.major=major;
    }
    public String show(){
        return "Undergraduate[name="+name+",age="+age+",major="+major+"]";
    }
}
