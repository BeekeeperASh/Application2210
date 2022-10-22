package com.example.application2210;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.AttributedCharacterIterator;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText;
    int counter;
    int summa;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Amogubobus");
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextTextPersonName);

        // анонимный внутренний класс
        // экземпляр
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                summa += counter;
                textView.setText(String.valueOf(counter));
                name = String.valueOf(editText.getText());
                Toast.makeText(MainActivity.this, "не надо " + name, Toast.LENGTH_SHORT).show();
            }
        });
//        button.setText("Амогус");
//        button.setAlpha(0.5f);
        // class R ресурсный класс
    }
}