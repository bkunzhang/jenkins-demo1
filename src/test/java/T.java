import java.util.Arrays;

/**
 * @author bkunzh
 * @date 2022/11/16
 */
public class T {
    public static void main(String[] args) {
        String s = "abcd";
        String[] ss = s.split("  ");
        System.out.println(ss.length);
        System.out.println(Arrays.toString(ss));
    }

}
