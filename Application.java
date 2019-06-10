package ua.lviv.lgs;

public class Application {
    public static void main(String[] args) {
        Animal gepard = new Animal("Vasya",50.4,4);
        System.out.println("Age is " +gepard.getAge()+" Speed is " +gepard.getSpeed()+" Name is "+gepard.getName());
        gepard.setAge(5);
        gepard.setName("Леопард");
        gepard.setSpeed(48.6);
        System.out.println("Age is " +gepard.getAge()+" Speed is " +gepard.getSpeed()+" Name is "+gepard.getName());
        System.out.println(gepard.toString());


    }
}
