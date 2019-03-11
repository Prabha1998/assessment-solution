package leavemanagementsystem.model.database;

import leavemanagementsystem.model.employee.Employee;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class AdminList {
    List<Employee> adminList;
    private static AdminList adminListInstance = new AdminList();

    public static AdminList getInstance() {
        return adminListInstance;
    }

    private AdminList() {
        adminList=new ArrayList<Employee>();
    }
}
