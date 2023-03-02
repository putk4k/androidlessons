package com.mirea.vikulovaa.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Мой номер по списку № 6");
                checkBox.toggle();
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
        View.OnClickListener oclBtnItIsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Это не я сделал");
                checkBox.toggle();
            }
        };
        btnItIsNotMe.setOnClickListener(oclBtnItIsNotMe);
    }
    public void onMyButtonClick(View view)
    {

        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }

}