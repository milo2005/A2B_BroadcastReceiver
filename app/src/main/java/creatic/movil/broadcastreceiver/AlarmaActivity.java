package creatic.movil.broadcastreceiver;

import android.app.AlarmManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AlarmaActivity extends AppCompatActivity implements View.OnClickListener {

    Button start, stop;
    AlarmManager alarmManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma);

        start = (Button) findViewById(R.id.btn_start);
        stop = (Button) findViewById(R.id.btn_stop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);

        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

    }


    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.btn_start:

                break;
            case R.id.btn_stop:

                break;

        }

    }
}
