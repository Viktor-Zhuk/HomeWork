public class Variable {
    
    public static void main(String[] args) {
        byte numberOfCores = 6;
        short thermalPower = 65;
        int graphicsFrequency = 350;
        long diskSpace = 1000000L;
        float clockFrequency = 3.50F;
        double operationalMemory = 16.0;
        char processorIndex = 'i';
        boolean isСamera = true;
        System.out.println("Количество ядер: " + numberOfCores);
        System.out.println("Тепловая мощность: " + thermalPower);
        System.out.println("Частота графического процессора: " + graphicsFrequency);
        System.out.println("Объем дискового пространства: " + diskSpace);
        System.out.println("Тактовая частота: " + clockFrequency);
        System.out.println("Объем оперативной памяти: " + operationalMemory);
        System.out.println("Индекс маркировки процессора: " + processorIndex);
        System.out.println("Наличие видеокамеры: " + isСamera);
    }
}
