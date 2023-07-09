package org.goit.hw4.main;

import java.io.IOException;
import java.sql.SQLException;

public class DatabasePopulateService {

    private static final String POPULATE_DB_PATH = "src/main/java/org/goit/hw4/sql/populate_db.sql";

    public static void main(String[] args) throws IOException, SQLException {
        SQLFileReader sqlFileReader = new SQLFileReader();
        String sql = sqlFileReader.readFile(POPULATE_DB_PATH);

        Database.sendSQLExecuteUpdate(sql);
    }
}
