public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Female";
        wolfOne.name = "Jack";
        wolfOne.weight = 70.0;
        wolfOne.age = 6;
        wolfOne.color = "Black";

        System.out.println("Gender is " + wolfOne.gender);
        System.out.println("Name is " + wolfOne.name);
        System.out.println("Weight is " + wolfOne.weight);
        System.out.println("Age is " + wolfOne.age);
        System.out.println("Color is " + wolfOne.color);

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();

    }
}