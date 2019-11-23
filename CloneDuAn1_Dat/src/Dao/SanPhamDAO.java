/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Helper.JdbcHelper;
import Model.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class SanPhamDAO {
    public void insert(SanPham model){
        String sql="INSERT INTO SanPham (MaSp, TenSp, SoLuong, DonGia, MADM, NgayNhap, NhaCC, MoTa) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaSP(),
                model.getTenSP(),
                model.getSoLuong(),
                model.getDonGia(),
                model.getMaDM(),
                model.getNgayNhap(),
                model.getNhaCC(),
                model.getMoTa());
    } 
    
    public void update(SanPham model){
        String sql="UPDATE SanPham SET TenSp=?, SoLuong=?, DonGia=?, MADM=?, NgayNhap=?, NhaCC=? MoTa=?WHERE MaSp=?";
        JdbcHelper.executeUpdate(sql,
                model.getTenSP(),
                model.getSoLuong(),
                model.getDonGia(),
                model.getMaDM(),
                model.getNgayNhap(),
                model.getNhaCC(),
                model.getMoTa(),
                model.getMaSP());
    }
    
     public void delete(String id){
         String sql="DELETE FROM SanPham WHERE MaSp=?";
         JdbcHelper.executeUpdate(sql, id);
     }
     public List<SanPham> select(){
         String sql="SELECT * FROM SanPham";
         return select(sql);
     }
     public List<SanPham> selectByKeyword(String keyword){
         String sql="SELECT * FROM SanPham WHERE TenSp LIKE ?";
         return select(sql, "%"+keyword+"%");
     }
     
      public SanPham findById(String manh){
          String sql="SELECT * FROM SanPham WHERE MaSp=?";
          List<SanPham> list = select(sql, manh);
          return list.size() > 0 ? list.get(0) : null;
      }
      private List<SanPham> select(String sql, Object...args){
          List<SanPham> list=new ArrayList<>();
          try {
              ResultSet rs = null;
              try {
                  rs = JdbcHelper.executeQuery(sql, args);
                  while(rs.next()){
                      SanPham model=readFromResultSet(rs);
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
      private SanPham readFromResultSet(ResultSet rs) throws SQLException{
          SanPham model=new SanPham();
          model.setMaSP(rs.getString("MaSP"));
          model.setTenSP(rs.getString("TenSp"));
          model.setSoLuong(rs.getInt("SoLuong"));
          model.setDonGia(rs.getInt("DonGia"));
          model.setMaDM(rs.getString("MADM"));
          model.setNgayNhap(rs.getDate("NgayNhap"));
          model.setNhaCC(rs.getString("NhaCC"));
          return model;
      }
}
