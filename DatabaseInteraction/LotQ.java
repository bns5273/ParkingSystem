/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseInteraction;

/**
 *
 * @author Ian
 */
public class LotQ extends Query{

    @Override
    public String getString(String[] str) {
        String query = "SELECT *\n" +
                        "FROM Ticket\n" +
                        "WHERE lot = '" + str[0] + "';";
        return query;
    }
    
}