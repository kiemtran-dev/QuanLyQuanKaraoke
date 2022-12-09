package Controller;
/**
 *
 * @author kiemtran
 */
import Model.DataModel.SANPHAM;
import java.util.ArrayList;
import java.util.List;

public class SANPHAMService {
    public static List<SANPHAM> getAllSanPham() {
        return Model.SANPHAMModel.getAllSanPham();
    }
    public static int setSanPham(SANPHAM sanpham) {
        return Model.SANPHAMModel.setSanPham(sanpham);
    }
    
    public static int updateSanPham(SANPHAM sanpham, String tenmoi) {
        return Model.SANPHAMModel.updateSanPham(sanpham, tenmoi);
    }
    
    public static int deleteSanPham(String tensp) {
        return Model.SANPHAMModel.deleteSanPham(tensp);
    }
    
    public static boolean checkExistedSP(String tensp) {
        List<SANPHAM> sps = Model.SANPHAMModel.getAllSanPham();
        for (SANPHAM sanpham:sps) {
            if (sanpham.getTenSanPham().equals(tensp)) {
                return true;
            }
        }
        return false;
    }
    
    public static List<String> getAllnameSP() {
        List<SANPHAM> sps = Model.SANPHAMModel.getAllSanPham();
        List<String> namesps = new ArrayList<>();
        for (SANPHAM sp:sps) {
            namesps.add(sp.getTenSanPham());
        }
        return namesps; 
    }
}
