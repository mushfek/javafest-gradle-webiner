package net.therap.javafest.currencyconverter.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import net.therap.javafest.currencyconverter.R;
import net.therap.javafest.currencyconverter.service.CurrencyConverterService;
import net.therap.javafest.currencyconverter.util.DialogBuilder;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */

public class ConverterActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.converter_layout);
    }

    public void onConvertButtonClick(View view) {
        EditText inputText = (EditText) findViewById(R.id.bdt_text_input);
        double bdtInput = Double.parseDouble(inputText.getText().toString());

        double usdOutput = new CurrencyConverterService().bdtToUsd(bdtInput);

        DialogBuilder.buildOkDialog(
                this,
                this.getResources().getString(R.string.usd_amount_msg),
                Double.toString(usdOutput),
                false,
                null
        ).show();
    }
}