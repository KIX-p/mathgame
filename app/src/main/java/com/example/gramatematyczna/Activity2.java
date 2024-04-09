package com.example.gramatematyczna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Random generator = new Random();
        TextView przyklad1 = findViewById(R.id.przyklad1);
        TextView przyklad2 = findViewById(R.id.przyklad2);
        TextView przyklad3 = findViewById(R.id.przyklad3);
        TextView przyklad4 = findViewById(R.id.przyklad4);
        TextView przyklad5 = findViewById(R.id.przyklad5);

        String parseprzyklad1 = String.valueOf(generator.nextInt(50));
        String parseprzyklad2 = String.valueOf(generator.nextInt(50));
        String parseprzyklad3 = String.valueOf(generator.nextInt(50));
        String parseprzyklad4 = String.valueOf(generator.nextInt(50));
        String parseprzyklad5 = String.valueOf(generator.nextInt(50));



        Button button = findViewById(R.id.sprawdz);

        przyklad1.setText(parseprzyklad1.concat("+").concat(parseprzyklad1).concat("="));
        przyklad2.setText(parseprzyklad2.concat("+").concat(parseprzyklad2).concat("="));
        przyklad3.setText(parseprzyklad3.concat("+").concat(parseprzyklad3).concat("="));
        przyklad4.setText(parseprzyklad4.concat("+").concat(parseprzyklad4).concat("="));
        przyklad5.setText(parseprzyklad5.concat("+").concat(parseprzyklad5).concat("="));

        EditText wynik1 = findViewById(R.id.wynik1);
        EditText wynik2 = findViewById(R.id.wynik2);
        EditText wynik3 = findViewById(R.id.wynik3);
        EditText wynik4 = findViewById(R.id.wynik4);
        EditText wynik5 = findViewById(R.id.wynik5);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int parsewynik1 = Integer.parseInt(String.valueOf(wynik1));
                int parsewynik2 = Integer.parseInt(String.valueOf(wynik2));
                int parsewynik3 = Integer.parseInt(String.valueOf(wynik3));
                int parsewynik4 = Integer.parseInt(String.valueOf(wynik4));
                int parsewynik5 = Integer.parseInt(String.valueOf(wynik5));

                int parsetext = Integer.parseInt(String.valueOf(parseprzyklad1));

                int suma = parsetext + parsetext;

                if(parsewynik1 == suma){
                    Toast.makeText(getBaseContext(), "Wynik prawidłowy", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent();
                setResult(MainActivity.RESULT_OK, intent);
                finish();
            }
        });


    }
}