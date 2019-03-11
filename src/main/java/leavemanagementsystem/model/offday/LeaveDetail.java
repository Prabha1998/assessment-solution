package leavemanagementsystem.model.offday;

import leavemanagementsystem.model.employee.Admin;
import lombok.AllArgsConstructor;

import java.util.Date;
@AllArgsConstructor
public class LeaveDetail {
    LeaveType leaveType;
    LeaveStatus leaveStatus;
    Date date;
    Admin appliedToAdmin;

}
