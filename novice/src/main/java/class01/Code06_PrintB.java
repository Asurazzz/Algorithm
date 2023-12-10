package class01;

/**
 * 打印一个数的32进制
 * 每个数的底层都是32进制
 * @author yemingjie.
 * @date 2023/12/10.
 * @time 13:49.
 */
public class Code06_PrintB {

    public static void main(String[] args) {
        // int 32位   long 64位
        int num = 83928328;
        print(num);
    }

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0": "1");
        }
        System.out.println();

    }
}
