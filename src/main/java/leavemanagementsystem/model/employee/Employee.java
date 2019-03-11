package leavemanagementsystem.model.employee;

import leavemanagementsystem.services.GenerateId;
import leavemanagementsystem.employeeservices.ViewHolidays;
import leavemanagementsystem.model.offday.LeaveCount;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Employee implements ViewHolidays {

    public Employee(Name name, EmailId emailId, Date dateOfJoining, EmployeeType employeeType, EmployeeRole employeeRole) {
        GenerateId generateId = new GenerateId();
        this.employeeId=generateId.getId();
        this.name = name;
        this.emailId = emailId;
        this.dateOfJoining = dateOfJoining;
        this.employeeType = employeeType;
        this.employeeRole = employeeRole;
        this.leaveCount = new LeaveCount(employeeType);
    }

    private int employeeId;
    private Name name;
    private EmailId emailId;
    private Date dateOfJoining;
    private EmployeeType employeeType;
    private EmployeeRole employeeRole;
    private LeaveCount leaveCount;


}
