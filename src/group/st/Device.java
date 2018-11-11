package group.st;

import java.util.ArrayList;
import java.util.Scanner;

/* Класс описывающий оборудование диагностики
 * 1. Тип оборудования (Laptop, DCT (TSD), etc.)
 * 2. Производитель оборудования (Motorola, Unify, Datalogic, etc.)
 * 3. Модель оборудования
 * 4. Модификация (для ТСД Gun, K, Rotate, S)
 * 5. Серийный номер
 * 6. МАК адрес
 * 7. Инвентарный номер оборудования
 * 8. Список неисправных деталей с описанием неисправности
 * 9. Список дополнительных работ
 * 10. Инженер проведший диагностику
 * 11. Операционная система
 */

public class Device {
    String manufacture;
    String model;
    String modification;
    String serialNumber;
    String macAdress;
    String stockNumber;
    ArrayList<Defect> defects = new ArrayList<>();
    User user;
    OS os;

    Scanner input = new Scanner(System.in);

    public Device () {
        System.out.println("Новое устройство создано");
        System.out.println("Введите производителя обоудования");
        setManufacture(input.nextLine());
        System.out.println("Ведите модель оборудования");
        setModel(input.nextLine());
        System.out.println("Ведите модификацию оборудования");
        setModification(input.nextLine());
        System.out.println("Ведите серийный номер оборудования");
        setSerialNumber(input.nextLine());
        System.out.println("Ведите идентификационный номер оборудования");
        setStockNumber(input.nextLine());
        System.out.println("Ведите MAC-адесс оборудования");
        setMacAdress(input.nextLine());
        //Цикл на внесение неисправностей

        System.out.println("Есть неисправные детали в диагностируемом оборудовании?");
        try {
            while (input.nextLine().charAt(0) != 'N') {
                defects.add(new Defect());
                System.out.println("Есть неисправные детали в диагностируемом оборудовании?");
            }
        } catch ( Exception e) {
            //System.out.println( e );
            System.out.println("Вы ничего не ввели");
            return;
        }




    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setMacAdress(String macAdress) {
        this.macAdress = macAdress;
    }

    public String getMacAdress() {
        return macAdress;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public String getModification() {
        return modification;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public OS getOs() {
        return os;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getStockNumber() {
        return stockNumber;
    }


}
