import co.paralleluniverse.fibers.instrument.AutoSuspendablesScanner;

import java.net.URL;

/**
 * Created by eitan on 7/16/14.
 */
public class AutoSusp {
    public static void main(String[] args) {
        AutoSuspendablesScanner s =  new AutoSuspendablesScanner(ClassLoader.getSystemClassLoader());
        for (String s1 : s.getSuspendables()) {
            System.out.println(s1);
        }
        System.out.println("*****");
        for (String s1 : s.getSuperSuspendables()) {
            System.out.println(s1);
        }
        ;
    }
}
