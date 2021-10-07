public class Main {
    public static int anInt;
    public static float aFloat;
    public static int anIntOne;
    public static float aFloatOne;

    public Main(int anIntOne, float aFloatOne) {
        this.anIntOne = anIntOne;
        this.aFloatOne = aFloatOne;
    }

    public static void main(String[] args) {
        new Main(23,23.23f);
        aFloat = 1.1f;
        anInt = 10;
        System.out.println(anInt);
        System.out.println(aFloat);
        System.out.println(aFloatOne);
        System.out.println(anIntOne);
    }
}
