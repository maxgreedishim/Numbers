public class Main {
    public static class NumberHolder {
        public static int anInt;
        public static float aFloat;

    }

    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        NumberHolder.aFloat = 1.2f;
        NumberHolder.anInt = 12;
        System.out.println(numberHolder.anInt);
        System.out.println(numberHolder.aFloat);

    }
}
