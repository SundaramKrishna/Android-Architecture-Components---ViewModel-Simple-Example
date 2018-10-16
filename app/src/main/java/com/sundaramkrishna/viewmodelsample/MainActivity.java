package com.sundaramkrishna.viewmodelsample;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sundaramkrishna.viewmodelsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //DataBinding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        //ViewModel
        MainActivityViewModel viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        binding.lblNumber.setText(viewModel.getmRandomNumber());
    }
}
