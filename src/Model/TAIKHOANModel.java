package Model;
/**
 *
 * @author kiemtran
 */
import static Model.JDBCConnection.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.DataModel.TAIKHOAN;
import org.mindrot.jbcrypt.BCrypt;

public class TAIKHOANModel {
    public static List<TAIKHOAN> getAllTaikhoans() {
        List<TAIKHOAN> lgs = new ArrayList<>();
        Connection conn = null;
        try {
            conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "SELECT * FROM karaokemanagement.taikhoan";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                TAIKHOAN lg = new TAIKHOAN(rs.getString("Username"), rs.getString("MatKhau"), rs.getString("Ten"), rs.getString("SoDienThoai"), rs.getString("LoaiTaiKhoan"));
                lgs.add(lg);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            if (conn == null) System.out.println("Ket noi that bai!");
        }
        return lgs;
    }
    
    public static int insertTaiKhoan(TAIKHOAN account) {
        int rs = 0;
        Connection conn= null;
        try {
            conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO TAIKHOAN VALUES ( '" + account.getUsername() + "', '" 
                    + BCrypt.hashpw(account.getMatKhau(), BCrypt.gensalt(10)) + "','" 
                    + account.getTen() + "', '" + account.getSoDienThoai() + "', '" + account.getLoaiTaiKhoan() + "' )";
            rs = stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
            if (conn == null) System.out.println("Ket noi that bai!");
        }
        return rs;
    }
    
    public static boolean checkNewUser(String usString, String sdtString) {
        List<TAIKHOAN> lgs = getAllTaikhoans();
        return lgs.stream().anyMatch(lg -> (lg.getUsername().equals(usString) || lg.getSoDienThoai().equals(sdtString)));
    }
    
    public static Object[] checkLogin(String usString, String pwString) {
        List<TAIKHOAN> lgs = getAllTaikhoans();
        String loaitk = "",
                tentk = "";
        for (TAIKHOAN lg:lgs) {
            if (lg.getUsername().equals(usString) && BCrypt.checkpw(pwString, lg.getMatKhau())) {
                loaitk = lg.getLoaiTaiKhoan();
                tentk = lg.getTen();
            }
        }
        return new Object[]{loaitk, tentk};
    }
    
    public static int updateTaiKhoan(TAIKHOAN account) {
        int rs = 0;
        Connection conn = null;
        try {
            conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "UPDATE TAIKHOAN SET MatKhau = '" + account.getMatKhau() + "', Ten = '" + account.getTen() + "', SoDienThoai = '"
                + account.getSoDienThoai() + "', LoaiTaiKhoan = '" + account.getLoaiTaiKhoan() + "' WHERE Username = '" + account.getUsername() + "'";
            rs = stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
            if (conn == null) System.out.println("Ket noi that bai!");
        }
        return rs;
    }
    
    public static int deleteTaiKhoan(String username) {
        int rs = 0;
        Connection conn = null;
        try {
            conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "DELETE FROM karaokemanagement.TAIKHOAN WHERE Username = '" + username + "'";
            rs = stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
            if (conn == null) System.out.println("Ket noi that bai!");
        }
        return rs;
    }
}
