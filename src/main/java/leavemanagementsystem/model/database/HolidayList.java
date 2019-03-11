package leavemanagementsystem.model.database;

import leavemanagementsystem.model.offday.Holiday;
import lombok.Getter;

import java.util.*;

@Getter
public class HolidayList {
    Map<Date,Holiday> holidayList;
    private static HolidayList holidayListInstance = new HolidayList();

    public static HolidayList getInstance() {
        return holidayListInstance;
    }

    private HolidayList() {
        holidayList=new HashMap<Date, Holiday>();
    }
    public void monthlyView(int month){
        for (Map.Entry<Date,Holiday> entry:
             holidayList.entrySet()) {
            Date date=entry.getKey();
            if(date.getMonth()==month){
                System.out.println(entry);
            }
        }
    }

    public void yearlyView(int year){
        for (Map.Entry<Date,Holiday> entry:
                holidayList.entrySet()) {
            Date date=entry.getKey();
            if(date.getYear()==year){
                System.out.println(entry);
            }
        }
    }
}
