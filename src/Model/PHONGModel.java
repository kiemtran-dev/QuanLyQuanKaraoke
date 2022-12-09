package Model;
/**
 *
 * @author kiemtran
 */
import Model.DataModel.PHONG;
import static Model.JDBCConnection.getJDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PHONGModel {
    public static List<PHONG> getAllPhongs() {
        List<PHONG> ps = new ArrayList<>();
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "SELECT * FROM karaokemanagement.PHONG";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                PHONG p = new PHONG(rs.getString("ID_Phong"), rs.getString("TenPhong"), rs.getInt("GiaPhong"), rs.getBoolean("TinhTrang"));
                ps.add(p);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
        return ps;
    }
    
    public static boolean checkRoomStatus(String tenphong) {
        List<PHONG> ps = getAllPhongs();
        for (PHONG phong:ps) {
            if (phong.getTenPhong().equals(tenphong)) {
                return phong.isTinhTrang();
            }
        }
        return false;
    }
    
    private static float toHours(String s) {
        String[] hourMin = s.split(":");
        int hour = Integer.parseInt(hourMin[0]);
        int mins = Integer.parseInt(hourMin[1]);
        float mintohour = mins / 60.0f;
        return (hour + mintohour);
    }
    
    public static float getTienPhong(String tenphong, String giovao, String giora) {
        float giodung = 0;
        int giaphong = 0;
        giovao = giovao.substring(11, 16);
        List<PHONG> ps = getAllPhongs();
        for (PHONG phong:ps) {
            if (phong.getTenPhong().equals(tenphong)) {
                giaphong = phong.getGiaPhong();
                break;
            }
        }
        giodung = (toHours(giora)-toHours(giovao))*giaphong;
        return giodung;
    }
    
    public static void setGiaPhong(String tenPhong, int giaphong) {
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "UPDATE PHONG SET GiaPhong = " + giaphong + " WHERE TenPhong = '" + tenPhong + "'";
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
    }
    
    public static int getGiaPhong(String tenphong) {
        List<PHONG> ps = getAllPhongs();
        int giaphong = 0;
        for (PHONG phong:ps) {
            if (phong.getTenPhong().equals(tenphong)) {
                giaphong = phong.getGiaPhong();
                break;
            }
        }
        return giaphong;
    }
    public static List<String> getRecentRoom(String today) {
        List<String> namerList = new ArrayList<>();
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT DISTINCT TenPhong FROM PHONG JOIN CHITIETPHONG ON PHONG.ID_Phong = CHITIETPHONG.ID_Phong WHERE CHITIETPHONG.GioVao > '" 
                    + today + " 00:00:00'" + " AND PHONG.TinhTrang = true";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                namerList.add(rs.getString("TenPhong"));
            }
            stmt.close();
        } catch (SQLException e) {
        }
        return namerList;
    }
    
    public static List<String> getEmptyRoom() {
        List<String> namerList = new ArrayList<>();
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT TenPhong FROM PHONG WHERE TinhTrang = true";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                namerList.add(rs.getString("TenPhong"));
            }
            stmt.close();
        } catch (SQLException e) {
        }
        return namerList;
    }
    
    public static void switchRoomButton(String phongchuyen, String phongdich, String giovao) {
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            String query, idphong = "";
            query = "SELECT ID_Phong FROM PHONG WHERE TenPhong = '" + phongchuyen + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idphong = rs.getString("ID_Phong");
            }
            query = "UPDATE PHONG SET TinhTrang = true WHERE ID_Phong = '" + idphong + "'";
            stmt.executeUpdate(query);
            query = "SELECT ID_Phong FROM PHONG WHERE TenPhong = '" + phongdich + "'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                idphong = rs.getString("ID_Phong");
            }
            query = "UPDATE PHONG SET TinhTrang = false WHERE ID_Phong = '" + idphong + "'";
            stmt.executeUpdate(query);
            query = "Update CHITIETPHONG SET ID_Phong = '" + idphong + "' WHERE GioVao = '" + giovao + "'";
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
    }
    
    public static void setEmptyRoom(String tenphong) {
        try {
            Connection conn = getJDBCConnection();
            Statement stmt = conn.createStatement();
            
            String query = "UPDATE PHONG SET TinhTrang = false WHERE TenPhong = '" + tenphong + "'";
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
        }
    }
}
