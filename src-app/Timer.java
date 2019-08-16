import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

class Timer {

  public static void main(String[] args) throws InterruptedException {

    DateTimeFormatter dtf;
    LocalDateTime now;

      while(true){
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        now = LocalDateTime.now();  
        System.out.println(dtf.format(now));  
        TimeUnit.SECONDS.sleep(1);
      }
  }

}