package com.kongqikill.kongqikillexplore.views.textviewc;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.kongqikill.kongqikillexplore.R;

import com.kongqikill.kongqikillexplore.databinding.ActivityTextviewBinding;

public class TextviewActivity extends AppCompatActivity {

    private ActivityTextviewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //setContentView(R.layout.activity_textview);
        binding = ActivityTextviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.textview_root), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // textViewTextviewId 用代码设置内容
        // R.layout.activity_textview  49行
        //TextView textView_id = findViewById(R.id.textView_textview_id);       // findViewById
        TextView textView_id = binding.textViewTextviewId;                      // binding
        textView_id.setText("id(为其设置一个id，用于在代码中操纵)");                 // 设置文本视图内容


        // 获取对象
        TextView textView_test1 = binding.textViewTextviewTest1;
        // 设置文本内容
        textView_test1.setText("用代码设置的内容");// 或 textView_test1.setText(R.string.app_name);
        // 设置文本颜色
        textView_test1.setTextColor(0xFF35D811);// 或 textView_test1.setTextColor(R.color.black);
        // 设置文本样式
        // 设置文本大小
        textView_test1.setTextSize(20);
        // 设置文本背景
        textView_test1.setBackground(getDrawable(R.drawable.ic_launcher_background));
        // 设置文本背景颜色
        textView_test1.setBackgroundColor(0xFF35D811);
        // 设置文本对齐方式
        textView_test1.setGravity(Gravity.CENTER);
    }
}