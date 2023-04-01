package inheritance;

/**
 * Created by Jay Vaghani
 */
public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Prime", 50000, "Entain");
        System.out.println(employee.geteId());
        System.out.println(employee.getSalary());
        System.out.println(employee.getOrganization());
        System.out.println(employee.geteName());

        // String Object
        String s = new String("Prime");
        s.concat("Testing");
        System.out.println(s);

        // String Buffer Object
        StringBuffer sb = new StringBuffer("Prime");
        sb.append("Testing");
        System.out.println(sb);

    }
}
