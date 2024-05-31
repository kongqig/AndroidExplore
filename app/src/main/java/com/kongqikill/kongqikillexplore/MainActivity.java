package com.kongqikill.kongqikillexplore;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.kongqikill.kongqikillexplore.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    // 窗口被创建
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 即将创建。。。
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //setContentView(R.layout.activity_main);
        // 创建完毕。。。

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
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
}