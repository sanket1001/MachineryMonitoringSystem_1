package ps1.rishabh.com.machinerymonitoringsystem;
/*
Status will be of 3 kinds
 0 means working
 1 means UnderRepair
 2 means Stopped Working
 */

public class MonitorClass {
    public String DepartmentName;
    public String Reason;
    public int MachineNum;
    public int Status;

    public MonitorClass(){

    }

    public MonitorClass(String DeptName, int MachineNum, int Status, String Reason){
        this.DepartmentName = DeptName;
        this.MachineNum = MachineNum;
        this.Status = Status;
        this.Reason = Reason;
    }

}
