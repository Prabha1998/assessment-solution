package leavemanagementsystem;

import leavemanagementsystem.model.database.EmployeeList;
import leavemanagementsystem.model.employee.EmailId;
import leavemanagementsystem.model.employee.Employee;
import leavemanagementsystem.model.offday.LeaveStatus;
import leavemanagementsystem.model.offday.LeaveType;

public class LeaveManagementSystem {
    LeaveStatus applyLeave(int id, LeaveType leaveType){
        for(Employee emp:EmployeeList.getInstance().getEmployeeList()){
            if(emp.getEmployeeId()==id){
                emp.getLeaveCount();
            }
        }
        return null;
    }

    LeaveStatus applyLeave(EmailId emailId, LeaveType leaveType){
return null;
    }
}
