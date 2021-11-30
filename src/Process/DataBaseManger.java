/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import javax.sql.*;
import DataBase.DBConnection;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hieu Bom IT
 */
public class DataBaseManger {

    public static boolean themLopHoc(String msLop, String tenLop, String giaovienCN) {

        DBConnection dbCon = new DBConnection();
        String sql = "Insert sinhvien value('" + msLop + "','" + tenLop + "','" + giaovienCN + "')";
        return dbCon.updateData(sql);

    }

    public static boolean suaLopHoc(String msLop, String tenLop, String giaovienCN) {
        DBConnection dbCon = new DBConnection();
        String sql = "Update sinhvien set tenLop='" + tenLop + "',giaovienCN='" + giaovienCN + "' where maLop='" + msLop + "' ";
        return dbCon.updateData(sql);
    }

    public static boolean xoaLopHoc(String msLop) {
        DBConnection dbCon = new DBConnection();
        String sql = "Delete From sinhvien where maLop='" + msLop + "'";
        return dbCon.updateData(sql);

    }
    public static  ResultSet ABC()
    {
        DBConnection dbCon = new DBConnection();
        String sql = "Select * From sinhvien"+" order by maLop DESC ";
        return dbCon.getData(sql);
    }

    public static boolean LopHocToTable(JTable jTable) {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
            DBConnection dbCon = new DBConnection();
            ResultSet rs = dbCon.getData("Select* from sinhvien");
            String[] row = new String[3];
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);

            }
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
//    public static boolean ThemSinhVien(String msSV,String hoTen ,String email,String diaChi ,String msLop )
//    {
//        String sql ="Insert Into SinhVien value('" + msSV +"','" + hoTen+"','" + email +"','" + diaChi +"','" + msLop +"')";
//        DBConnection dbCon = new DBConnection();
//        return dbCon.updateData(sql);
//        
//    }
//    public static boolean SuaSinhVien(String msSV,String hoTen ,String email,String diaChi ,String msLop )
//    {
//        String sql="Update SinhVien set hoten='" + hoTen +"', email='" + email +"', diachi='"  + diaChi+ "',mslop='" + msLop +"')";
//        DBConnection dbCon = new DBConnection();
//        return dbCon.updateData(sql);
//    }
//    public static boolean XoaSinhVien(String msSV)
//    {
//         String sql ="Delete From SinhVien where msSV='" + msSV +"')";
//         DBConnection dbCon = new DBConnection();
//         return dbCon.updateData(sql);
//                
//    }
//    public static boolean SinhVienToTable(JTable jTable)
//  
//    {
//        try {
//            DefaultTableModel tableModel = (DefaultTableModel)jTable.getModel();
//            DBConnection dbCon = new DBConnection();
//            ResultSet rs = dbCon.getData("Select* from SinhVien");
//            String[] row =new String[3];
//            while (rs.next()) {
//                row[0]=rs.getString(1);
//                row[1]=rs.getString(2);
//                row[2]=rs.getString(3);
//                
//            } 
//            return true;
//            
//                
//            }
//         catch (Exception e) {
//             e.printStackTrace();
//             return false;
//        }
//    }

}
