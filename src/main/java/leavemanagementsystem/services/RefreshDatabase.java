package leavemanagementsystem.services;

import leavemanagementsystem.model.database.EmployeeList;
import leavemanagementsystem.model.employee.Employee;
import leavemanagementsystem.model.employee.EmployeeType;

public class RefreshDatabase {

    public static void refresh(){

        for(Employee emp: EmployeeList.getInstance().getEmployeeList()){
//            //if(emp.getDateOfJoining()+6==currentDate){
//                emp.setEmployeeType(EmployeeType.PERMANENT);
//            }
        }
    }
}
