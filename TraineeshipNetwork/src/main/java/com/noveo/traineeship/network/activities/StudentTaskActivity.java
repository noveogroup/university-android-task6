package com.noveo.traineeship.network.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.noveo.traineeship.network.R;

public class StudentTaskActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_task);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

    }
}
