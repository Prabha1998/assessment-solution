package leavemanagementsystem.model.offday;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class Holiday {
    private String name;
    private Date date;
}
