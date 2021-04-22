public class IllegalTriangleException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = -1541487201668000294L;

    public IllegalTriangleException(double a, double b, double c) {
        super("Cannot make a triangle from the following lengths: " + a + ", " + b + ", " + c + ".");
    }
}
