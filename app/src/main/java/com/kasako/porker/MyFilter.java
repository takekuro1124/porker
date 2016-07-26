package com.kasako.porker;

import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by eka on 2016/06/27.
 */
public class MyFilter implements InputFilter {
    private TextView view;
    public MyFilter(TextView v) {
        view = v;
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        // 関連付けられたTextViewのTextPaintと幅を取得
        TextPaint paint = view.getPaint();
        int width = view.getWidth() - view.getCompoundPaddingLeft()
                - view.getCompoundPaddingRight();

        StringBuilder sb = new StringBuilder();
        String[] str = source.toString().split("。");
        for(String s : str) {
            sb.append(s + "\n");
        }

        Log.d("TEST", sb.toString());

        CharSequence cs = sb.toString().subSequence(0, sb.length());
        // TextView#setText()から呼ばれるだけの前提なので dest 以降の引数は使わない
        SpannableStringBuilder result = new SpannableStringBuilder();
        for (int index = start; index < end; index++) {
            // 幅チェック
            if (Layout.getDesiredWidth(cs, start, index + 1, paint) > width) {
                // 行を越えた ⇒ ここまでを出力して改行を挿入
                result.append(cs.subSequence(start, index));
                result.append("\n");
                start = index;

            } else if (cs.charAt(index) == '\n') {
                // 改行文字 ⇒ ここまでを出力
                result.append(cs.subSequence(start, index));
                start = index;
            }
        }

        if (start < end) {
            // 残りを格納(最後の行)
            result.append(cs.subSequence(start, end));
        }
        return result;
    }
}
