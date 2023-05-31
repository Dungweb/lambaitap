package BUS;

import DAO.NhatKyChiDAO;
import DTO.NhatKyChiDTO;

import java.sql.SQLException;
import java.util.List;

public class NhatKyChiBUS{
    public NhatKyChiBUS() throws SQLException {
        try {
            nhatKyChiDAO = new NhatKyChiDAO();
        } catch (Exception ignored) {

        }
    }
    private NhatKyChiDAO nhatKyChiDAO;
    public boolean updateNhatKyCHi(NhatKyChiDTO nhatKyChiDTO) throws SQLException {
        return nhatKyChiDAO.addNhatKyChi(nhatKyChiDTO) != 0;
    }
    public Double TongMucCHi(NhatKyChiDTO nhatKyChiDTO) throws SQLException {
        List<List<String>> chuoiNhatKy = nhatKyChiDAO.executeQuery();
        double total = 0;
        for (List<String> chuoi: chuoiNhatKy) {
            total += Double.parseDouble(chuoi.get(2));
        }
        return total;
    }
}
