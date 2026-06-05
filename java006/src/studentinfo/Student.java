package studentinfo;

class Student{
    protected String name;
    protected int age;
    public Student(){
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String show(){
        return "Student[name="+name+",age="+age+"]";
    }
}