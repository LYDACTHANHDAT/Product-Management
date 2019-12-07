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

/**
 *
 * @author asus
 */
public class ThongKeDAO {
    public List<Object[]> getDoanhThuYear(int nam) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_ThongKeDoanhThuYear (?)}";
                rs = JdbcHelper.executeQuery(sql, nam);
                while (rs.next()) {
                    Object[] model = {
                        rs.getInt("Nam"), 
                        rs.getInt("SoLuong"), 
                        rs.getDouble("TrungBinh"), 
                        rs.getDouble("DauTien"), 
                        rs.getDouble("CuoiCung")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
//    public List<Object[]> getHoaDon1() {
//        List<Object[]> list = new ArrayList<>();
//        try {
//            ResultSet rs = null;
//            try {
//                String sql = "{call sp_ThongKeHoaDon2}";
//                rs = JdbcHelper.executeQuery(sql);
//                while (rs.next()) {
//                    Object[] model = {
//                        rs.getInt("Nam"), 
//                        rs.getInt("SoLuong"), 
//                        rs.getDouble("TrungBinh"), 
//                        rs.getDouble("DauTien"), 
//                        rs.getDouble("CuoiCung")
//                    };
//                    list.add(model);
//                }
//            } finally {
//                rs.getStatement().getConnection().close();
//            }
//        } catch (SQLException ex) {
//            throw new RuntimeException(ex);
//        }
//        return list;
//    }
//    public List<Object[]> getHoaDon1(int nam) {
//        List<Object[]> list = new ArrayList<>();
//        try {
//            ResultSet rs = null;
//            try {
//                String sql = "{call sp_ThongKeHoaDon2 (?)}";
//                rs = JdbcHelper.executeQuery(sql, nam);
//                while (rs.next()) {
//                    Object[] model = {
//                        rs.getInt("Nam"), 
//                        rs.getInt("SoLuong"), 
//                        rs.getDouble("TrungBinh"), 
//                        rs.getDouble("DauTien"), 
//                        rs.getDouble("CuoiCung")
//                    };
//                    list.add(model);
//                }
//            } finally {
//                rs.getStatement().getConnection().close();
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return list;
//    }
    public List<Object[]> getDoanhThu(int nam) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_ThongKeDoanhThu (?)}";
                rs = JdbcHelper.executeQuery(sql, nam);
                while (rs.next()) {
                    Object[] model = {
                        rs.getInt("Nam"), 
                        rs.getInt("SoLuong"), 
                        rs.getDouble("TrungBinh"), 
                        rs.getDouble("DauTien"), 
                        rs.getDouble("CuoiCung")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public List<Object[]> getDoanhThuDay(int nam) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_ThongKeDoanhThuDay (?)}";
                rs = JdbcHelper.executeQuery(sql, nam);
                while (rs.next()) {
                    Object[] model = {
                        rs.getInt("HoaDon"), 
                        rs.getInt("SoLuong"), 
                        rs.getDouble("TrungBinh"), 
                        rs.getDouble("DauTien"), 
                        rs.getDouble("CuoiCung")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
