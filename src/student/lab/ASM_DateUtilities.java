package student.lab;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
/**
 *
 * @author Aerius
 */
public class ASM_DateUtilities {
    
    // singleton instance
    private static ASM_DateUtilities instance;
    
    /**
     * singleton support
     * 
     * @return one instance of ASM_DateUtilites, preventing multiples
     */
    public static ASM_DateUtilities getInstance(){
        if (instance == null){
            instance = new ASM_DateUtilities();
        }
        return instance;
    }
    
    /**
     * current local time
     * 
     * @return the current system time
     */
    public LocalDateTime currentTime(){
        return LocalDateTime.now();
    }
    
    /**
     * format a LocalDateTime object into month/day/year
     * 
     * @param date
     * @return formatted string MM/dd/yyyy
     */
    public String commonDateFormat(LocalDateTime date){
        return date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));
    }
   
    /**
     * format a LocalDateTime object into year/month/day
     * 
     * @param date
     * @return formatted string yyyy/MM/dd
     */
    public String universalDateFormat(LocalDateTime date){
        return date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
    }
    
    /**
     * convert and format a String into a LocalDateTime object - Month/Day/Year
     * 
     * @param date the String you want to convert to LocalDateTime Object
     * @return formatted LocalDateTime object of the String parameter - MM/dd/yyyy
     */
    public LocalDateTime stringToObjectCommonDate(String date){
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        return LocalDateTime.parse(date, formatDate);
    }
    
    /**
     * convert and format a String into a LocalDateTime Object with a pattern of your choice
     * 
     * @param date the String you want to convert to LocalDateTime Object 
     * @param pattern the String pattern that you want your Object to be formatted as
     * @return formatted LocalDateTime object of the date parameter formatted as the pattern parameter
     */
    public LocalDateTime stringToObjectCustomDate(String date, String pattern){
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(date, formatDate);
    }
    
    
//    public long daysTillNextFriday(String currentDate){
//       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//       LocalDate date = LocalDate.parse(currentDate, formatter);
//       LocalDate nextFriday = date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
//       Duration diff = Duration.between(date, nextFriday);
//       return diff.toMillis();
//    }
    
    /**
     * outputs the numerical difference between two dates
     * 
     * @param dateOne
     * @param dateTwo
     * @return the difference between dateOne and dateTwo
     */
    public long dateDifference(LocalDateTime dateOne, LocalDateTime dateTwo){
        Duration difference = Duration.between(dateTwo, dateTwo);
        return difference.toDays();
    }
    
  
    
}
