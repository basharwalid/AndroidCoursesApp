package com.bashar.sessiontwoassignment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CourseDetailsActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton backButton;
    ImageView courseImage;
    TextView content;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);
        backButton = findViewById(R.id.btn_back);
        backButton.setOnClickListener(this);
        courseImage = findViewById(R.id.course_image);
        content = findViewById(R.id.content_text);

        Bundle bundle = getIntent().getExtras();
        if(bundle!= null){
            courseImage.setImageResource(bundle.getInt("image"));
            content.setText(bundle.getString("content"));
        }
    }


    @Override
    public void onClick(View view) {
        finish();
    }
}
