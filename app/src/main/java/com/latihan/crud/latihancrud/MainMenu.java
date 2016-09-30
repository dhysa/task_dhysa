package com.latihan.crud.latihancrud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void btn_input(View view){
        Intent input_layout = new Intent(MainMenu.this,InputActivity.class);
        startActivity(input_layout);

    }

    public void btn_output(View view){
        Intent output_layout = new Intent(MainMenu.this,OutputActivity.class);
        startActivity(output_layout);
    }



}
