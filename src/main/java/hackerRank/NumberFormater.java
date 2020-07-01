package hackerRank;

import java.text.DecimalFormat;

public class NumberFormater {
    public static void myFormatedNumber() {
        double n1 = 67.895;
        float f = 678.567f;
        DecimalFormat df = new DecimalFormat("#.####");
        String formatted = df.format(2.456345);
        String formattedd = df.format(n1);
        String formattedf = df.format(f);
        System.out.println( String.valueOf(formattedd));
        System.out.println(formattedf);

    }

    public static void main(String[] args) {
        myFormatedNumber();
    }
}
