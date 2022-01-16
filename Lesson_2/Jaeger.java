public class Jaeger {

    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private String body;
    private String pilotOne;
    private String pilotTwo;
    private int kaijuKilled = 0;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPilotOne() {
        return pilotOne;
    }

    public void setPilotOne(String pilotOne) {
        this.pilotOne = pilotOne;
    }

    public String getPilotTwo() {
        return pilotTwo;
    }

    public void setPilotTwo(String pilotTwo) {
        this.pilotTwo = pilotTwo;
    }

    public void attack() {
        System.out.println(modelName + " атаковал Kaiju");
    }

    public void move(int steps) {
        System.out.println(modelName + " прошел " + steps + " шагов");
    }

    public void requestHelp() {
        System.out.println(modelName + " запрашивает помощь");
    }

    public void killKaiju() {
        kaijuKilled++;
        System.out.println(modelName + " уничтожил одного Kaiju");
    }

    @Override
    public String toString() {
        return "Модель: " +  modelName + "\nМарка: " + mark +
            "\nВысота: " + height + "\nВес: " + weight + 
            "\nКонструкция тела: " + body + "\nПервый пилот: " + pilotOne +
            "\nВторой пилот: " + pilotTwo +"\nУничтожил Kaiju: " + kaijuKilled;
    }
} 