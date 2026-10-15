import java.util.Date;

public class Date_Time{
    public static void main(String args[]){
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        Date d = new Date();
        System.out.println(d);  //Sun Oct 11 15:45:45 IST 2026

        System.out.println(d.getTime());  //1707522345000
        System.out.println(d.getDate());  //11
        System.out.println(d.getDay());  //0
        System.out.println(d.getYear());  //126
    }
}