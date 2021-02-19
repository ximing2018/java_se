package com.qian.changmey.map;

import java.util.*;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.map
 * @ClassName: SortMap
 * @Author: changmey
 * @Description:
 * @Date: 2020/11/14 6:26
 * @Version: 1.0
 */
public class SortMap {

    public static void main(String[] args) {
        Map phone=new HashMap();
        phone.put("Xiaomi",2400);
        phone.put("Apple",7299);
        phone.put("SAMSUNG",6000);
        phone.put("Meizu",2698);
        System.out.println("排序前："+phone);
        System.out.println("sortMap后："+sortMap(phone));
        System.out.println("sortMapByKey后："+sortMapByKey(phone));


    }
    private static Map<String,String> sortMap(Map<String,String> map){
        Map<String,String> sortMap = new TreeMap<>();
        sortMap.putAll(map);
        return sortMap;
    }

    private static Map<String,Integer> sortMapByKey(Map<String,Integer> map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);

        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        list.forEach(l->{
            linkedHashMap.put(l.getKey(),l.getValue());
        });
        return linkedHashMap;
    }



}
