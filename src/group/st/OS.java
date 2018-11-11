
package group.st;

import java.util.Scanner;

public class OS {
    private String nameOS;
    private String version;
    private Scanner input = new Scanner(System.in);

    public OS() {
    System.out.println("Введите название операционной системы");
    setNameOS(input.nextLine());
    System.out.println("Введите версию операционной системы");
    setVersion(input.nextLine());
    }

    public OS(String nameOS, String version) {
        setNameOS(nameOS);
        setVersion(version);
    }

    public String getNameOS() {
        return nameOS;
    }

    public void setNameOS(String nameOS) {
        this.nameOS = nameOS;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription(){
        return getNameOS() + getVersion();
    }
}
