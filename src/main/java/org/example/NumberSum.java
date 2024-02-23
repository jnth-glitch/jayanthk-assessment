package org.example;

import java.util.Arrays;

public class NumberSum {
    private int[] num =new int[6];
    public NumberSum(){}

    public NumberSum(int[] num) {
        this.num = num;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public int evenSum(){
        int sum=0;
        for(int i=0;i<6;i++){
            if(num[i]%2==0) {
                sum += num[i];
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "NumberSum{" +
                "num=" + Arrays.toString(num) +
                '}';
    }
}
