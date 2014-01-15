/*
 * Copyright (C) 2014 Shekainah
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package Database;

import java.sql.*;
import sun.jdbc.odbc.JdbcOdbcDriver;
/**
 *
 * @author Jerome
 * 
 * Notes:
 * 
 * Example code that 
 *  -   Declares the basic variables that is used to connect to a database
 *  -   If you want to create another database you should probably inherit
 *      this class.
 *  -   This class alone will do nothing but the ones presented above and
 *      it only provide what it will provide.
 * 
 * Methods
 *  -  
 */
public class Base {
    static String database = "jdbc:odbc:APPSDatabase";
    protected static Connection staticConnection;
    protected static Statement staticStatement;
    protected static ResultSet staticResultSet;
    protected Connection connection;
    protected Statement statement;
    protected ResultSet resultSet;
    
    public void initialize(){
        try{
            connection = DriverManager.getConnection(database);
            statement = connection.createStatement();
            System.out.print("yeah");
        }
        catch(SQLException e){
            System.out.print(e.getMessage());
        }
    }
}
