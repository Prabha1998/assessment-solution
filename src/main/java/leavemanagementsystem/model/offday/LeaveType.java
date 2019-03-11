package leavemanagementsystem.model.offday;

public enum LeaveType {
    CASUAL(5),SICK(5),PRIVILEGE(15);
    int maxCount;
    LeaveType(int maxCount){
        this.maxCount=maxCount;
    }
}
