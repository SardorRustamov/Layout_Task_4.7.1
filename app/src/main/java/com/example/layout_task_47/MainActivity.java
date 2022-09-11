package com.example.layout_task_47;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        func_1();
        func_2();
        addTextChangedListener_T();
        setOnKeyL();
    }

    private void setOnKeyL() {
        EditText setOnKeyListener_id = findViewById(R.id.setOnKeyListener_id);
        TextView addTextChangedListener_textview = findViewById(R.id.addTextChangedListener_textview);

        setOnKeyListener_id.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                String s = setOnKeyListener_id.getText().toString();
                addTextChangedListener_textview.setText(s);

                return false;
            }
        });
    }

    private void addTextChangedListener_T() {

        EditText addTextChangedListener_id = findViewById(R.id.addTextChangedListener_id);
        TextView addTextChangedListener_textview = findViewById(R.id.addTextChangedListener_textview);

        addTextChangedListener_id.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String s = addTextChangedListener_id.getText().toString();
                addTextChangedListener_textview.setText(s);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    private void func_2() {
        int count_1, count_2;
        TextView textView_1 = findViewById(R.id.text_view);
        String text1= " I would #like to do #something similar to the #Twitter app ";

        Spannable spannable = new SpannableString(text1);

        count_1 = text1.indexOf('#');
        count_2 = text1.indexOf(" ", count_1);
        spannable.setSpan( new ForegroundColorSpan(Color.GREEN), count_1, count_2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        count_1 = text1.indexOf('#', count_2);
        count_2 = text1.indexOf(" ", count_1);
        spannable.setSpan( new ForegroundColorSpan(Color.GREEN), count_1, count_2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        count_1 = text1.indexOf('#', count_2);
        count_2 = text1.indexOf(" ", count_1);
        spannable.setSpan( new ForegroundColorSpan(Color.GREEN), count_1, count_2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView_1.setText(spannable);
    }

    private void func_1() {
        int count_1, count_2;
        TextView textView_2 = findViewById(R.id.text_view_2);
        String text1= " I would like to do something similar to the https://twitter.com app ";

        count_1 = text1.indexOf("http");
        count_2 = text1.indexOf(" ", count_1);

        Spannable spannable = new SpannableString(text1);
        spannable.setSpan( new ForegroundColorSpan(Color.BLUE), count_1, count_2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView_2.setText(spannable);
    }
}