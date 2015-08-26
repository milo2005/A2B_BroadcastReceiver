package creatic.movil.broadcastreceiver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Dario Chamorro on 25/08/2015.
 */
public class AirPlaneReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i("airplane","Se activo | desactivo el modo avion");

    }
}
