package DAO;

import DTO.NhatKyChiDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;


public class NhatKyChiDAO{
    private static Connection conn;
    private static Statement stmt;

    static {
        String dbUrl = "jdbc:mysql://localhost:3306/ontap";
        String dbUsername = "root";
        String dbPassword = "";
        try {
            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public NhatKyChiDAO()  throws SQLException {
        stmt = conn.createStatement();
    }
    public List<List<String>> executeQuery() throws SQLException {
        String formattedQuery = "SELECT * FROM `NhatKyChi`";
        List<List<String>> result = new ArrayList<>();
        ResultSet resultSet = stmt.executeQuery(formattedQuery);
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        while (resultSet.next()) {
            List<String> row = new ArrayList<>(columnCount);
            for (int i = 1; i <= columnCount; i++) {
                row.add(resultSet.getString(i));
            }
            result.add(row);
        }
        return result;
    }
    public int addNhatKyChi(NhatKyChiDTO nhatKyChiDTO) throws SQLException{
        String query = "INSERT INTO `NhatKyChi` VALUES(" + nhatKyChiDTO.getID() + "," + nhatKyChiDTO.getNgay()+ "," + nhatKyChiDTO.getMucChi() + "," + nhatKyChiDTO.getSoTien() + "," + nhatKyChiDTO.getGhiChu() +");";
        int numOfRows = stmt.executeUpdate(query);
        return numOfRows;
    }

}
