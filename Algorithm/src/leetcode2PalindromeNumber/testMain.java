package leetcode2PalindromeNumber;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name testMain
 * @description：判断是否为回文 121true,-121false
 * @date 2018/6/4
 */
public class testMain {
    public static void main(String[] args) {
        testMain t = new testMain();
        System.out.println(t.isPalindrome(-121));

    }

    /**
     * 判断是否为回文
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        boolean flag = true;

        //将int转成string
        String a = String.valueOf(x);

        //String遍历反转
        String newa = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            newa = newa + a.charAt(i);
        }
        //判断与之前的值是否相等
        if (newa.equals(a)) {
            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }
}

