import java.sql.Connection;
import java.util.*;

public class Main {
    /*
    1. Otwórz nowy projekt mavenowy  oraz wrzuć go na gita
    2. Utwórz klasę która połączy się z Twoją bazą danych oraz wrzuć na gita
    3. Wykonaj zapytanie które wyświetli wszystkie rekordy z tabeli employees oraz wrzuć na gita
    4. Utwórz metodę, która będzie dodawała nowe wpisy do bazy danych oraz wrzuć na gita
    5. Utwórz metodę, która będzie aktualizowałą wpisy w bazie danych oraz wrzuć na gita
    6. Utwórz metodę, która będzie usuwała wpisy z bazy danych
    7. Napisz tranzakcję dla metod typu CRUD oraz wrzuć na gita
    8. Napisz testy jednostkowe dla swojej aplikacji oraz wrzuć na gita
    9. Wykorzystaj projekt, w którym łączyliśmy się z API i pobieraliśmy dane o pracownikach
    i zrób metodę, która doda ich do bazy danych a brakujące dane wygeneruje lub będzie ustawiać domyślną wartość
    */
    public static void main(String[] args) {
        Connection connection = new SQLConnection().getConnection();
        CRUDStatementSQL crudStatementSQL = new CRUDStatementSQL(connection);
//(LastName, FirstName, Address, City, Salary, Age, StartJobDate, Benefit
        String tableName = "Employees";

        List<String> columnNames = new ArrayList<>();
        columnNames.add("LastName");
        columnNames.add("FirstName");
        columnNames.add("Address");
        columnNames.add("City");
        columnNames.add("Salary");
        columnNames.add("Age");
        columnNames.add("StartJobDate");
        columnNames.add("Benefit");
//
//        Map<String, String> updateValues = new LinkedHashMap<>();
//        updateValues.put("LastName", "Jasiek");
//        updateValues.put("FirstName", "Nowakowskiwe");
//        updateValues.put("Address", "Nowa 15");
//        updateValues.put("City", "Warszawa");
//        updateValues.put("Salary", "8000");
//        updateValues.put("Age", "55");
//        updateValues.put("StartJobDate", "20180908");
//        updateValues.put("Benefit", "1");

//        crudStatementSQL.updateSQLbyJDBC(updateValues, tableName, "where id = 2");
        //crudStatementSQL.addSQLbyJDBC(updateValues, tableName);
        //crudStatementSQL.selectSQLbyJDBC(columnNames,tableName);
        crudStatementSQL.delSQLbyJDBC(tableName,"Salary","8000");
    }
}
