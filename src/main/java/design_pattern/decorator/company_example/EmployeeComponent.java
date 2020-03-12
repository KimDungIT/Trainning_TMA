package design_pattern.decorator.company_example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface EmployeeComponent {
    String getName();

    void doTask();

    void join(Date joinDate);

    void terminate(Date theDate);

    default String formatDate(Date theDate) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(theDate);
    }

    default void showBasicInformation() {
        System.out.println("The basic information of "+ getName());
        join(Calendar.getInstance().getTime());
        Calendar terminateDate  = Calendar.getInstance();
        terminateDate.add(Calendar.MONTH, 6);
        terminate(terminateDate.getTime());
    }


}
