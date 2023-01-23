package com.station.wagon;

public class FreightWagon extends Wagon{
    public String product;
    public double weightOfProduct;

    public FreightWagon(int weight,int volume,int weightOfProduct,String product) {
        super(weight, volume);
        this.weightOfProduct = weightOfProduct;
        this.product = product;
    }
    @Override
    public String getProduct() {
        return product;
    }
    @Override
    public void setProduct(String product) {
        this.product = product;
    }
    @Override
    public double overallWeight(){
        return weight + weightOfProduct;
    }
}
