package sort2;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name sortMain2
 * @description:冒泡排序（升序）:一头一尾进行比较，如果头大于尾就交换位置
 * @date 2018/6/14
 */
public class sortMain2 {
    public static void main(String[] args){
        int[] arrays = {1,13,72,9,22};
        maopaoSort(arrays);
    }

    public  static  void maopaoSort(int[] arrays){
        //临时存储
        int temp=0;
        for(int i=0;i<arrays.length;i++){
            for(int j=0;j<arrays.length-i-1;j++){
                if(arrays[j]>arrays[j+1]){
                    //当前一个比后一个大的时候，就交换位置
                    temp = arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }


        for(int v:arrays){
            System.out.println(v);
        }

    }
}

