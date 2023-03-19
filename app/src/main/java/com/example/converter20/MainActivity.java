package com.example.converter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.example.converter20.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    public void TextCOnCLick(View view)
    {

        EditText editTextC = findViewById(R.id.Celsius);
        EditText editTextF = findViewById(R.id.Fahrenheit);
        EditText editTextCal = findViewById(R.id.Kelvin);
        EditText editTextRan = findViewById(R.id.Rankin);
        EditText editTextRe = findViewById(R.id.Reumure);
        if (editTextC.getText().toString().equals(""))
        {
            editTextC.setText("0");
        }
        String inputInString = editTextC.getText().toString();
        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInFahrenheit = (inputInDouble*9/5)+32;
        Double outputInKelvin = inputInDouble + 273.15;
        Double outputInRe = inputInDouble / 0.8;
        Double outputRan = (inputInDouble + 273.15) * 9/5;
        editTextF.setText(outputInFahrenheit.toString());
        editTextCal.setText(outputInKelvin.toString());
        editTextRan.setText(outputRan.toString());
        editTextRe.setText(outputInRe.toString());
    }
    public void TextFOnClick(View view)
    {
        EditText editTextC = findViewById(R.id.Celsius);
        EditText editTextF = findViewById(R.id.Fahrenheit);
        EditText editTextCal = findViewById(R.id.Kelvin);
        EditText editTextRan = findViewById(R.id.Rankin);
        EditText editTextRe = findViewById(R.id.Reumure);
        if (editTextF.getText().toString().equals(""))
        {
            editTextF.setText("0");
        }
        String inputInString = editTextF.getText().toString();
        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInCelsius = (inputInDouble - 32) * 5/9;
        Double outputInKelvin = inputInDouble + 273.15;
        Double outputInRe = inputInDouble / 0.8;
        Double outputRan = (inputInDouble + 273.15) * 9/5;
        editTextCal.setText(outputInKelvin.toString());
        editTextRan.setText(outputRan.toString());
        editTextRe.setText(outputInRe.toString());
        editTextC.setText(outputInCelsius.toString());
    }
    public void TextFCalOnClick(View view)
    {
        EditText editTextC = findViewById(R.id.Celsius);
        EditText editTextF = findViewById(R.id.Fahrenheit);
        EditText editTextCal = findViewById(R.id.Kelvin);
        EditText editTextRan = findViewById(R.id.Rankin);
        EditText editTextRe = findViewById(R.id.Reumure);
        if (editTextCal.getText().toString().equals(""))
        {
            editTextCal.setText("0");
        }
        String inputInString = editTextCal.getText().toString();
        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInCelsius = inputInDouble - 273.15;
        Double outputInFahrenheit = (outputInCelsius*9/5)+32;
        Double outputInRe = outputInCelsius / 0.8;
        Double outputRan = (outputInCelsius + 273.15) * 9/5;
        editTextRan.setText(outputRan.toString());
        editTextRe.setText(outputInRe.toString());
        editTextC.setText(outputInCelsius.toString());
        editTextF.setText(outputInFahrenheit.toString());
    }
    public void TextReOnClick(View view)
    {
        EditText editTextC = findViewById(R.id.Celsius);
        EditText editTextF = findViewById(R.id.Fahrenheit);
        EditText editTextCal = findViewById(R.id.Kelvin);
        EditText editTextRan = findViewById(R.id.Rankin);
        EditText editTextRe = findViewById(R.id.Reumure);
        if (editTextRe.getText().toString().equals(""))
        {
            editTextRe.setText("0");
        }
        String inputInString = editTextRe.getText().toString();
        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInCelsius = inputInDouble * 5/4;
        Double outputInFahrenheit = (outputInCelsius*9/5)+32;
        Double outputRan = (outputInCelsius + 273.15) * 9/5;
        Double outputInKelvin = inputInDouble + 273.15;
        editTextRan.setText(outputRan.toString());
        editTextC.setText(outputInCelsius.toString());
        editTextF.setText(outputInFahrenheit.toString());
        editTextCal.setText(outputInKelvin.toString());
    }public void TextRanOnClick(View view)
    {

        EditText editTextC = findViewById(R.id.Celsius);
        EditText editTextF = findViewById(R.id.Fahrenheit);
        EditText editTextCal = findViewById(R.id.Kelvin);
        EditText editTextRan = findViewById(R.id.Rankin);
        EditText editTextRe = findViewById(R.id.Reumure);
        if (editTextRan.getText().toString().equals(""))
        {
            editTextRan.setText("0");
        }
            String inputInString = editTextRan.getText().toString();
            Double inputInDouble = Double.parseDouble(inputInString);
            Double outputInCelsius = inputInDouble * 5 / 9 - 273.15;
            Double outputInFahrenheit = (outputInCelsius * 9 / 5) + 32;
            Double outputInRe = outputInCelsius / 0.8;
            Double outputInKelvin = outputInCelsius + 273.15;
            editTextRe.setText(outputInRe.toString());
            editTextC.setText(outputInCelsius.toString());
            editTextF.setText(outputInFahrenheit.toString());
            editTextCal.setText(outputInKelvin.toString());



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.Celsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
