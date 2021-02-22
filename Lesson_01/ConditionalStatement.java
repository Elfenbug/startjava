public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        
        if(age > 20) {
            System.out.println("Возраст старше 20 лет");
        }

        boolean maleGender = true;

        if(maleGender) {
            System.out.println("Пол мужской");
        }


        if(!menSex) {
            System.out.println("Пол женский");
        }

        double height = 1.90;

        if(height < 1.80) {
            System.out.println("Ваш рост ниже среднего");
        } else {
            System.out.println("Ваш рост выше среднего");
        }

        char firstLetterOfName = 'I';

        if(firstLetterOfName == 'M') {
            System.out.println("Ваше имя начинается на M");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Ваше имя начинается на I");
        } else {
            System.out.println("Ваше имя начинается ни на M, ни на I");
        }
    }
}