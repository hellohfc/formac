package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name testMain
 * @description:整合多个map,key相同时追加value
 * @date 2018/7/26
 */
public class testMain {
    public static void main(String[] args){
        Map<Integer,Integer> map1 = new HashMap<>();
        map1.put(1,10);
        map1.put(2,20);
        map1.put(3,30);
        map1.put(4,40);

        Map<Integer,Integer> map2 = new HashMap<>();
        map2.put(1,10);
        map2.put(21,20);
        map2.put(3,30);
        map2.put(41,40);

        Map<Integer,Integer> map3 = new HashMap<>();
        map3.put(1,10);
        map3.put(21,20);
        map3.put(3,30);
        map3.put(41,40);

        //建立一个空的map,将map1全部放入
        Map<Integer,Integer> newMap = new HashMap<>();
        newMap.putAll(map1);

        newMap=putAllMap(newMap,map2);
        newMap=putAllMap(newMap,map3);

        //遍历newMap
        for(Map.Entry entry:newMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }



    }

    /**
     *
     * @param newMap:包含其他map数据的集合
     * @param map2：新的map集合
     * @return
     */
    public static Map<Integer,Integer> putAllMap(Map<Integer,Integer> newMap,Map<Integer,Integer> map2){
       for(Map.Entry entry:map2.entrySet()){
           Integer key = (Integer) entry.getKey();
           //判断当前的key是否能在已经整合好的map中获取到value
           // 如果获取到的为null,则将当前map中的value存入整合后的map中，如果获取到的不为null,则进行追加
           if(newMap.get(key)==null){
               newMap.put(key,(Integer)map2.get(key));
           }else{
               //将新旧map相加
               Integer value2 = (Integer)map2.get(key);
               Integer newValue = (Integer)newMap.get(key);
               newMap.put(key,value2+newValue);
           }
       }

        return newMap;
    }
}

