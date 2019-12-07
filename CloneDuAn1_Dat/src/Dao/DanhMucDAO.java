
package Dao;

import Helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DanhMuc;

public class DanhMucDAO {
    public void insert(DanhMuc model){
        String sql="INSERT INTO SanPham (MaDM, TenDM) VALUES (?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaDM(),
                model.getTenDM());
    } 
    
    public void update(DanhMuc model){
        String sql="UPDATE SanPham SET TenDM=? WHERE MaDM=?";
        JdbcHelper.executeUpdate(sql,  
                model.getTenDM(),
                model.getMaDM());
    } 
    
     public void delete(String madm){
         String sql="DELETE FROM DanhMuc WHERE MaDM=?";
         JdbcHelper.executeUpdate(sql, madm);
     }
     public List<DanhMuc> select(){
         String sql="SELECT * FROM DanhMuc";
         return select(sql);
     }
    public List<DanhMuc> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM DanhMuc WHERE MaDM LIKE ?";
        return select(sql, "%" + keyword + "%");
     }
     
    public List<DanhMuc> selectByCourse(String madm) {
        String sql = "SELECT * FROM DanhMuc WHERE MADM  not IN (SELECT MADM FROM DanhMuc WHERE MADM like ?)";
        return select(sql, madm);
    }
     
      public DanhMuc findById(String madm){
          String sql="SELECT * FROM DanhMuc WHERE MaDM=?";
          List<DanhMuc> list = select(sql, madm);
          return list.size() > 0 ? list.get(0) : null;
      }
      private List<DanhMuc> select(String sql, Object...args){
          List<DanhMuc> list=new ArrayList<>();
          try {
              ResultSet rs = null;
              try {
                  rs = JdbcHelper.executeQuery(sql, args);
                  while(rs.next()){
                      DanhMuc model= readFromResultSet(rs);
                      list.add(model);
                  }
              }
              finally{ 
                    rs.getStatement().getConnection().close();
              }
          }          catch (SQLException ex) {
              throw new RuntimeException(ex);
          }         return list;
      }
      private DanhMuc readFromResultSet(ResultSet rs) throws SQLException{
          DanhMuc model= new DanhMuc();
          model.setMaDM(rs.getString("MADM"));
          model.setTenDM(rs.getString("TenSp"));
          return model;
      }
}
