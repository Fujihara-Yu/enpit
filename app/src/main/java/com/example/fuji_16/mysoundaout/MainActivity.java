package com.example.fuji_16.mysoundaout;

/*
public class MainActivity extends AppCompatActivity {
    private TextView maintext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start_button = (Button) findViewById(R.id.start_button);
        start_button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    TextView maintext= (TextView)findViewById(R.id.mainText);
                    maintext.setText("適音開始");
                }
            });

        Button stop_button = (Button) findViewById(R.id.stop_button);
        stop_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                TextView maintext= (TextView)findViewById(R.id.mainText);
                maintext.setText("適音終了");
            }
        });
    }
}
*/

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView maintext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start_button=(Button)findViewById(R.id.start_button);
        StratButtonTapped stratbuttontapped = new StratButtonTapped();
        start_button.setOnClickListener(stratbuttontapped);

        Button stop_button=(Button)findViewById(R.id.stop_button);
        StopButtonTapped stopbuttontapped = new StopButtonTapped();
        stop_button.setOnClickListener(stopbuttontapped);


    }

    //開始ボタン(id=startbutton)が押された時
    public class  StratButtonTapped implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            TextView textView=(TextView)findViewById(R.id.mainText);
            textView.setText("適音開始");
        }
    }
    //終了ボタン(id=stopbutton)が押された時
    public class  StopButtonTapped implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            TextView textView=(TextView)findViewById(R.id.mainText);
            textView.setText("適音終了");
        }
    }
}