public class Main {
    public static void main(String[] args) {
        Campus comsats = new Campus("Comsats University", 10);

        for (int i = 0; i < 10; i++) {
            Department dept = new Department("Incharge " + (i + 1), new String[]{"Staff1", "Staff2"}, 50);

            for (int j = 0; j < 50; j++) {
                Lab lab = new Lab("Lab " + (i + 1) + "-" + (j + 1), new Person("ABC", "22"), 5);

                for (int k = 0; k < 5; k++) {
			lab.addPC(new PC("i5", "8th Gen", 8, 500), k);
                }
                dept.addLab(lab, j);
            }
            comsats.addDepartment(dept, i);
        }
        comsats.displayCampusDetails();
    }
}
