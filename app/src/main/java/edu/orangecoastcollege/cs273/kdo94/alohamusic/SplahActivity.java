package edu.orangecoastcollege.cs273.kdo94.alohamusic;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

        import java.util.Timer;
        import java.util.TimerTask;

public class SplahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        TimerTask mediaTask = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplahActivity.this, MusicActivity.class));
            }
        };
        Timer timer = new Timer();
        timer.schedule(mediaTask, 3000);
    }
}
