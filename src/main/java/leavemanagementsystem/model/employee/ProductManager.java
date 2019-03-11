package leavemanagementsystem.model.employee;

import leavemanagementsystem.employeeservices.productmanagerservices.RegisterEmployee;
import leavemanagementsystem.model.database.AdminList;

public class ProductManager implements RegisterEmployee {


    public void registerEmploee(Employee employee){

      if(employee.getEmployeeRole()==EmployeeRole.ADMIN){
          AdminList.getInstance().getAdminList().add(employee);
      }

      AdminList.getInstance().getAdminList().add(employee);

    }

}
