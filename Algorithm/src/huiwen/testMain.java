package huiwen;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name testMain
 * @description://评测题目: 在30分钟内,用java语言写一段程序,
                //从一段字符串中,把所有长度大于8的回文子串打印出来,
                //回文串指正向或反向读都一样(例如ABA,1221).
                //如能使用时间复杂度更优的算法则有加分    34554343345345
 * @date 2018/6/3
 */
public class testMain {

    public static void main(String[] args) {
        testMain t = new testMain();
      /*boolean f= t.isPalindrome2("12344321");
        if(f==true){
            System.out.println("是回文");
        }else{
            System.out.println("不是回文");
        }*/


        System.out.println(t.maxPalindrome2("google"));

    }


    /**
     * 判断是否为回文1
     *
     * @param str
     * @return
     */
    public boolean isPalindrome1(String str) {

        boolean flag = true;

        //两个变量，一左一右，判断首位是否相等
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                flag = false;
                break;
            }
        }
        return flag;

    }

    /**
     * 判断字符串是否为回文2
     * @param str
     * @return
     */
    public boolean isPalindrome2(String str) {
        boolean flag = true;
        //将字符串反转，判断是否相等
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newStr = newStr + str.charAt(i);
        }

        if (newStr.equals(str)) {
            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }


    /**
     * 获取字符串中最长的回文
     * @param str
     * @return
     */
    public String maxPalindrome2(String str){

        String newPalindrome="";

        int max=0;

        for(int i=0;i<str.length();i++){
            for(int j=str.length()-1;j>i;j--){
                String s = str.substring(i,j);
                //判断当前截取的字符串是否为回文，是则返回
                if(isPalindrome2(s)&&(j-i+1)>max){
                    max=j-i+1;
                    newPalindrome = s;
                }
            }
        }

        return newPalindrome;
    }


}
