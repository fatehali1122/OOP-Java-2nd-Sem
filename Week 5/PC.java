private int ram;
private int storage;
public PC(String id, String version, int ram, int storage) {
    this.id = id;
    this.version = version;
    this.ram = ram;
    this.storage = storage;
}

	public void displayPC(){
		System.out.println("PC Id: "+ id);
		System.out.println("PC Version: "+ version);
		System.out.println("PC Ram: "+ ram);


	}
}