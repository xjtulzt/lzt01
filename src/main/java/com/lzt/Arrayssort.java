package com.lzt;

import java.util.Arrays;
import java.util.Comparator;

public class Arrayssort {
    public static void main(String[] args) {
        /**
         * 通过Arrays.sort 排序可以通过两种方法实现
         * 方法1
         */
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {6, 12}};
//         对二维数组按照每行数组的第一个元素进行排序
//        Arrays.sort(points, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                // 按照从小到大排序
//                return o1[0] - o2[0];
//            }
//        });

         // 方法2：使用lambad表达式
//        Arrays.sort(points,(o1,o2) -> o1[0] - o2[0]);
        //方法3：使用Comparator.comparingInt()方法
        // 该方法接收一个函数作为参数，从类型T中提取一个int类型的排序键，并返回一个与该排序键进行比较的Comparator。
        Arrays.sort(points,Comparator.comparingInt(o -> o[0]));
        for (int[] point : points) {
            for (int i : point) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
