public class Main {
    public static void main(String[] args) {
        EstonianID est = new EstonianID("48702240276");
        FinnishID fin = new FinnishID("230181-237J");

        System.out.println(est.getGender());
        System.out.println(est.getFullYear());
        System.out.println(est.getDOB());
        System.out.println(est.getAge());

        System.out.println(fin.getGender());
        System.out.println(est.getFullYear());
        // System.out.println(est.getDOB());
        // System.out.println(est.getAge());
    }
}
