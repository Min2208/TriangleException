public class CheckTriangle {
    public static void checkTriangle(double a,double b, double c)throws IllegalTriangleException{
        if (a<=0||b<=0||c<=0||a>b+c||b>a+c||c>a+b){
            throw new IllegalTriangleException(a+" , "+b+" , "+c+" is not triangle");
        }

    }
}
