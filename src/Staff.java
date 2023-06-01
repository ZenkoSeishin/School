

public class Staff extends Person{
    String school = "NTI";
    double pay = 1350.0;

    public Staff(){

    }
    public Staff(String name, String address, String school, double pay){
        this.pay = pay;
        this.school = school;
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){

    }
    public double getPay(){
        return pay;
    }
    public void setPay(double pay){

    }
    public String toString(){
        return "Staff[Person = "+name + ",address = "+ address + ",school = "+school+", pay = "+ pay;
    }
}
