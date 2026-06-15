package brthday;

class Birthday{
    private int year;
    private int month;
    private int day;
    public Birthday(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day=day;
    }
    public int getday(){
        return day;
    }
    public int getAge(){
        if(this.day>=25 && this.month==12){
            return 2017-year+1;
        }
        else{
            return 2017-year;
        }
    }
}