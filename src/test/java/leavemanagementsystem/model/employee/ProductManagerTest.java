package leavemanagementsystem.model.employee;

import leavemanagementsystem.exceptions.EmailNotValidException;
import leavemanagementsystem.exceptions.NameNotValidException;
import leavemanagementsystem.model.database.AdminList;
import leavemanagementsystem.model.database.EmployeeList;
import leavemanagementsystem.model.database.HolidayList;
import leavemanagementsystem.model.offday.Holiday;
import leavemanagementsystem.model.offday.LeaveCount;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.Date;

import static org.junit.Assert.*;

public class ProductManagerTest {
    @Test
public void testProductManagerFunctionality() throws NameNotValidException, EmailNotValidException {
    Date date=new Date(2015,3,4);
    LeaveCount leaveCount=new LeaveCount(EmployeeType.PERMANENT);
    Employee employee=new Employee(new Name("abc"),new EmailId("abc@gmail.com"),date,EmployeeType.PERMANENT,EmployeeRole.ADMIN);
    ProductManager productManager=new ProductManager();
    productManager.registerEmploee(employee);
        System.out.println(EmployeeList.getInstance().getEmployeeList());
        System.out.println(AdminList.getInstance().getAdminList());
}
}