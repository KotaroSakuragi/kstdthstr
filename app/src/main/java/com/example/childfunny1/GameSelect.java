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

public class GameSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.game_select);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.game_select), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //年齢選択画面のテキストの設定
        final TextView gameSelectTopText = (TextView) findViewById(R.id.gameSelectTitle);
        gameSelectTopText.setText(R.string.game_select_text);
        //年齢選択画面のボタンの設定
        final TextView gameSelectBtn1Text = (TextView) findViewById(R.id.gameSelectButton1);
        gameSelectBtn1Text.setText(R.string.game_select_btn_1);
        final TextView gameSelectBtn2Text = (TextView) findViewById(R.id.gameSelectButton2);
        gameSelectBtn2Text.setText(R.string.game_select_btn_2);
        final TextView gameSelectBtn3Text = (TextView) findViewById(R.id.gameSelectButton3);
        gameSelectBtn3Text.setText(R.string.game_select_btn_3);
        final TextView gameSelectBtn4Text = (TextView) findViewById(R.id.gameSelectButton4);
        gameSelectBtn4Text.setText(R.string.game_select_btn_4);
        //ボタンのリスナ
        Button btn1 = (Button)findViewById(R.id.gameSelectButton1);
        Button btn2 = (Button)findViewById(R.id.gameSelectButton2);
        Button btn3 = (Button)findViewById(R.id.gameSelectButton3);
        Button btn4 = (Button)findViewById(R.id.gameSelectButton4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // タップされたときの処理をここに記述します
                Toast.makeText(GameSelect.this, "ボタン１がタップされました。", Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(AgeSelect.this, XXX.class);
//                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // タップされたときの処理をここに記述します
                Toast.makeText(GameSelect.this, "ボタン２がタップされました。", Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(AgeSelect.this, XXX.class);
//                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // タップされたときの処理をここに記述します
                Toast.makeText(GameSelect.this, "ボタン３がタップされました。", Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(AgeSelect.this, XXX.class);
//                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // タップされたときの処理をここに記述します
                Toast.makeText(GameSelect.this, "ボタン４がタップされました。", Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(AgeSelect.this, XXX.class);
//                startActivity(intent);
            }
        });
    }
}
