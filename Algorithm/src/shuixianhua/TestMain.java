package shuixianhua;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name TestMain
 * @description:打印出所有的 "水仙花数 "，
 * 所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花
 * 数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 * @date 2018/6/3
 */
public class TestMain {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            //百分位
            int m = i / 100;
            //十分位
            int n = i % 100 / 10;
            //末位
            int j = i % 100 % 10;

            int s1 = m * m * m + n * n * n + j * j * j;
            int s2 = m * 100 + n * 10 + j;
            if (s1 == s2) {
                System.out.println(i);
            }
        }

    }
}

