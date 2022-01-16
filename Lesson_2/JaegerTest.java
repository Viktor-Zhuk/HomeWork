public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Avenger");
        jaegerOne.setMark("Mark-6");
        jaegerOne.setHeight(81.77f);
        jaegerOne.setWeight(2.004f);
        jaegerOne.setBody("Street Fighter");
        jaegerOne.setPilotOne("Nate Lambert");
        jaegerOne.setPilotTwo("Joseph Burke");

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Cherno Alpha");
        jaegerTwo.setMark("Mark-1");
        jaegerTwo.setHeight(85.34f);
        jaegerTwo.setWeight(2.412f);
        jaegerTwo.setBody("Greco-Roman");
        jaegerTwo.setPilotOne("Sasha Kaidonovsky");
        jaegerTwo.setPilotTwo("Aleksis Kaidonovsky");

        jaegerOne.move(15);
        jaegerTwo.attack();
        jaegerTwo.requestHelp();
        jaegerOne.move(50);
        jaegerOne.attack();
        jaegerOne.killKaiju();
        jaegerOne.killKaiju();
        jaegerTwo.killKaiju();
        jaegerOne.killKaiju();

        System.out.println(jaegerOne.getInformation());
        System.out.println(jaegerTwo.getInformation());            
    }
}