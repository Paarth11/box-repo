package paarth.one;

public class human {
    String name;
    int age;
    int phoneNumber;
    boolean married;
   static long population;
    public human(String name, int age, int phoneNumber, boolean married) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.married = married;
        human.population+=1;
    }
}

