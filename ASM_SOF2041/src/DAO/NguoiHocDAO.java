
package DAO;

import Entity.Learner;
import java.util.List;
import JDBCHelper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Truc
 */
public class NguoiHocDAO extends EduSysDAO<Learner, String>{

    String insert = "INSERT INTO NGUOIHOC(MANH,HOTEN,GIOITINH,NGAYSINH,EMAIL,DIENTHOAI,GHICHU,MANV,NGAYDK) VALUES(?,?,?,?,?,?,?,?,?)";
    String update = "UPDATE NGUOIHOC SET HOTEN = ?,GIOITINH=?,NGAYSINH=?,EMAIL=?,DIENTHOAI=?,GHICHU=?,NGAYDK = ? WHERE MANH = ? AND MANV = ?";
    String delete = "DELETE FROM NGUOIHOC WHERE MANH = ? AND MANV = ?";
    String selectAll = "SELECT *FROM NGUOIHOC";
    String selectbyId = "SELECT *FROM NGUOIHOC WHERE MANH = ?";    
    
    
    @Override
    public void insert(Learner entity) {
       JDBCHelper.update(insert,entity.getManh(),entity.getHoten(),entity.getGioitinh(),entity.getNgaysinh(),entity.getEmail(),entity.getDienthoai(),
               entity.getGhichu(),entity.getManv(),entity.getNgaydangky());
    }

    @Override
    public void update(Learner entity) {
        JDBCHelper.update(update, entity.getHoten(),entity.getGioitinh(),entity.getNgaysinh(),entity.getEmail(),entity.getDienthoai(),entity.getGhichu(),
                entity.getNgaydangky(),entity.getManh(),entity.getManv());    }

    @Override
    public void delete(String id) {
       JDBCHelper.update(delete, id);
    }

    @Override
    public Learner selectbyId(String id) {
        List<Learner> list = this.selectbySql(selectbyId, id);
        if(list.isEmpty()){
            return null;
        } 
        return list.get(0);
    }

    @Override
    public List<Learner> selectAll() {
         return this.selectbySql(selectAll);
    }

    @Override
    protected List<Learner> selectbySql(String sql, Object... args) {
            List<Learner> list = new ArrayList<Learner>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while(rs.next()) {
                Learner ln = new Learner();
                ln.setDienthoai(rs.getString("DIENTHOAI"));
                ln.setEmail(rs.getString("EMAIL"));
                ln.setGhichu(rs.getString("GHICHU"));
                ln.setGioitinh(rs.getBoolean("GIOITINH"));
                ln.setHoten(rs.getString("HOTEN"));
                ln.setManh(rs.getString("MANH"));
                ln.setManv(rs.getString("MANV"));
                ln.setNgaydangky(rs.getString("NGAYDK"));
                ln.setNgaysinh(rs.getString("NGAYSINH"));
                list.add(ln);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}