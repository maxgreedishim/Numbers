public class Main {
    public static class NumberHolder {
        public int anInt;
        public float aFloat;

    }

    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.aFloat = 1.2f;
        numberHolder.anInt = 12;
        System.out.println(numberHolder.anInt);
        System.out.println(numberHolder.aFloat);
        numberHolder = new NumberHolder();
        numberHolder.aFloat = 1.8f;
        numberHolder.anInt = 19;
        System.out.println(numberHolder.anInt);
        System.out.println(numberHolder.aFloat);

    }
}
