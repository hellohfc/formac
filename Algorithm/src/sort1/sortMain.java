package sort1;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name sortMain
 * @description:直接插入排序
 * @date 2018/6/14
 */
public class sortMain {
    public static void main(String[] args){
        int[] arrays = {1,13,72,9,22,4,6,781,29,2};
        InsertSort(arrays);

    }

    /**
     * 思路：从第i个元素开始插入前面i-1的序列中，
     * 建立临时字段保存需要插入的字段，从i-1个序列中比较大小，比临时字段大的就将临时字段放入其前面
     * @param array
     */
    public static void InsertSort(int[] array){
        int i=0,j=0,key;
        for(i=1;i<array.length;i++){
            //存储临时字段
            key = array[i];

            //之前的有序序列（0~i-1）
            j=i-1;
            //比较当前值与序列中的值的大小，当遇到比它的就交换位置
            while(j>=0&&key<array[j]){
                //将较大的值后移
                array[j+1]=array[j];
                j--;

            }

            array[j+1] = key;
        }

        //输出排序后的数组
        for(int value:array){
            System.out.println(value+",");
        }

    }



}

