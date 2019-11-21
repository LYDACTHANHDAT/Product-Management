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
import model.HoaDon;

/**
 *
 * @author ASUS
 */
public class HoaDonDAO {
    public void insert(HoaDon model) {
        String sql = "INSERT INTO HoaDon (MaHD, MaNV, NgayLapHD, DonGia, TongTien, GhiChu) VALUES (?, ?, ?, ?, ?, ?)";
    
    JdbcHelper.executeUpdate (sql , model.getMaHD(),model.getMaNV(),model.getNgayLap(),model.getDonGia(),model.getTongTien(),model.getGhiChu());
    }
    public void update(HoaDon model){
        String sql="UPDATE HoaDon SET MaNV=?, NgayLapHD=?, DonGia=?, TongTien=?, GhiChu=? WHERE MaHD=?";
        JdbcHelper.executeUpdate(sql, model.getMaNV(),model.getNgayLap(),model.getDonGia(),model.getTongTien(),model.getGhiChu(),model.getMaHD()); 
  }
    public void delete(String MaNV){
        String sql="DELETE FROM HoaDon WHERE MaHD=?";
        JdbcHelper.executeUpdate(sql, MaNV);
}          
    public List<HoaDon> select(){ 
        String sql="SELECT * FROM HoaDon";
        return select(sql);
}
    public HoaDon findById(String manv){
        String sql="SELECT * FROM HoaDon WHERE MaHD=?";
        List<HoaDon> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
}
    private List<HoaDon> select(String sql, Object...args){
        List<HoaDon> list=new ArrayList<>();
        try {
            ResultSet rs = null; 
        try {                
            rs = JdbcHelper.executeQuery(sql, args); 
        while(rs.next()){                  
            HoaDon model=readFromResultSet(rs);
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
    private HoaDon readFromResultSet(ResultSet rs) throws SQLException{
        HoaDon model=new HoaDon();
        model.setMaHD(rs.getString("MaHD")); 
        model.setMaNV(rs.getString("MaNV"));  
        model.setNgayLap(rs.getDate("NgayLapHD"));
        model.setDonGia(rs.getInt("DonGia")); 
        model.setTongTien(rs.getDouble("TongTien")); 
        model.setGhiChu(rs.getString("GhiChu")); 
        return model;
} 
}
