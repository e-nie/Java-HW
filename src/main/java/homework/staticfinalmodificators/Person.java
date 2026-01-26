package homework.staticfinalmodificators;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo(){
        System.out.println("Name: " + firstName + ", Last Name: " + lastName + ", SSN: " + ssn);
    }

    static void main() {
        Person p1 = new Person("Alan", "Parker", "123");
        Person p2 = new Person("Ray", "Young", "456");
        Person p3 = new Person("Mike", "Lane", "789");

        p1.setLastName("Turing");
        p1.printPersonInfo();
    }

}
