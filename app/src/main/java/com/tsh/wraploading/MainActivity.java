package com.tsh.wraploading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import com.tsh.loading.WrapLoading;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler(Looper.getMainLooper());
    TextView helloTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloTxt = findViewById(R.id.txt_hello);
        WrapLoading.with(helloTxt).show();
        handler.postDelayed(this::dismissLoading, 1500);
    }

    private void dismissLoading() {
//        WrapLoading.with(helloTxt).dismiss();
        WrapLoading.release(helloTxt);
    }
}