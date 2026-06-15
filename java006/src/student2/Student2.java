package student2;

class Student2{
    private final String number;
    private final String name;
    private final int age;
    public Student2(String number,String name,int age){
        this.number=number;
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return name+" "+number+" "+age;
    }
}