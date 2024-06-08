package com.kongqikill.kongqikillexplore.views.buttonc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.kongqikill.kongqikillexplore.R;
import com.kongqikill.kongqikillexplore.databinding.ActivityButtonBinding;

public class ButtonActivity extends AppCompatActivity {


    private ActivityButtonBinding binding;
    private Button button_onclick;
    private Button Button_onlongclick;
    private Button button_ontouch;
    private Button button_clickall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //setContentView(R.layout.activity_button);
        binding = ActivityButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.button_root), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initview();
    }

    @SuppressLint("ClickableViewAccessibility")
    private void initview() {
        button_onclick = binding.buttonButtonOnclick;
        Button_onlongclick = binding.buttonButtonOnlongclick;
        button_ontouch = binding.buttonButtonOntouch;
        button_clickall = binding.buttonButtonClickall;

        // 单击事件
        //button_onclick.setOnClickListener(view -> {button_onclick.setText("被点击");...});       // 单行写法
        button_onclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_onclick.setText("被点击");
            }
        });

        // 长按事件
        Button_onlongclick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Button_onlongclick.setText("被长按");

                // 事件处理，false：同时执行单击事件(onClick)和长按事件(onLongClick)，true：禁用单击事件(onClick)
                return false;
            }
        });

        // 触摸事件
        button_ontouch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                button_ontouch.setText("被触摸");
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    Log.i("tag_log_ontouch","被按下");
                }
                if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    Log.i("tag_log_ontouch","被弹起");
                }

                // 事件处理，false：同时执行单击事件(onClick)、长按事件(onLongClick)和触摸事件(onTouch)，true：禁用单击事件(onLongClick)和长按事件(onLongClick)
                return false;
            }
        });


        // 多事件
        button_clickall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //日志
                Log.i("tag_log_clickall","onClick");
            }
        });
        button_clickall.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                //日志
                Log.i("tag_log_clickall","onLongClick");
                return false;
            }
        });
        button_clickall.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //日志
                Log.i("tag_log_clickall","onTouch:"+motionEvent.getAction());
                return false;
            }
        });
    }

    // xml直接调用此方法
    public void onClick_xml(View view) {
        Button view1 = (Button) view;
        view1.setText("xml的OnClick事件");
    }
}