package group.st;

import java.util.Scanner;

public class Defect {
    String part;
    String defect;
    Scanner input = new Scanner(System.in);

    public void setPart(String part) {
        this.part = part;
    }

    public String getPart() {
        return part;
    }

    public void setDefect(String defect) {
        this.defect = defect;
    }

    public String getDefect() {
        return defect;
    }

    public Defect(){
        System.out.println("Введите неисправную деталь");
        setPart(input.nextLine());
        System.out.println("Введите неисправность для данной детали");
        setDefect(input.nextLine());
    }

    public Defect(String part, String defect){
        this.part = part;
        this.defect = defect;
    }
/*
    @Override
    public String toString() {
        return this.part + "(" + this.defect + ")";
    }
    */
}
