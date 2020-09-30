import java.time.LocalDate;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2011);
    }
    static void printBonusDatesBetween(int fromYear, int toYear){
        if(fromYear > toYear ){
            int temp = fromYear;
            fromYear = toYear;
            toYear = temp;
        }
        LocalDate fromDate = LocalDate.of(fromYear, 1, 1);
        LocalDate toDate = LocalDate.of(toYear, 1, 1);
        System.out.println( fromDate.datesUntil(toDate).collect(Collectors.toList()));
    }
}
