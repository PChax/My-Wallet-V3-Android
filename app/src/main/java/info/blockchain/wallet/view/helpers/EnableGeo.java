package info.blockchain.wallet.view.helpers;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;

import piuk.blockchain.android.R;

public class EnableGeo {

    public static void displayGPSPrompt(final Activity activity) {

        final AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        final String action = Settings.ACTION_LOCATION_SOURCE_SETTINGS;

        final String message = activity.getString(R.string.enable_geo);

        builder.setMessage(message)
                .setPositiveButton(android.R.string.ok,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface d, int id) {
                                activity.startActivity(new Intent(action));
                                d.dismiss();
                            }
                        })
                .setNegativeButton(android.R.string.cancel,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface d, int id) {
                                d.cancel();
                            }
                        });

        builder.create().show();
    }
}
