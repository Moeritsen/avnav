package de.wellenvogel.avnav.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import android.widget.Button;

import de.wellenvogel.avnav.main.R;

/**
 * Created by andreas on 29.11.15.
 */
public class DefaultsEditTextPreference extends OwnDialogEditTextPreference {

    private String defaultValue;

    public DefaultsEditTextPreference(Context context) {
        super(context);
    }

    public DefaultsEditTextPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onShowDialog(DialogBuilder builder) {
        super.onShowDialog(builder);
        if (defaultValue != null) {
            builder.setButton(R.id.edpButton3,R.string.setDefault, DialogInterface.BUTTON_NEUTRAL);
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (which == DialogInterface.BUTTON_NEUTRAL) {
            setText(defaultValue);
        }
        super.onClick(dialog,which);
    }
    public void setDefaultValue(String defaultValue){
        this.defaultValue=defaultValue;
    }
}
