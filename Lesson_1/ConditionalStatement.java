public class ConditionalStatement {
    
    public static void main(String[] args) {
        int age = 33;
        if (age > 20) {
            System.out.println("Ваш возраст: " + age);
        }

        boolean isMan = true;
        if (isMan) {
            System.out.println("Поздравляю! У тебя есть яйца.");
        }
        if (!isMan) {
            System.out.println("Ты можешь рожать.");
        }

        double height = 1.92;
        if (height < 1.80) {
            System.out.println("Баскетбол не для тебя.");
        } else {
            System.out.println("Дядя, достань воробушка.");
        }

        char  firstLetterName = 'V';
        if (firstLetterName == 'M') {
            System.out.println("Возможно тебя зовут Mike.");
        } else if (firstLetterName == 'I') {
            System.out.println("Возможно тебя зовут Ibrahim.");
        } else {
            System.out.println("Хрен поймешь, кто ты.");
        }
    }
}
