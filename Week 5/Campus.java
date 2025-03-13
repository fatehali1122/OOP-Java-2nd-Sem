public class Campus {
    private String name;
    private Department[] departments;

    public Campus(String name, int numDepartments) {
        this.name = name;
        this.departments = new Department[numDepartments];
    }

    public void addDepartment(Department dept, int index) {
        if (index >= 0 && index < departments.length) {
            departments[index] = dept;
        }
    }

    public void displayCampusDetails() {
        System.out.println("Campus Name: " + name);
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] != null) {
                departments[i].displayDepartmentDetails();
            }
        }
    }
}