package maopao;

import java.util.Arrays;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name testMain
 * @description
 * @date 2018/7/17
 */
public class testMain {

    public static void maopao(int[] arrays){
        int temp=0;
        int lastExchangeIndex = 0;
        int sortLength = arrays.length-1;

        for(int i=0;i<arrays.length;i++){
            boolean sorted = true;


            for(int j=0;j<sortLength;j++){
                if(arrays[j]>arrays[j+1]){
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;

                    //存在交换位置
                    sorted = false;
                    lastExchangeIndex = j;

                }
            }

            sortLength = lastExchangeIndex;
            if(sorted){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] arrays = new int[] {5,8,6,3,9,2,1,7};
        maopao(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}

