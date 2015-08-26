package creatic.movil.broadcastreceiver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Dario Chamorro on 26/08/2015.
 */
public class AlarmaReceiver extends BroadcastReceiver {

    public static final String ACTION="creatic.movil.broadcastreceiver.Alerta";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("alarma", "Concentrate !!!");
    }
}
