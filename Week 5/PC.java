public class PC {
    private String id;        // Declare instance variables
    private String version;
    private int ram;
    private int storage;

    public PC(String id, String version, int ram, int storage) {
        this.id = id;
        this.version = version;
        this.ram = ram;
        this.storage = storage;
    }

    public void displayPC() {  // Example method to print PC details
        System.out.println("PC Id: " + id);
        System.out.println("PC Version: " + version);
        System.out.println("PC RAM: " + ram + "GB");
        System.out.println("PC Storage: " + storage + "GB");
    }
}
