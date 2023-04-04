import java.util.Date;
import java.util.*;
import java.text.*;

public class DateDemo {
   public static void main(String[] args) {
       // 初始化 Date 对象
       Date date1 = new Date();
        
       // 使用 toString() 函数显示日期时间
       System.out.println(date1.toString());


      Date dNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");

      System.out.println("当前时间为: " + ft.format(dNow));


      Date date = new Date();
      System.out.printf("%tY-%tm-%td %tH:%tM:%tS %tZ", date, date, date, date, date, date, date);

      System.out.println();
   }
}
