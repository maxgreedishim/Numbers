public class Main {
    public static class NumberHolder {
        public static int anInt;
        public static float aFloat;
        public static int anIntOne;
        public static float aFloatOne;

        public NumberHolder(int anIntOne, float aFloatOne) {
            this.anIntOne = anIntOne;
            this.aFloatOne = aFloatOne;
        }
    }
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder(23,23.23f);
        NumberHolder.aFloat = 1.2f;
        NumberHolder.anInt = 12;
        System.out.println(NumberHolder.anInt);
        System.out.println(NumberHolder.aFloat);
        System.out.println(NumberHolder.aFloatOne);
        System.out.println(NumberHolder.anIntOne);
    }
}
