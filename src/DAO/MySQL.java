package DAO;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MySQL {
    private static Connection conn;
    private static Statement stmt;
//
//    static {
//        String dbUrl = "jdbc:mysql://localhost:3306/ontap";
//        String dbUsername = "root";
//        String dbPassword = "";
//        try {
//            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public MySQL() throws SQLException {
//        stmt = conn.createStatement();
//    }


//    public int update(List<Object> updateValues, String... conditions) throws SQLException {
//        String query = "UPDATE `NhatKyChi`";
//        if (conditionsLength > 0) {
//            query += " WHERE " + String.join(" AND ", conditions);
//        }
//        query += ";";
//        System.out.println("1000" + query);
//        return executeUpdate(query, updateValues.toArray());
//    }


//    public List<List<String>> executeQuery(String query, Object... values) throws SQLException {
//        String formattedQuery = formatQuery(query, values);
//        List<List<String>> result = new ArrayList<>();
//        ResultSet resultSet = stmt.executeQuery(formattedQuery);
//        ResultSetMetaData metaData = resultSet.getMetaData();
//        int columnCount = metaData.getColumnCount();
//        while (resultSet.next()) {
//            List<String> row = new ArrayList<>(columnCount);
//            for(int i = 1; i <= columnCount; i++) {
//                row.add(resultSet.getString(i));
//            }
//            result.add(row);
//        }
//        return result;
//    }

    public String formatQuery(String query, Object... values) {
        String stringValue;
        for (Object value : values) {
            if(value instanceof Date) {
                stringValue = "'" + value + "'";
            } else if (value instanceof String || value instanceof Character) {
                stringValue = "'" + value + "'";
            } else if (value instanceof Boolean) {
                stringValue = (boolean) value ? "1" : "0";
            } else {
                stringValue = "'" + value.toString() + "'";
            }
            query = query.replaceFirst("\\?", stringValue);
        }
        return query;
    }
}
