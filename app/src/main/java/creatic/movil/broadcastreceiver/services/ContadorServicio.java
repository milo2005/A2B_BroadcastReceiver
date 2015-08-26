package creatic.movil.broadcastreceiver.services;

import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import creatic.movil.broadcastreceiver.receivers.ContadorReceiver;

/**
 * Created by Dario Chamorro on 25/08/2015.
 */
public class ContadorServicio extends IntentService {

    public ContadorServicio() {
        super("ContadorServicio");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Notification notification = new NotificationCompat.Builder(this)
                .setContentTitle("Servicio Contador")
                .setContentText("Contando ...")
                .setSmallIcon(android.R.drawable.ic_media_play)
                .build();

        startForeground(101,notification);

        for(int i=0;i<30;i++){
            try {
                Thread.sleep(1000);
                Log.i("Contador", "Segundos " + i);

                Intent intentSeconds = new Intent(ContadorReceiver.ACTION);
                intentSeconds.putExtra(ContadorReceiver.EXTRA_SECONDS, i);

                sendBroadcast(intentSeconds);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }        

        stopForeground(true);

    }
}
