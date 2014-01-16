/*
 * Copyright (C) 2014 Jerome V. Angeles
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
 *  This is an example code that
 *  -   Shows how to use the Base class
 *  -   Example of CRUD(Create, Update, Delete) operations
 *  -   Implements an active recordy type of returning values from a database
 * 
 *  With this technique you should use it as a standard for the rest of your work
 * 
 *  We shall continue this on monday
 */
public class User extends Base{
    
    private String username;
    private String password;
    private UserPositions userPosition;
    
    private User(){
        initialize();
    }
    
    public static User newUser(){
        return new User();
    }
    
    /**
     * @param username The username required
     * @param password The password required
     * @return Whether the username and password supplied will match something at the database
    */
    public static boolean verifyInputs(String username, String password){
        boolean resultToBeReturned = false;
        String command = "Select * from Users where Username = '" + username + "';";
        try{
            staticConnection = DriverManager.getConnection(connectionString);
            staticStatement = staticConnection.createStatement();
            staticResultSet = staticStatement.executeQuery(command);
            while(staticResultSet.next()){
                String realUsername = staticResultSet.getString("Username");
                String realPassword = staticResultSet.getString("_Password");
                if(realUsername.equals(username) && realPassword.equals(realPassword)){
                    resultToBeReturned = true;
                }                    
            }
        }
        catch(SQLException e){
            System.out.print(e.getMessage());
        }
        return resultToBeReturned;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the userPosition
     */
    public UserPositions getUserPosition() {
        return userPosition;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param userPosition the userPosition to set
     */
    public void setUserPosition(UserPositions userPosition) {
        this.userPosition = userPosition;
    }
}
