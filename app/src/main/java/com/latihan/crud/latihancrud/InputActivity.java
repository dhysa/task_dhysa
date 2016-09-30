package com.latihan.crud.latihancrud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by ASUS on 29/09/2016.
 */

public class InputActivity extends AppCompatActivity {
    DatabaseHelper dbhelper;
    Button btn_submit = (Button) findViewById(R.id.btn_submit);
    EditText edit_input = (EditText) findViewById(R.id.edit_input);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_layout);

        btn_submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                final String input = edit_input.getText().toString();
                try {
                    dbhelper.checkAndCopyDatabase();
                    dbhelper.openDatabase();
                    dbhelper.ExeSQLData("insert  into input_data (submit_data)  values('" + input + "')");

                    Toast toast = Toast.makeText(InputActivity.this, "Data submitted", Toast.LENGTH_SHORT);
                    toast.show();

                } catch (java.sql.SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
