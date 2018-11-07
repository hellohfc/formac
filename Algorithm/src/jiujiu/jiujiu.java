package jiujiu;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name jiujiu
 * @description:九九乘法表
 * @date 2018/6/3
 */
public class jiujiu {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int s = i * j;
                System.out.println(i + "*" + j + "=" + s + "\t");
            }

            System.out.println();
        }
    }
}

