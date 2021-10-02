
package DAO;
import Entity.Staff;
import java.util.List;
import JDBCHelper.JDBCHelper;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Nguyen Truc
 */
public class NhanVienDAO extends EduSysDAO<Staff, String>{
    String insert = "INSERT INTO NHANVIEN(MANV,MATKHAU,HOTEN,VAITRO) VALUES(?,?,?,?)";
    String update = "UPDATE NHANVIEN SET MATKHAU = ? , HOTEN = ? , VAITRO = ? WHERE MANV = ?";
    String delete = "DELETE FROM NHANVIEN WHERE MANV = ?";
    String selectAll = "SELECT *FROM NHANVIEN";
    String selectbyId = "SELECT *FROM NHANVIEN WHERE MANV = ?";
    
    @Override
    public void insert(Staff entity) {
        JDBCHelper.update(insert, entity.getManv(),entity.getMatkhau(),entity.getHoten(),entity.getVaitro() );
    }

    @Override
    public void update(Staff entity) {
        JDBCHelper.update(update,entity.getMatkhau(),entity.getHoten(),entity.getVaitro(),entity.getManv() );
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(delete, id);
    }

    @Override
    public Staff selectbyId(String id) {
        List<Staff> list = this.selectbySql(selectbyId, id);
        if(list.isEmpty()){
            return null;
        } 
        return list.get(0);
    }

    @Override
    public List<Staff> selectAll() {
        return this.selectbySql(selectAll);
    }

    @Override
    protected List<Staff> selectbySql(String sql, Object... args) {
        List<Staff> list = new ArrayList<Staff>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while(rs.next()) {
                Staff nv = new Staff();
                nv.setManv(rs.getString("MANV"));
                nv.setHoten(rs.getString("HOTEN"));
                nv.setMatkhau(rs.getString("MATKHAU"));
                nv.setVaitro(rs.getBoolean("VAITRO"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
