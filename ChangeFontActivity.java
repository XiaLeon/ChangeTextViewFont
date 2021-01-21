package com.example.memorydemo.aty;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.memorydemo.R;

public class ChangeFontActivity extends Activity implements View.OnClickListener {
    private TextView textViewFont;

    @Override
    protected void onCreate(Bundle onSavedInstance) {
        super.onCreate(onSavedInstance);
        setContentView(R.layout.change_textview_font);

        textViewFont = findViewById(R.id.textViewFont);
        Button btnChangeFont = findViewById(R.id.buttonChangeFont);
        Button btnAmplify = findViewById(R.id.buttonAmplify);
        btnChangeFont.setOnClickListener(this);
        btnAmplify.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonChangeFont:

                // 这里我是从Android framework目录下随便挑了一种字体
                textViewFont.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/BitMDL2.ttf"));

                // 直接将 ttf 文件放在 assets 目录下也是可以的
                // textViewFont.setTypeface(Typeface.createFromAsset(getAssets(), "BitMDL2.ttf"));
                break;

            case R.id.buttonAmplify:
                // 布局里面默认大小是 12 SP，这里将字体大小设置为 24 SP，方便看效果
                textViewFont.setTextSize(24);


                break;

            default:
                break;
        }
    }
}
