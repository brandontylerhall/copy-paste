public class Device implements TextEditor {
    private static String type;
    private static String brand;
    private static double price;

    public Device(String type, String brand, double price) throws IllegalArgumentException {
        if (type == null || brand == null || price == 0) {
            System.out.println("Not a valid input");
            throw new IllegalArgumentException();
        } else {
            Device.type = type;
            Device.brand = brand;
            Device.price = price;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String openTextFile(String filename) {
        if (brand.equalsIgnoreCase("Microsoft")) {
            return "Opening " + filename + " with Notepad";
        } else if (brand.equalsIgnoreCase("Apple")) {
            return "Opening " + filename + " with TextEdit";
        }
        return filename;
    }


}
