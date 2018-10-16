package com.sundaramkrishna.viewmodelsample;

import android.arch.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private String mRandomNumber;

    public String getmRandomNumber(){
          if (mRandomNumber==null){
              createNumber();
          }

          return mRandomNumber;
    }

    private void createNumber() {
        Random random = new Random();
        mRandomNumber = "Number"+(random.nextInt(10-1)+1);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        System.out.println("MainActivityViewModel.onCleared will be called once activity destroyed");
    }
}
