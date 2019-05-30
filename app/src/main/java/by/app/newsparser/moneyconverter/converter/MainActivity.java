package by.app.newsparser.moneyconverter.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onButtonClickUsd(View v) {
        EditText el1 = (EditText) findViewById(R.id.num1);
        TextView result = (TextView) findViewById(R.id.result);

        double num1 = Double.parseDouble(el1.getText().toString());
        double resSum = num1 / 2.08;
        result.setText(Double.toString(resSum));

    }

    public void onButtonClickRub(View v) {
        EditText el1 = (EditText) findViewById(R.id.num1);
        TextView result = (TextView) findViewById(R.id.result);

        double num1 = Double.parseDouble(el1.getText().toString());
        double resSum = num1 * 31.21;
        result.setText(Double.toString(resSum));

    }
    public void onButtonClickEur(View v) {
        EditText el1 = (EditText) findViewById(R.id.num1);
        TextView result = (TextView) findViewById(R.id.result);

        double num1 = Double.parseDouble(el1.getText().toString());
        double resSum = num1 / 2.31;
        result.setText(Double.toString(resSum));

    }



}
