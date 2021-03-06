package com.example.system.dialog.custom;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.system.R;


/**
 * 自定义的Dialog
 */
public class CustomDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        findViewById(R.id.custom_dialog_mian_button_01).setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = v.getId();
            if (i == R.id.custom_dialog_mian_button_01) {
                button_01();

            }
        }
    };

    private void button_01() {
        CustomDialog.Builder builder = new CustomDialog.Builder(this);
        builder.setTitle("提醒")
                .setContent("我是内容!")
                .setButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create()
                .show();
    }
}
