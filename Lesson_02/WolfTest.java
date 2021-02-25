public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Female");
        wolfOne.setName("Jack");
        wolfOne.setWeight(70.0);
        wolfOne.setAge(6);
        wolfOne.setColor("Black");

        System.out.println("Gender is " + wolfOne.getGender());
        System.out.println("Name is " + wolfOne.getName());
        System.out.println("Weight is " + wolfOne.getWeight());
        System.out.println("Age is " + wolfOne.getAge());
        System.out.println("Color is " + wolfOne.getColor());

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}