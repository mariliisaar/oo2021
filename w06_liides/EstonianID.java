import java.time.LocalDate;
import java.time.Period;

public class EstonianID implements PersonalCodeBehaviour {
    private String code;
    public EstonianID(String code) {
        this.code = code;
    }

    @Override
    public String getGender() {
        int first = Character.getNumericValue(code.toCharArray()[0]);
        // if (first % 2 == 0) {
        //     return "Female";
        // } else{
        //     return "Male";
        // }

        return first % 2 == 0 ? "Female" : "Male";
    }

    @Override
    public int getFullYear() {
        // String year = code.substring(1, 3);
        // int first = Character.getNumericValue(code.toCharArray()[0]);
        // if (first == 1 || first == 2) {
        //     year = "18" + year;
        // } else if (first == 3 || first == 4) {
        //     year = "19" + year;
        // } else if (first == 5 || first == 6) {
        //     year = "20" + year;
        // }
        // int fullYear = Integer.parseInt(year);
        // return fullYear;
        int year = 1800 + ((Integer.parseInt(code.substring(0,1)) + 1) / 2 - 1 ) * 100 + (Integer.parseInt(code.substring(1,3)));
        return year;
    }

    @Override
    public int getMonth() {
        return Integer.parseInt(code.substring(3, 5));
    }

    @Override
    public int getDay() {
        return Integer.parseInt(code.substring(5, 7));
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
