public class Cycle {
    public static void main(String[] args) {
        for(int i=0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int value = 6;
        while(value >= -6) {
            System.out.print(value + " ");
            value = value - 2;
        }

        System.out.println();

        int modValue = 10;
        int sum = 0;
        do {
            if(modValue % 2 != 0) {
                sum=modValue+sum;
            }
            modValue++;
        } while(modValue <=20);
        System.out.println(sum);
    }
}