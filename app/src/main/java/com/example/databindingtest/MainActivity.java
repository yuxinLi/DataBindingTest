package com.example.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.databindingtest.bean.Student;
import com.example.databindingtest.databinding.DataBindingBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DataBindingBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.data_binding);

        dataBinding.setStu(new Student("aa" , "bb"));

    }
}
