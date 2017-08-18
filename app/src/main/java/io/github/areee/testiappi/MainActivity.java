package io.github.areee.testiappi;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                long[] pattern = {0, 100, 1000, 300, 200, 100, 500, 200, 100};
                vibrator.vibrate(pattern, 0);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.cancel();
            }
        });
    }
}
