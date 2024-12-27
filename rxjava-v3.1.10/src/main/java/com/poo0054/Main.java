package com.poo0054;

import io.reactivex.rxjava3.core.Flowable;

public class Main {

    public static void main(String[] args) {
        Flowable.fromArray("a", "b", "c")
                .subscribe(s -> System.out.println("Hello " + s + "!"));

    }
}