package sort3;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name sortMain3
 * @description:
 * 快速排序：在数组中选择第一个作为比较的临界值（一般是数组的第一个数据，小于它的在左边，大于它的在右边），
 * 从一头low一尾high开始遍历
 * 当high大于临界值时，high往前移动，继续遍历，当小于临界值时，交换当前两个数据的位置，变成从low开始遍历
 * 当low小于临界值时，继续遍历，当大于临界值时，交换当前位置，然后继续从high开始遍历
 * @date 2018/6/14
 */
public class sortMain3 {

    public static void main(String[] agrs){
        int[] arrays={48,62,35,77,55,14,35,98};
        FastSort(arrays,0,arrays.length-1);

        for(int v:arrays){
            System.out.println(v+",");
        }
    }

    /**
     * 快速排序
     * @param arrays
     * @param low
     * @param high
     */
    public static int fastSort(int[] arrays,int low,int high){

        //临界值
        int key = arrays[low];
        //位移的位置
        int flag=0;
        while(high!=low){
            //flag=0表示从high的一端开始移动
            if(flag==0){
                if(arrays[high]>key){
                    //high端的数据大于临界值，则向前移动一位
                    high--;
                }else{
                    //high端的数据小于临界值，则交换位置，从low端开始移动
                    arrays[low]=arrays[high];
                    low++;
                    flag=1;
                }
            }else{
                //从low的一端开始移动
                if(arrays[low]>key){
                    //low端的数据大于临界值，交换位置
                    arrays[high] = arrays[low];
                    high--;
                    flag=0;
                }else{
                    //low端的数据小于临界值，继续遍历
                    low++;
                }
            }
        }

        arrays[low] = key;
        return low;
    }


    public static void FastSort(int[] array,int low,int high){
        if(low<high){
            //以临界值为分界线，pos为临界值左边的数据个数
            int pos = fastSort(array,low,high);
            FastSort(array,low,pos-1);
            FastSort(array,pos+1,high);
        }


    }
}

