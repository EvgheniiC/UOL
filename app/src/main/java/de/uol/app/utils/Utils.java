package de.uol.app.utils;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;

import de.uol.app.R;

public class Utils {

    public static void startActivityWithAnim(Context context, Class cls) {
        Intent intent = new Intent(context, cls);
        ActivityOptions options =
                ActivityOptions.makeCustomAnimation(context, R.anim.fade_in, R.anim.fade_out);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent, options.toBundle());
    }
}
