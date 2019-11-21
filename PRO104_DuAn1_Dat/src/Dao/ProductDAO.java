/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import model.Product;
import Helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class ProductDAO {
    public void insert(Product model){
        String sql="INSERT INTO SanPham (MaSp, TenSp, SoLuong, DonGia, MADM, NgayNhap, NhaCC) VALUES (?, ?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaSP(),
                model.getTenSP(),
                model.getSoLuong(),
                model.getDonGia(),
                model.getMaDM(),
                model.getNgayNhap(),
                model.getNhaCC());
    } 
    
    public void update(Product model){
        String sql="UPDATE SanPham SET TenSp=?, SoLuong=?, DonGia=?, MADM=?, NgayNhap=?, NhaCC=? WHERE MaSp=?";
        JdbcHelper.executeUpdate(sql,
                model.getTenSP(),
                model.getSoLuong(),
                model.getDonGia(),
                model.getMaDM(),
                model.getNgayNhap(),
                model.getNhaCC(),
                model.getMaSP());
    }
    
     public void delete(String id){
         String sql="DELETE FROM SanPham WHERE MaSp=?";
         JdbcHelper.executeUpdate(sql, id);
     }
     public List<Product> select(){
         String sql="SELECT * FROM SanPham";
         return select(sql);
     }
     public List<Product> selectByKeyword(String keyword){
         String sql="SELECT * FROM SanPham WHERE TenSp LIKE ?";
         return select(sql, "%"+keyword+"%");
     }
     
      public Product findById(String manh){
          String sql="SELECT * FROM SanPham WHERE MaSp=?";
          List<Product> list = select(sql, manh);
          return list.size() > 0 ? list.get(0) : null;
      }
      private List<Product> select(String sql, Object...args){
          List<Product> list=new ArrayList<>();
          try {
              ResultSet rs = null;
              try {
                  rs = JdbcHelper.executeQuery(sql, args);
                  while(rs.next()){
                      Product model=readFromResultSet(rs);
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
      private Product readFromResultSet(ResultSet rs) throws SQLException{
          Product model=new Product();
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
