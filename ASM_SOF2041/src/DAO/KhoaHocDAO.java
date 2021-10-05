package DAO;

import Entity.Course;
import java.util.List;
import JDBCHelper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Truc
 */
public class KhoaHocDAO extends EduSysDAO<Course, String> {

    String insert = "INSERT INTO KHOAHOC(MACD,HOCPHI,THOILUONG,NGAYKG,GHICHU,MANV,NGAYTAO) VALUES(?,?,?,?,?,?,?)";
    String update = "UPDATE KHOAHOC SET MACD = ? , HOCPHI = ? , THOILUONG = ?, NGAYKG = ?, GHICHU = ?, MANV = ? ,NGAYTAO = ? WHERE MAKH = ?";
    String delete = "DELETE FROM KHOAHOC WHERE MAKH = ?";
    String selectAll = "SELECT *FROM KHOAHOC";
    String selectbyId = "SELECT *FROM KHOAHOC WHERE MAKH = ?";

    @Override
    public void insert(Course entity) {
        JDBCHelper.update(insert, entity.getMacd(), entity.getHocphi(), entity.getThoiluong(), entity.getNgaykhaigiang(), entity.getGhichu(),
                 entity.getManv(), entity.getNgaytao());
    }

    @Override
    public void update(Course entity) {
        JDBCHelper.update(update, entity.getMacd(), entity.getHocphi(), entity.getThoiluong(), entity.getNgaykhaigiang(), entity.getGhichu(),
                entity.getManv(), entity.getNgaytao(), entity.getMakh());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(delete, id);
    }

    @Override
    public Course selectbyId(String id) {
        List<Course> list = this.selectbySql(selectbyId, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Course> selectAll() {
        return this.selectbySql(selectAll);
    }

    @Override
    protected List<Course> selectbySql(String sql, Object... args) {
        List<Course> list = new ArrayList<Course>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Course kh = new Course();
                kh.setMakh(rs.getInt("MAKH"));
                kh.setMacd(rs.getString("MACD"));
                kh.setHocphi(rs.getFloat("HOCPHI"));
                kh.setThoiluong(rs.getInt("THOILUONG"));
                kh.setNgaykhaigiang(rs.getString("NGAYKG"));
                kh.setGhichu(rs.getString("GHICHU"));
                kh.setManv(rs.getString("MANV"));
                kh.setNgaytao(rs.getString("NGAYTAO"));
                list.add(kh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Course> selectbyChuyende(String macd) {
        String sql = "SELECT *FROM KHOAHOC WHERE MACD = ?";
        return this.selectbySql(sql, macd);
    }
}
