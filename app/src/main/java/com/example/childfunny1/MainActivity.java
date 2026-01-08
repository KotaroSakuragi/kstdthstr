package com.example.childfunny1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //トップ画面のテキストの設定
        final TextView topText = (TextView) findViewById(R.id.Toptile);
        topText.setText(R.string.top_title_name);
        //画面のリスナを設定
        final View mainDispView = (View) findViewById(R.id.main);
        mainDispView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // タップされたときの処理をここに記述します
                Toast.makeText(MainActivity.this, "画面がタップされました。次の画面へ遷移します。", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, AgeSelect.class);
                startActivity(intent);
            }
        });

    }
}