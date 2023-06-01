

public class Student extends Person {
    String program = "Teknik";
    int year = 3;
    double fee = 0;

    public Student(){

    }
    public Student(String name, String address, String program, int year, double fee){
        this.program =program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram(){
        return program;
    }

    public void setProgram(String program){

    }
    public int getYear(){
        return year;
    }

    public void setYear(int year){
    }
    public double getFee(){
        return fee;
    }
    public void setFee(double fee){

    }
    public String toString(){
        return "Student[Person = " + name + ",address = " +address +",program = " + program +", year = " + year +",fee = "+ fee;
    }
}
