package com.xgh.DesignPattern.Creating.Prototype;

import com.xgh.DesignPattern.CommonObj.Product;

public class PrototypeDemo
{
    public static void main(String[] args) {
        Product productA = new Product("轮胎",100f);
        Product productB = (Product)productA.clone();
        System.out.println("---------------------------------------------------");
        System.out.println(productA);
        System.out.println(productB);
        System.out.println("---------------------------------------------------");
        productB.setProductName("电竞轮胎");
        productB.setProductPrice(200f);
        System.out.println(productA);
        System.out.println(productB);
    }
}
