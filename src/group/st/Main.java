package group.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

    public static void main(String args[]) {

        // Загружаем класс драйвера
        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("НЕ удалось загрузить драйвер ДБ.");
            e.printStackTrace();
            System.exit(1);
        }

        // Cоздаем соединение, здесь dbpath это путь к папке где будут хранится
        // файлы БД. dbname имя базы данных. SA это имя пользователя который
        // создается автоматически при создании БД пароль для него пустой. Если
        // такой базы данных нет она будет автоматически создана.
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:hsqldb:file:D:/DBpath/TestDB", "Igor", "Danila_Master91");
        } catch (SQLException e) {
            System.err.println("НЕ удалось оздать соединение.");
            e.printStackTrace();
            System.exit(1);
        }

        try {
            Statement statement = connection.createStatement();
            // создаем таблицу со столбцами id и value.
            String query = "CREATE TABLE mytable (id IDENTITY , value VARCHAR (32))";
            try {
                statement.executeUpdate(query);
            } catch (SQLException e) {
                // если таблица уже существует, будет исключение, игнорируем его.
            }
            // добавляю записи в таблицу.
            query = "INSERT INTO mytable (value) VALUES('Киев')";
            statement.executeUpdate(query);
            query = "INSERT INTO mytable (value) VALUES('Минск')";
            statement.executeUpdate(query);
            query = "INSERT INTO mytable (value) VALUES('Москва')";
            statement.executeUpdate(query);

            // достаю записи из таблицы
            query = "SELECT id, value FROM mytable";
            ResultSet resultSet = statement.executeQuery(query);

            // распечатываю
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " "
                        + resultSet.getString(2));
            }

            //отключаюсь от БД
            query = "SHUTDOWN";
            statement.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}







/*
package group.st;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;
//import java.util.SimpleTimeZone;
import java.text.*;

public class Main {
	static void CheckUser(String login, String password)
	{

	}

	public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();


	public static void main(String[] args) {
	/* Привет!
	 * Это пограмма для сервисных центров и призвана помочь инженерам в составлении актов
	 * Задачи:
	 * - создать БД для хранения, добавления и вывода данных по оборудованию пришедшему в сервисный центр
	 *
	 *
	 *
	 *
	String login, password;
	Scanner input = new Scanner(System.in);

	System.out.println ("Введите свой логин");
	login = input.nextLine();

	System.out.println ("Введите свой пароль:");
    password = input.nextLine();

    System.out.println("Выберите пункт:");
    System.out.println("1. Составить акт диагностики");
    System.out.println("2. Просмотреть акт диагностики");


    switch (input.nextInt()) {
		case 1: {
			ActOfDiagnostic newActOfDiagnostic = new ActOfDiagnostic();

			String a = gson.toJson(newActOfDiagnostic);
			System.out.println(a);
			JSObject json = new JSObject() {
				@Override
				public Object call(String methodName, Object... args) throws JSException {
					return null;
				}

				@Override
				public Object eval(String s) throws JSException {
					return null;
				}

				@Override
				public Object getMember(String name) throws JSException {
					return null;
				}

				@Override
				public void setMember(String name, Object value) throws JSException {

				}

				@Override
				public void removeMember(String name) throws JSException {

				}

				@Override
				public Object getSlot(int index) throws JSException {
					return null;
				}

				@Override
				public void setSlot(int index, Object value) throws JSException {

				}
			}
			break;
		}
		case 2:
			//ActOfDiagnostic.Show();
			break;
	//	case null:
	//		System.out.println("Вы не выбрали ни одного пункта");
		default:
			System.out.println("Вы выбрали неверный пункт");
			break;
	}



    }
}
*/