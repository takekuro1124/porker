package com.kasako.porker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;
import android.widget.TextView;

public class MakeRoom extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_room);

        //部屋名。
        TextView textView=(TextView)findViewById(R.id.editText1);
        textView.setTextColor(Color.BLACK);

        //パスワードは・・・で表示する。
        EditText editText=(EditText)findViewById(R.id.editText2);
        editText.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        TextView textView1=(TextView)findViewById(R.id.editText2);
        textView1.setTextColor(Color.BLACK);
    }
}