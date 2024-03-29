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
        String sql = "INSERT INTO HoaDon (MaHD, MaNV, NgayLapHD, TongTien, GhiChu) VALUES (?, ?, ?, ?, ?)";
    
    JdbcHelper.executeUpdate (sql , model.getMaHD(),model.getMaNV(),model.getNgayLap(),model.getTongTien(),model.getGhiChu());
    }
    public void delete(String MaHD){
        String sql="DELETE FROM HoaDon WHERE MaHD=?";
        JdbcHelper.executeUpdate(sql, MaHD);
}  
        public List<HoaDon> select(){ 
        String sql="SELECT * FROM HoaDon";
        return select(sql);
        }
    public List<HoaDon> selectByKeyword(String keyword){
         String sql="SELECT * FROM HoaDon WHERE MaHD LIKE ?";
         return select(sql, "%"+keyword+"%");
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
        HoaDon model= new HoaDon();
        model.setMaHD(rs.getInt("MaHD")); 
        model.setMaNV(rs.getString("MaNV"));  
        model.setNgayLap(rs.getDate("NgayLapHD"));
        model.setTongTien(rs.getDouble("TongTien")); 
        model.setGhiChu(rs.getString("GhiChu")); 
        return model;
} 
}
