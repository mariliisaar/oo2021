import java.time.LocalDate;
import java.time.Period;

public class FinnishID implements PersonalCodeBehaviour{
    private String code;

    public FinnishID(String code) {
        this.code = code;
    }

    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(7, 9));
        return gender % 2 == 0 ? "Female" : "Male";
    }

    @Override
    public int getFullYear() {
        String year = code.substring(4, 6);
        String century = code.substring(6, 7);
        if (century.equals("+")) {
            year = "18" + year;
        } else if (century.equals("-")) {
            year = "19" + year;
        } else if (century.equals("A")) {
            year = "20" + year;
        }
        int fullYear = Integer.parseInt(year);
        return fullYear;
    }

    @Override
    public int getMonth() {
        return Integer.parseInt(code.substring(2, 4));
    }

    @Override
    public int getDay() {
        return Integer.parseInt(code.substring(0, 2));
    }

    @Override
    public String getDOB() {
        String month = Integer.toString(getMonth());

        if (month.length() < 2) {
            month = "0" + month;
        }

        String dob = getDay() + "-" + month + "-" + getFullYear();
        return dob;
    }

    @Override
    public String getAge() {
        LocalDate date = LocalDate.of(getFullYear(), getMonth(), getDay());
        LocalDate now = LocalDate.now();
        String age = Integer.toString(Period.between(date, now).getYears());
        return age;
    }
    
}
