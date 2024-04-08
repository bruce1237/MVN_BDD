package hellocucumber;

import static org.junit.jupiter.api.Assertions.*;

public class MyDate{
    public String wDate;

    public void setDate(String inputDate){
        this.wDate = inputDate;
    }

    public String isFriday(){
        return "Friday".equals(this.wDate) ? "Y" : "N";
    }

    static String isSunday(String today){
        return "Sunday".equals(today) ? "YY" : "NN";
    }
    
}