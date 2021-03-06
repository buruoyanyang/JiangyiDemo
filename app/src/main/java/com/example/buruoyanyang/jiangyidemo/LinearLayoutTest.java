package com.example.buruoyanyang.jiangyidemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class LinearLayoutTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_test);
        ListView listView = (ListView) findViewById(R.id.myList);
        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                //指定包含40个选项
                return 40;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            //重写该方法,该方法的返回值将作为列表项的ID
            @Override
            public long getItemId(int position) {
                return position;
            }

            //重写该方法,该方法的返回的View将作为列表框
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                //创建一个LinearLayout,并向其中添加两个组件
                LinearLayout linearLayout = new LinearLayout(LinearLayoutTest.this);
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
                ImageView image = new ImageView(LinearLayoutTest.this);
                image.setImageResource(R.drawable.qingzhao);
                image.setScaleType(ImageView.ScaleType.FIT_CENTER);
                TextView textView = new TextView(LinearLayoutTest.this);
                textView.setText("第" + (position + 1) + "个列表项");
                textView.setTextSize(20);
                textView.setTextColor(Color.RED);
                linearLayout.addView(image);
                linearLayout.addView(textView);
                return linearLayout;
            }
        };
        listView.setAdapter(adapter);
    }
}
