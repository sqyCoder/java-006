package studnet3;

class Student3{
    private String name;
    private String sex;
    private String studentID;
    private int age;
    private String major;
    public Student3() {
    }
    public Student3(String name,String sex,int age,String major,String studentID) {
        this.name = name;
        this.sex = sex;
        this.studentID = studentID;
        this.age = age;
        this.major = major;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString(){
        return "姓名："+name+"，性别："+sex+"，学号："+studentID+",年龄："+age+",专业："+major;
    }
    public void printInfo(){
        System.out.println(this.toString());
    }
}