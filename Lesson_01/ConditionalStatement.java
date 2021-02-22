public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        boolean menSex = true;
        double height = 1.90;
        char firstLetterOfName = 'I';
        
        if(age > 20) {
        System.out.println("Возраст старше 20 лет");
        }

        if(menSex) {
            System.out.println("Пол мужской");
        }

        if(!menSex) {
            System.out.println("Пол женский");
        }

        if(height < 1.80) {
            System.out.println("Ваш рост ниже среднего");
        } else {
            System.out.println("Ваш рост выше среднего");
        }

        if(firstLetterOfName == 'M') {
            System.out.println("Ваше имя начинается на M");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Ваше имя начинается на I");
        } else {
            System.out.println("Ваше имя начинается ни на M, ни на I");
        }
    }
}