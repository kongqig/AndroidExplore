package com.kongqikill.kongqikillexplore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.kongqikill.kongqikillexplore.databinding.ActivityMainBinding;
import com.kongqikill.kongqikillexplore.views.textviewc.TextviewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // 声明变量
    private ActivityMainBinding binding;
    private Button button_textview;

    // 窗口被创建
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 即将创建。。。
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //setContentView(R.layout.activity_main);
        // 创建完毕。。。

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_root), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initview();
    }

    private void initview() {
        //初始化视图
        button_textview = binding.mainExploreTextvewi;
        //视图事件
        button_textview.setOnClickListener(this);
    }

    // 窗口被启动
    @Override
    protected void onStart() {
        super.onStart();
    }

    // 窗口被重新启动
    @Override
    protected void onRestart() {
        super.onRestart();
    }

    // 窗口被停止
    @Override
    protected void onStop() {
        super.onStop();
    }

    // 窗口被停止
    @Override
    protected void onPause() {
        super.onPause();
    }

    // 窗口被恢复
    @Override
    protected void onResume() {
        super.onResume();
    }

    // 窗口被销毁
    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }


    @Override
    public void onClick(View view) {
        if (view == button_textview) {
            startActivity(new Intent(MainActivity.this, TextviewActivity.class));
        }
    }
}