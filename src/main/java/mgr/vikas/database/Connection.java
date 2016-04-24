package mgr.vikas.database;

import org.javalite.activejdbc.Base;

/**
 * Created by A on 30-03-2016.
 */
public class Connection {
    public static void connect() {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://10.10.10.10/NMB", "root", "harry@" );
    }

    public static void close() {
        Base.close();
    }
}
