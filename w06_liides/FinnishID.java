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
            System.out.println("1900!");
        } else if (century.equals("A")) {
            year = "20" + year;
        }
        int fullYear = Integer.parseInt(year);
        return fullYear;
    }

    @Override
    public int getMonth() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getDay() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getDOB() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getAge() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
