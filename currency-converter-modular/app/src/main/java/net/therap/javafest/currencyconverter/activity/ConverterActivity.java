package net.therap.javafest.currencyconverter.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import net.therap.javafest.currencyconverter.R;
import net.therap.javafest.currencyconverter.service.CurrencyConverterService;
import net.therap.javafest.currencyconverter.util.DialogBuilder;

import com.oneous.log4android.Logger;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */
public class ConverterActivity extends Activity {

    private static final Logger log = Logger.getLogger(ConverterActivity.class);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.converter_layout);
    }

    public void onConvertButtonClick(View view) {
        EditText inputText = (EditText) findViewById(R.id.bdt_text_input);
        double bdtInput = Double.parseDouble(inputText.getText().toString().trim());
        log.debug("Amount in BDT={}", bdtInput);

        double usdOutput = new CurrencyConverterService().bdtToUsd(bdtInput);
        log.debug("Converted amount in USD={}", usdOutput);

        DialogBuilder.buildOkDialog(
                this,
                this.getResources().getString(R.string.usd_amount_msg),
                Double.toString(usdOutput),
                false,
                null
        ).show();
    }
}