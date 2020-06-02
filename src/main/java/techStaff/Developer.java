package techStaff;

public class Developer {

    private String name;
    private int niNumber;
    private int salary;

    public Developer(String name, int niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }
}
