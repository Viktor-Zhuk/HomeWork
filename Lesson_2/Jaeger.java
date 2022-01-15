public class Jaeger {

    private String modelName = "Bracer Phoenix";
    private String mark = "Mark-5";
    private String origin = "USA";
    private float height = 70.7f;
    private float 2.1f;
    private int speed = 3;
    private int strength = 8;
    private int armor = 9;

    public String getModelName(String modelName) {
        return modelName;
    }

    void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }
}