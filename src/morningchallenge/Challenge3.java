package morningchallenge;

/**
 * Created by Jay Vaghani
 */
public class Challenge3 {

    int eId;
    int deptNo;
    String eName;
    String jobTitle;

    public Challenge3(int eId, int deptNo, String eName, String jobTitle) {
        this.eId = eId;
        this.deptNo = deptNo;
        this.eName = eName;
        this.jobTitle = jobTitle;
    }

    public void display(){
        System.out.println(eId);
        System.out.println(deptNo);
        System.out.println(eName);
        System.out.println(jobTitle);
    }
}
