package leavemanagementsystem.model.database;

import leavemanagementsystem.model.employee.Employee;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class EmployeeList {
    List<Employee> employeeList;
    private static EmployeeList employeeListInstance = new EmployeeList();

    public static EmployeeList getInstance() {
        return employeeListInstance;
    }

    private EmployeeList() {
        employeeList=new ArrayList<Employee>();
    }
}
