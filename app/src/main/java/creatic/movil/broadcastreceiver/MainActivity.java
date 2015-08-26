package creatic.movil.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import creatic.movil.broadcastreceiver.receivers.ContadorReceiver;
import creatic.movil.broadcastreceiver.services.ContadorServicio;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ContadorReceiver.OnSecondsReceive {

    Button start;
    TextView txt;
    ContadorReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.btn_start);
        txt = (TextView) findViewById(R.id.txt);

        start.setOnClickListener(this);

        receiver = new ContadorReceiver(this);
        IntentFilter filter = new IntentFilter();
        filter.addAction(ContadorReceiver.ACTION);

        registerReceiver(receiver, filter);


    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(receiver);
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, ContadorServicio.class);
        startService(intent);

    }

    @Override
    public void onSecondsReceive(int seconds) {

        txt.setText(""+seconds);

    }
}
