package org.androidtown.test5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 선언
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // View 값 복원
        setContentView(R.layout.activity_main);

        // 저장해둔 Bundle이 있다면 상태 복원
        if(savedInstanceState != null) {
            // 예제 : 저장한 값 불러오기
            /*
            mCurrentScore = savedInstanceState.getInt(STATE_SCORE);
            룰룰
             */
        }

        // 로딩 화면 먼저 출력
        startActivity(new Intent(this, SplashActivity.class));

        // 선언
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    //git tes
}
