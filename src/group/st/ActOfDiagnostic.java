package group.st;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ActOfDiagnostic {

    String companyName;
    String dateOfCreation;
    Device device;
    User user;
    OS os;
    int number;

    Scanner input = new Scanner(System.in);

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setDateOfCreation() {
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        this.dateOfCreation = sdf.format(dt);
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public OS getOs() {
        return os;
    }

    public ActOfDiagnostic(){
        System.out.println("Акт диагностики создан");
        Device newDevice = new Device();
    }



/*
    public static int NumbersOfActsPerPeriod (Date beginDate; Date lastDate; String companyName)
    {

        int numbers

        return numbers;
    }
    */
/*
    public void Create() {

        System.out.println("В");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    */
}





