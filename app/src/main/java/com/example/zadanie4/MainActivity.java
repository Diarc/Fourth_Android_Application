package com.example.zadanie4;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);

        /**
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button addButton = findViewById(R.id.AddButton);
        Button minusButton = findViewById(R.id.MinusButton);
        Button divisionButton = findViewById(R.id.DivisionButton);
        Button multiButton = findViewById(R.id.MultiButton);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Edit field is empty.", Toast.LENGTH_SHORT).show();
                }
                else{

                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 0;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 1;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 2;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 3;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 4;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 5;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 6;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 7;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 8;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 9;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_SHORT).show();
                editText.getText().clear();
            }
        });
    }

    */
    }
    private void updateText(String strToAdd){
        String oldStr = editText.getText().toString();
        int cursorPos = editText.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if(getString(R.string.editText).equals(editText.getText().toString())){
            editText.setText(strToAdd);
        }
        else{
            editText.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
            editText.setSelection(cursorPos + 1);
        }
    }

    public void EqualButton(View view){
        String userExp = editText.getText().toString();

        Expression exp = new Expression(userExp);

        String result = String.valueOf(exp.calculate());

        editText.setText(result);
        editText.setSelection(result.length());
    }

    public void button11(View view){
        Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_SHORT).show();
        editText.getText().clear();
    }

    public void button1(View view){
        updateText("0");
    }

    public void button2(View view){
        updateText("1");
    }

    public void button3(View view){
        updateText("2");
    }

    public void button4(View view){
        updateText("3");
    }

    public void button5(View view){
        updateText("4");
    }

    public void button6(View view){
        updateText("5");
    }

    public void button7(View view){
        updateText("6");
    }

    public void button8(View view){
        updateText("7");
    }

    public void button9(View view){
        updateText("8");
    }

    public void button10(View view){
        updateText("9");
    }

    public void AddButton(View view){
        updateText("+");
    }

    public void MinusButton(View view){
        updateText("-");
    }

    public void DivisionButton(View view){
        updateText("/");
    }

    public void MultiButton(View view){
        updateText("*");
    }

}