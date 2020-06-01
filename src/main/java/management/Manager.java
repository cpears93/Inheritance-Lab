package management;

public class Manager {

    private String deptName;
    private String employee;

    public Manager(String deptName, String employee) {
        this.deptName = deptName;
        this.employee = employee;
    }

    public String getDeptName() {
        return deptName;
    }
}
