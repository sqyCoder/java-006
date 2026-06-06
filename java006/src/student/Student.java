package student;

class Student{
    private String name;
    private double score;
    public Student(){
    }
    public Student(String name,double score){
        this.name=name;
        this.score=score;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setScore(double score){
        this.score=score;
    }
    public double getScore(){
        return score;
    }
}
