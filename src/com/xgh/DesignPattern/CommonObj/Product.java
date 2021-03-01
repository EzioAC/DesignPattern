package com.xgh.DesignPattern.CommonObj;

//Cloneable为标志接口(或标签接口,就是没有任何方法的接口,仅作标记),表示该类支持克隆
public class Product implements Cloneable {
    private String productName;
    private float productPrice;

    public Product(String productName, float productPrice)
    {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    //父类的权限为protected,需要提升为public让使用者调用
    @Override
    public Object clone() {
        return new Product(productName,productPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
}
