package Roman;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name romanMain
 * @description:
 * Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
 * @date 2018/6/20
 */
public class romanMain {
    //建两个数组，一个存储symbol，一个存储value
    //每次先判断

    public  static void main(String[] args){
        System.out.println(romanNumber("I"));



    }


    public static int romanNumber(String sym){
        //存储罗马字符
        int i=0;

        String[] Symbol={"I","V","X","L","C","D","M"};
        int[] value={1,5,10,50,100,500,1000};

        /*if(sym!=null||"".equals(sym)){
            for(int m=0;m<Symbol.length;m++){
                while(sym==Symbol[m]){
                    num=num-value[i];
                    str = str+Symbol[i];
                }
            }
        }*/
        return i;

    }


}

