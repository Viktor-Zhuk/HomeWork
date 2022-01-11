public class Person {
    
    char human = 'm';
    String name = "Viktor";
    int height = 172;
    double weight = 81.45;
    short age = 35;

    void go() {
        System.out.println("Я иду гулять.");
    }

    void sit() {
        System.out.println("Я сижу на попе ровно.");
    }

    void run() {
        System.out.println("Бегу за пивом.");
    }

    void talk() {
        System.out.println("Говорю.");
    }

    String learnJava(byte lesson) {
        return "Изучаю " + lesson + " урок по Java.";
    }
}