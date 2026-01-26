package homework.staticfinalmodificators;

public class Company {
    static String companyName = "Horns and Pfotters";
    String employeeName;
    final int employeeID;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }


    public static void main(String[] args) {
        Company e1 = new Company(1, "Ivo");
        Company e2 = new Company(2, "Eva");
        Company e3 = new Company(3, "Oli");

        printCompanyName();

        companyName = "Evoga";

        printCompanyName();

        e3.setEmployeeName("Mark");
        System.out.println(e3.employeeName);
        System.out.println("Company: " + companyName + ", Name: " + e3.getEmployeeName() + ", Employee ID: " + e3.employeeID);
    }

}
