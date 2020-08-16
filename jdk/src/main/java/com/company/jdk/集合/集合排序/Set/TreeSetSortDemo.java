package com.company.jdk.集合.集合排序.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
* set的实现类HashSet，只有TreeSet可以进行排序
*
* HashSet按Hash函数排序
* LinkedHashSet按插入顺序排序
* TreeSet按字母顺序排序
* 以上都不是主动排序，只是集合包含的性质决定的；与这里所讲的排序方式不同
*
* 这里只演示一种常用实现排序的方式
* */
public class TreeSetSortDemo {
    public static void main(String [] args){

        //内部类构建一个比较器，重写compare方法
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);//这里实现的是降序排列
            }
        };

        //将比较器放在TreeSet构造函数中，实现TreeSet的排序功能
        Set<String> set = new TreeSet<String>(comparator);

        set.add("20180101");
        set.add("20180102");
        set.add("20180103");
        set.add("20180104");
        set.add("20180105");
        
        for(String s : set){
            System.out.println(s);
        }

    }
}
