/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ChiTietHD;

/**
 *
 * @author ASUS
 */
public class HoaDonCTDAO {
  public void insert(ChiTietHD model) {
        String sql = "INSERT INTO ChiTietHoaDon (MaHD, MaSP, TenSP, DonGia, SoLuong, TongTien, GhiChu) VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    JdbcHelper.executeUpdate (sql , model.getMaHD(),model.getMaSP(),model.getTenSP(),model.getDonGia(),model.getSoLuong(),model.getTongTien(),model.getGhiChu());
    }
  public void delete(String MaHD){
        String sql="DELETE FROM ChiTietHoaDon WHERE MaHD=?";
        JdbcHelper.executeUpdate (sql, MaHD);
}
        public List<ChiTietHD> select(){ 
        String sql="SELECT * FROM ChiTietHoaDon";
        return select(sql);
        }
    public List<ChiTietHD> selectByKeyword(String keyword){
         String sql="SELECT * FROM ChiTietHoaDon WHERE MaHD LIKE ?";
         return select(sql, keyword);
}
    public ChiTietHD findById(String maHD){
        String sql="SELECT * FROM ChiTietHoaDon WHERE MaHD=?";
        List<ChiTietHD> list = select(sql, maHD);
        return list.size() > 0 ? list.get(0) : null;
}
    private List<ChiTietHD> select(String sql, Object...args){
        List<ChiTietHD> list=new ArrayList<>();
        try {
            ResultSet rs = null; 
        try {                
            rs = JdbcHelper.executeQuery(sql, args); 
        while(rs.next()){                  
            ChiTietHD model=readFromResultSet(rs);
            list.add(model);         
}       
}      
        finally{   
            rs.getStatement().getConnection().close();   
}     
        }catch (SQLException ex) { 
        throw new RuntimeException(ex);
}         
        return list;
}    
    private ChiTietHD readFromResultSet(ResultSet rs) throws SQLException{
        ChiTietHD model=new ChiTietHD();
        model.setMaHD(rs.getInt("MaHD")); 
        model.setMaSP(rs.getString("MaSP"));  
        model.setTenSP(rs.getString("TenSP"));
        model.setDonGia(rs.getInt("DonGia")); 
        model.setSoLuong(rs.getInt("SoLuong"));
        model.setTongTien(rs.getDouble("TongTien"));
        model.setGhiChu(rs.getString("GhiChu")); 
        return model;
}   
}
