package com.kongqikill.kongqikillexplore.views;

import android.os.Bundle;
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
    }
}