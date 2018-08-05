package ReverseInteger;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name testMain
 * @description :数字反转 123-》321，-123-》-321，120-》21
 * @date 2018/6/4
 */
public class testMain {
    public static void main(String[] args){
        testMain t = new testMain();
        int a=t.reverse2(-2147483648);
        System.out.println(a);

    }


    /**
     * 反转数据的方法
     * @param x
     * @return
     */
    public int reverse(int x){
        int newX=0;

        if(x>0){
            //将int转成string
            String x1 = String.valueOf(x);

            //反转string的顺序
            StringBuilder b = new StringBuilder(x1);
            String sx=b.reverse().toString();
            //将string转成int
            newX = Integer.parseInt(sx);
        }else{
            //转成正数
            int x1 = 0-x;

            //将int转成string
            String xs = String.valueOf(x1);

            //反转string的顺序
            StringBuilder b = new StringBuilder(xs);
            String sx=b.reverse().toString();
            //将string转成int
            newX = 0-Integer.parseInt(sx);

        }

        return newX;
    }


    /**
     * @param x
     * @return
     */
    public int reverse2(int x){
        //返回反转后的数据
        int newNumber=0;
        if(x==Integer.MIN_VALUE){
            newNumber=0;
        }else{
            int newx=Math.abs(x);



            //将int转成String
            String a = String.valueOf(newx);
            //将String遍历反转
            String newStr="";
            for(int i=a.length()-1;i>=0;i--){
                newStr = newStr+a.charAt(i);
            }

            //加上溢出判断
            if(Long.parseLong(newStr)>Integer.MAX_VALUE){
                newNumber=0;
            }else{
                newNumber = Integer.parseInt(newStr);
            }

            if(x<0){
                newNumber = 0-newNumber;
            }
        }
        return newNumber;
    }



}

