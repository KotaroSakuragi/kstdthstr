package com.example.childfunny1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AgeSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.age_select);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.age_select), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //年齢選択画面のテキストの設定
        final TextView ageSelectTopText = (TextView) findViewById(R.id.AgeSelectTitle);
        ageSelectTopText.setText(R.string.age_select_text);
        //年齢選択画面のボタンの設定
        final TextView ageSelectBtn1Text = (TextView) findViewById(R.id.button1);
        ageSelectBtn1Text.setText(R.string.age_select_btn_1);
        final TextView ageSelectBtn2Text = (TextView) findViewById(R.id.button2);
        ageSelectBtn2Text.setText(R.string.age_select_btn_2);
        final TextView ageSelectBtn3Text = (TextView) findViewById(R.id.button3);
        ageSelectBtn3Text.setText(R.string.age_select_btn_3);
        final TextView ageSelectBtn4Text = (TextView) findViewById(R.id.button4);
        ageSelectBtn4Text.setText(R.string.age_select_btn_4);
        final TextView ageSelectBtn5Text = (TextView) findViewById(R.id.button5);
        ageSelectBtn5Text.setText(R.string.age_select_btn_5);
        //ボタンのリスナ
        Button btn1 = (Button)findViewById(R.id.button1);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);
        Button btn5 = (Button)findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // タップされたときの処理をここに記述します
                Toast.makeText(AgeSelect.this, "ボタン１がタップされました。", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(AgeSelect.this, GameSelect.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // タップされたときの処理をここに記述します
                Toast.makeText(AgeSelect.this, "ボタン２がタップされました。", Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(AgeSelect.this, XXX.class);
//                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // タップされたときの処理をここに記述します
                Toast.makeText(AgeSelect.this, "ボタン１がタップされました。", Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(AgeSelect.this, XXX.class);
//                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // タップされたときの処理をここに記述します
                Toast.makeText(AgeSelect.this, "ボタン１がタップされました。", Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(AgeSelect.this, XXX.class);
//                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // タップされたときの処理をここに記述します
                Toast.makeText(AgeSelect.this, "ボタン１がタップされました。", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(AgeSelect.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
