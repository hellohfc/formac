package leetcode1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name testMain
 * @description:Given nums = [2, 7, 11, 15], target = 9,
            Because nums[0] + nums[1] = 2 + 7 = 9,
            return [0, 1].
 * @date 2018/6/3
 */
public class testMain {
    public static void main(String[] args){
        testMain t = new testMain();
       int[] nums={2, 7, 11, 15};
       int target=26;
       int[] res = t.twoSum(nums,target);
        System.out.println(res[0]+"-----"+res[1]);
    }


    public int[] twoSum(int[] nums, int target) {
        //返回类型
        int res[] = new int[2];

      //定义一个hashmap，key存放数组的值，value存放数组的位置
        HashMap<Integer,Integer> map = new HashMap<>();

        //遍历数组，判断target-数组[i]是否在map中存在，若存在则取出，若不存在则将当前数组[i]存入map中以便下次相减时获取
        for(int i=0;i<nums.length;i++){
            int n = target-nums[i];
            if(map.containsKey(n)){
                res[0] = i;
                res[1] = map.get(n);
                return  res;
            }

            //将当前的数据存入map中
            map.put(nums[i],i);

        }

        return res;
    }
}

