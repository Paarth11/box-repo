
public class Main {
    public static void main(String[] args) {
        class student{
            String name;
            int age;
            int rollNumber;
            student(){
                this.name="okok";
                this.age = 18;
                this.rollNumber=60;
            }

        }
        student paarth = new student();
        System.out.println(paarth.name);
        System.out.println(paarth.age);
        System.out.println(paarth.rollNumber);
    }
}