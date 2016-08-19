package com.boulio.tempchanger;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText FEditText;
    private TextView CTextView;
    private Button CalcButton;

    private SharedPreferences SavedValues;

    private String fehString = "";
    private String celString = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FEditText = (EditText) findViewById(R.id.FEditText);
        CTextView = (TextView) findViewById(R.id.CTextView);

        CalcButton = (Button) findViewById(R.id.calcButton);

        CalcButton.setOnClickListener(this);


    }




       private void showTemp(){

        fehString = FEditText.getText().toString();
        float fTemp;
        if(fehString.equals("")){
            fTemp = 0;
        }else{
            fTemp = Float.parseFloat(fehString);
        }
        float cTemp = (fTemp - 32) * 5/9;



           NumberFormat degrees = NumberFormat.getNumberInstance();

           CTextView.setText(degrees.format(cTemp));



    }





        @Override
        public void onClick(View view) {
            showTemp();
        }



}




