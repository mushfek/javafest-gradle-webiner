package net.therap.javafest.currencyconverter.util;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import net.therap.javafest.currencyconverter.R;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */

public class DialogBuilder {
    public static Dialog buildOkDialog(Context context, String titleText, String messageText,
                                       boolean cancelable, DialogInterface.OnClickListener onOkButtonClickListener) {
        return new AlertDialog.Builder(context)
                .setTitle(titleText)
                .setMessage(messageText)
                .setPositiveButton(R.string.ok, onOkButtonClickListener)
                .setCancelable(cancelable)
                .create();
    }
}
