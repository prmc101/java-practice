package inheritance;

/**
 * Created by Jay Vaghani
 */
public class Employee extends EmpBase{

    int salary;
    String organization;

    public Employee(int eId, String eName) {
        super(eId, eName);
    }


    public int getSalary(){
        return salary;
    }

    public String getOrganization(){
        return organization;
    }
}
