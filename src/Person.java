

public class Person {
    String name = "Adem the goat";
    String address = "Avstyckningsvägen 1";

    public Person(){

    }

    public void person(String name, String address){

        this.name = name;
        this.address = address;
    }

    public String getName(){

        return name;
    }

    public String getAddress(){

        return address;
    }

    public void setAdress(String address){

    }

    public String toString(){
        return "Person[name = " + name +"," + "address = " + address;
    }
}
