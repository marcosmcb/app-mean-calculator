package com.example.marcoscavalcante.appmeancalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MeanActivity extends AppCompatActivity {

    private EditText grade1;
    private EditText grade2;
    private EditText grade3;
    private Button btnCalculate;
    private TextView finalMean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mean);

        grade1 = (EditText) findViewById( R.id.txtGrade1 );
        grade2 = (EditText) findViewById( R.id.txtGrade2 );
        grade3 = (EditText) findViewById( R.id.txtGrade3 );
        btnCalculate = (Button) findViewById( R.id.btnCalculate );
        finalMean = (TextView) findViewById(R.id.txtFinalMean);

        btnCalculate.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Double g1 = Double.valueOf( grade1.getText().toString() );
                Double g2 = Double.valueOf( grade2.getText().toString() );
                Double g3 = Double.valueOf( grade3.getText().toString() );
                Double mean = (g1+g2+g3) / 3;
                finalMean.setText(  mean.toString() );
            }
        });
    }



}
