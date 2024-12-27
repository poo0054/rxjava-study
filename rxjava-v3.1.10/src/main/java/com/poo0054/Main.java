package com.poo0054;

import io.reactivex.rxjava3.core.Flowable;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //对数组的统计，比如用
        List<Integer> number = Arrays.asList(1, 2, 5, 4);

        IntSummaryStatistics statistics = number.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中最大的数 : " + statistics.getMax());
        System.out.println("列表中最小的数 : " + statistics.getMin());
        System.out.println("平均数 : " + statistics.getAverage());
        System.out.println("所有数之和 : " + statistics.getSum());

        Flowable.fromArray(args)
                .subscribe(
                        s -> System.out.println("Hello " + s + "!"));


    }
}