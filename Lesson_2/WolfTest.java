public class WolfTest {
    
    public static void main(String[] args) {
        Wolf newWolf = new Wolf();
        newWolf.sex = 'm';
        newWolf.nickName = "Predator";
        newWolf.weight = 15.7f;
        newWolf.age = 9;
        newWolf.color = "gray";

        System.out.println("sex: " + newWolf.sex);
        System.out.println("nickName: " + newWolf.nickName);
        System.out.println("weight: " + newWolf.weight);
        System.out.println("age: " + newWolf.age);
        System.out.println("color: " + newWolf.color);

        newWolf.go();
        newWolf.sit();
        newWolf.run();
        newWolf.howl();
        newWolf.hunt();
    }
}