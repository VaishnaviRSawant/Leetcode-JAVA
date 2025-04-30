package com.stack;

import com.stack.CustomStack;

public class DynamicStack extends CustomStack {


    public DynamicStack() {
        super(); //it will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); //it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {

        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy all previous items in new data
            for (int i=0; i< data.length;i++){
                //inhanced version of-> temp[i]=data[i];
                System.arraycopy(data,0,temp,0,data.length);
            }

            data=temp;
        }

        //insert item
        return super.push(item);
    }

}
