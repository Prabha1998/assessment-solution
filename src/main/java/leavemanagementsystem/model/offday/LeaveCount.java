package leavemanagementsystem.model.offday;

import leavemanagementsystem.model.employee.EmployeeType;
import lombok.Getter;

@Getter
public class LeaveCount {
    int casualLeaveCount;
    int sickLeaveCount;
    int privilegeLeaveCount;


    public LeaveCount(EmployeeType employeeType) {
        if(employeeType.equals("PROBATION")){}
        else{
            this.casualLeaveCount = LeaveType.CASUAL.maxCount;
            this.sickLeaveCount = LeaveType.SICK.maxCount;
            this.privilegeLeaveCount = LeaveType.PRIVILEGE.maxCount;
        }
    }

    int leavesCredited(){
        return LeaveType.CASUAL.maxCount+LeaveType.SICK.maxCount+LeaveType.PRIVILEGE.maxCount;
    }

    int leavesLeft(){
        return leavesCredited()-casualLeaveCount-sickLeaveCount-privilegeLeaveCount;
    }

    int leavesDebited(){
        return casualLeaveCount+sickLeaveCount+privilegeLeaveCount;
    }

    boolean grantCasualLeave(){
        if(casualLeaveCount>0){
            casualLeaveCount--;
            return true;
        }
        return false;
    }

    boolean grantSickLeave(){
        if(sickLeaveCount>0){
            sickLeaveCount--;
            return true;
        }
        return false;
    }

    boolean grantPrivilegeLeave(){
        if(privilegeLeaveCount>0){
            privilegeLeaveCount--;
            return true;
        }
        return false;
    }
}
