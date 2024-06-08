package com.kongqikill.kongqikillexplore.views.edittextc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.kongqikill.kongqikillexplore.R;
import com.kongqikill.kongqikillexplore.databinding.ActivityEdittextBinding;

public class EdittextActivity extends AppCompatActivity {

    private ActivityEdittextBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //setContentView(R.layout.activity_edittext);
        binding = ActivityEdittextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.edittext_root), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText ea = binding.edittextEdittextEta;
        EditText eb = binding.edittextEdittextEtb;
        Button b1 = binding.edittextButton1;
        Button b2 = binding.edittextButton2;


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = ea.getText().toString();
                eb.setText(text1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ea.setText(eb.getText().toString());
            }
        });

    }
}