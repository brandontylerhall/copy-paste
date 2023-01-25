public class Tablet extends Device {
    private static boolean physicalKeyboard;


    public Tablet(String type, String brand, double price, boolean physicalKeyboard) throws IllegalArgumentException {
        super(type, brand, price);
        Tablet.physicalKeyboard = physicalKeyboard;
    }

    public static boolean hasPhysicalKeyboard() {
        return physicalKeyboard;
    }
}
