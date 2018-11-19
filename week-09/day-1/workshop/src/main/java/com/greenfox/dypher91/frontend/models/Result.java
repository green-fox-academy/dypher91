package com.greenfox.dypher91.frontend.models;

public class Result {
    Integer sum;
    Integer factor;

    public Result() {

    }

    public Result(Integer sum, Integer factor){
        this.sum = sum;
        this.factor =factor;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum =sum;
    }

    public Integer getFactor() {
        return factor;
    }

    public void setFactor(Integer factor) {
        this.factor = factor;
    }

    public int sumNumber(Integer number){
        for (int i = 0; i < number ; i++) {
            sum+=i;
        }return sum;
    }

    public int factoNumber(Integer number){
        int fact = 1;
        for(int i=1;i <=number;i++){
            fact = fact*i;
        }return fact;
    }
}
