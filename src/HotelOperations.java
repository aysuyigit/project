
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPSize;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruşan Oğuz
 */
public class HotelOperations {
    private Connection con=null;
    private Statement stat=null;
    private PreparedStatement preStat=null;
    
   /* public int emptyRoom(String roomType,String enDay,String enMonth,String exDay,String exMonth){
        boolean room = false;
        int totalday;
        try {
            stat=con.createStatement();
            String query;
            
            
                if(roomType=="Ekonomik Oda"){
                    if(new Integer(enMonth)==new Integer(exMonth)){
                totalday=(new Integer(exDay))-(new Integer(enDay))+1;
                int roomno=0;
                String day=enDay+"-"+enMonth+"-2019";
                    query="Select 101,102,103,104,105 FROM oda";
                    ResultSet rs = stat.executeQuery(query);
                    for (int eko=1;eko<6;eko++){
                        while(rs.next()){
                            String ekors=rs.getString(eko);
                            for(int i=1;i<=totalday;i++){
                                if(ekors==day){
                                    return 101;
                                }
                                else{
                                    roomno=100+i;
                                }
                                day=(new Integer(enDay)+i)+"-"+enMonth+"-2019";
                            }
                    
                    }
                }
            
                return roomno;
            }
                    else{
                        totalday=(new Integer(exDay)+30)-(new Integer(enDay))+1;
                        int roomno=0;
                        String day=enDay+"-"+enMonth+"-2019";
                        query="Select 101,102,103,104,105 FROM oda";
                        ResultSet rs = stat.executeQuery(query);
                        for (int eko=1;eko<6;eko++){
                        while(rs.next()){
                            String ekors=rs.getString(eko);
                            for(int i=1;i<=totalday;i++){
                                if(ekors==day){
                                    return 0;
                                }
                                else{
                                    roomno=100+i;
                                }
                                if((new Integer(exMonth))==8 && (new Integer(enDay))>31){
                                day=(new Integer(enDay)-31)+"-"+(new Integer(exMonth))+"-2019";
                        
                                }
                                else if((new Integer(exMonth))==7 && (new Integer(enDay))>30){
                                day=(new Integer(enDay)-30)+"-"+(new Integer(exMonth))+"-2019";
                                }
                                else{
                                day=(new Integer(enDay)+i)+"-"+enMonth+"-2019";
                                }
                            }
                    
                    }
                }
            
                return roomno;
                        
                    }
        }
        else if(roomType=="Standart Oda"){
                    if(new Integer(enMonth)==new Integer(exMonth)){
                totalday=(new Integer(exDay))-(new Integer(enDay))+1;
                int roomno=0;
                String day=enDay+"-"+enMonth+"-2019";
                    query="Select 201,202,203,204,205,206,207,208,209,210 FROM oda";
                    ResultSet rs = stat.executeQuery(query);
                    for (int stn=1;stn<11;stn++){
                        while(rs.next()){
                            String stnrs=rs.getString(stn);
                            for(int i=1;i<=totalday;i++){
                                if(stnrs==day){
                                    return 0;
                                }
                                else{
                                    roomno=200+i;
                                }
                                day=(new Integer(enDay)+i)+"-"+enMonth+"-2019";
                            }
                    
                    }
                }
            
                return roomno;
            }
                    else{
                        totalday=(new Integer(exDay)+30)-(new Integer(enDay))+1;
                        String day=enDay+"-"+enMonth+"-2019";
                        int roomno=0;
                        query="Select 201,202,203,204,205,206,207,208,209,210 FROM oda";
                        ResultSet rs = stat.executeQuery(query);
                        for (int stn=1;stn<11;stn++){
                        while(rs.next()){
                            String stnrs=rs.getString(stn);
                            for(int i=1;i<=totalday;i++){
                                if(stnrs==day){
                                    return 0;
                                }
                                else{
                                    roomno=200+i;
                                }
                                if((new Integer(exMonth))==8 && (new Integer(enDay))>31){
                                day=(new Integer(enDay)-31)+"-"+(new Integer(exMonth))+"-2019";
                        
                                }
                                else if((new Integer(exMonth))==7 && (new Integer(enDay))>30){
                                day=(new Integer(enDay)-30)+"-"+(new Integer(exMonth))+"-2019";
                                }
                                else{
                                day=(new Integer(enDay)+i)+"-"+enMonth+"-2019";
                                }
                            }
                    
                    }
                }
            
                return roomno;
                        
                    }
        }
        else if(roomType=="Balayı Suiti"){
                    if(new Integer(enMonth)==new Integer(exMonth)){
                totalday=(new Integer(exDay))-(new Integer(enDay))+1;
                int roomno = 0;
                String day=enDay+"-"+enMonth+"-2019";
                    query="Select 301,302,303,304 FROM oda";
                    ResultSet rs = stat.executeQuery(query);
                    for (int bsu=1;bsu<5;bsu++){
                        while(rs.next()){
                            String bsurs=rs.getString(bsu);
                            for(int i=1;i<=totalday;i++){
                                if(bsurs==day){
                                    return 0;
                                }
                                else{
                                    roomno=300+i;
                                }
                                day=(new Integer(enDay)+i)+"-"+enMonth+"-2019";
                            }
                    
                    }
                }
            
               return roomno; 
            }
                    else{
                        totalday=(new Integer(exDay)+30)-(new Integer(enDay))+1;
                        String day=enDay+"-"+enMonth+"-2019";
                        int roomno=0;
                        query="Select 301,302,303,304 FROM oda";
                        ResultSet rs = stat.executeQuery(query);
                        for (int bsu=1;bsu<5;bsu++){
                        while(rs.next()){
                            String bsurs=rs.getString(bsu);
                            for(int i=1;i<=totalday;i++){
                                if(bsurs==day){
                                    return 0;
                                }
                                else{
                                     roomno=300+i;
                                }
                                if((new Integer(exMonth))==8 && (new Integer(enDay))>31){
                                day=(new Integer(enDay)-31)+"-"+(new Integer(exMonth))+"-2019";
                        
                                }
                                else if((new Integer(exMonth))==7 && (new Integer(enDay))>30){
                                day=(new Integer(enDay)-30)+"-"+(new Integer(exMonth))+"-2019";
                                }
                                else{
                                day=(new Integer(enDay)+i)+"-"+enMonth+"-2019";
                                }
                            }
                    
                    }
                }
            
                
                        return roomno;
                    }
                    
                    
        }
        else{
                    if(new Integer(enMonth)==new Integer(exMonth)){
                totalday=(new Integer(exDay))-(new Integer(enDay))+1;
                String day=enDay+"-"+enMonth+"-2019";
                    query="Select RubyKing FROM oda";
                    ResultSet rs = stat.executeQuery(query);
                    for (int ruk=1;ruk<2;ruk++){
                        while(rs.next()){
                            String rukrs=rs.getString(ruk);
                            for(int i=1;i<=totalday;i++){
                                if(rukrs==day){
                                    return 0;
                                }
                                day=(new Integer(enDay)+i)+"-"+enMonth+"-2019";
                            }
                    
                    }
                }
            
                
            }
                    else{
                        totalday=(new Integer(exDay)+30)-(new Integer(enDay))+1;
                        String day=enDay+"-"+enMonth+"-2019";
                        query="Select RubyKing FROM oda";
                        ResultSet rs = stat.executeQuery(query);
                        for (int ruk=1;ruk<2;ruk++){
                        while(rs.next()){
                            String rukrs=rs.getString(ruk);
                            for(int i=1;i<=totalday;i++){
                                if(rukrs==day){
                                    return 0;
                                }
                                if((new Integer(exMonth))==8 && (new Integer(enDay))>31){
                                day=(new Integer(enDay)-31)+"-"+(new Integer(exMonth))+"-2019";
                        
                                }
                                else if((new Integer(exMonth))==7 && (new Integer(enDay))>30){
                                day=(new Integer(enDay)-30)+"-"+(new Integer(exMonth))+"-2019";
                                }
                                else{
                                day=(new Integer(enDay)+i)+"-"+enMonth+"-2019";
                                }
                            }
                    
                    }
                        
                }
            
                
                        
                    }
                    return 1;
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(HotelOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return 0;
    }*/
    
   /* public void roomDate(String roomnumber,String enDay,String enMonth,String exDay,String exMonth){
        int totalday;
        String quary;
        if(new Integer(enMonth)==new Integer(exMonth)){
            totalday=(new Integer(exDay))-(new Integer(enDay))+1;
            String day=enDay+"-"+enMonth+"-2019";
            quary="Insert Into oda ("+roomnumber+") VALUES("+day+")";
            for(int i=1;i<=totalday;i++){
                try {
                    preStat=con.prepareStatement(quary);
                  //preStat.setString(1, day);
                    preStat.executeUpdate();
                    day=(new Integer(enDay)+i)+"-"+enMonth+"-2019";
                } catch (SQLException ex) {
                    Logger.getLogger(HotelOperations.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }
        else{
            totalday=(new Integer(exDay)+30)-(new Integer(enDay))+1;
            String day=enDay+"-"+enMonth+"-2019";
            quary="Insert Into oda ("+roomnumber+") VALUES("+day+")";
            for(int i=1;i<=totalday;i++){
                try {
                    preStat=con.prepareStatement(quary);
                  //preStat.setString(1, day);
                    preStat.executeUpdate();
                    if((new Integer(exMonth))==8 && (new Integer(enDay))>31){
                        day=(new Integer(enDay)-31)+"-"+(new Integer(exMonth))+"-2019";
                        
                    }
                    else if((new Integer(exMonth))==7 && (new Integer(enDay))>30){
                        day=(new Integer(enDay)-30)+"-"+(new Integer(exMonth))+"-2019";
                }
                    else{
                        day=(new Integer(enDay)+i)+"-"+enMonth+"-2019";
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(HotelOperations.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        
        }
    }*/
    
    
    public void addCustomer(String name,String surname,int age,String id,String phone,int memnumber,String roomnumber,String entrydate,String exitdate,int price){
        
        String quary="Insert Into müşteri (ad,soyad,yas,TC,tel,kisisayisi,odano,giris,cıkıs,ucret) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            preStat=con.prepareStatement(quary);
            preStat.setString(1, name);
            preStat.setString(2, surname);
            preStat.setInt(3, age);
            preStat.setString(4, id);
            preStat.setString(5, phone);
            preStat.setInt(6, memnumber);
            preStat.setString(7, roomnumber);
            preStat.setString(8, entrydate);
            preStat.setString(9, exitdate);
            preStat.setInt(10, price);
            preStat.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(HotelOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<Customer> bringCustomers(){
        
        ArrayList<Customer> output = new ArrayList<Customer>();
        try {
            stat=con.createStatement();
            String query="Select * From müşteri";
            ResultSet rs = stat.executeQuery(query);
            while(rs.next()){
                String name=rs.getString("ad");
                String surname=rs.getString("soyad");
                int age=rs.getInt("yas");
                String id=rs.getString("TC");
                String phone=rs.getString("tel");
                int memnumber=rs.getInt("kisisayisi");
                String rooumnumber=rs.getString("odano");
                String entrydate=rs.getString("giris");
                String exitdate=rs.getString("cıkıs");
                int price=rs.getInt("ucret");
               
               output.add(new Customer(name, surname, age, id, phone, memnumber, rooumnumber, entrydate, exitdate, price));
                
            }
            return output;
        } catch (SQLException ex) {
            Logger.getLogger(HotelOperations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }

    public HotelOperations() {
        
        String url="jdbc:mysql://"+Database.host+":"+Database.port+"/"+Database.db+"?useUnicode=true&characterEncoding=utf8";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı");
        }
        try {
            con= DriverManager.getConnection(url, Database.kullanıcı, Database.parola);
            System.out.println("Bağlantı Başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız");
        }
        
    }
    
    public static void main(String[] args) {
        HotelOperations ops =new HotelOperations();
    }
    
    
    
}
