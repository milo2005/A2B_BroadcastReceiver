package creatic.movil.broadcastreceiver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Dario Chamorro on 25/08/2015.
 */
public class ContadorReceiver extends BroadcastReceiver {

    public static final String ACTION = "creatic.movil.broadcastreceiver.contador";
    public static final String EXTRA_SECONDS ="extraseconds";

    public interface OnSecondsReceive{
        void onSecondsReceive(int seconds);
    }

    OnSecondsReceive onSecondsReceive;

    public ContadorReceiver(OnSecondsReceive onSecondsReceive) {
        this.onSecondsReceive = onSecondsReceive;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int seconds = intent.getIntExtra(EXTRA_SECONDS,0);
        onSecondsReceive.onSecondsReceive(seconds);
    }
}
