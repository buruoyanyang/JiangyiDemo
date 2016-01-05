package com.example.buruoyanyang.jiangyidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompleteTextViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view_test);
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.auto);
        MultiAutoCompleteTextView mauto = (MultiAutoCompleteTextView) findViewById(R.id.mauto);
        String[] books = new String[]
                {
                        "疯狂Java讲义",
                        "疯狂Ajax讲义",
                        "疯狂XML讲义",
                        "疯狂Workflow讲义"
                };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.simple_dropdown_item1_line,books);
        actv.setAdapter(adapter);
        mauto.setAdapter(adapter);
        mauto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
