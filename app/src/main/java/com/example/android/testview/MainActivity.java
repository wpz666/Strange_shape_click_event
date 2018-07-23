package com.example.android.testview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private Toast mToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.MyImage_earth).setOnClickListener(this);
        findViewById(R.id.MyImage_transfer).setOnClickListener(this);
        findViewById(R.id.MyImage_exchange).setOnClickListener(this);
        findViewById(R.id.MyImage_recharge).setOnClickListener(this);
        findViewById(R.id.MyImage_withdraw).setOnClickListener(this);
        findViewById(R.id.MyImage_hk).setOnClickListener(this);
        findViewById(R.id.MyImage_hl).setOnClickListener(this);
//        findViewById( R.id.menu_1).setOnClickListener( this);
//        findViewById( R.id.menu_2).setOnClickListener( this);
//        findViewById( R.id.menu_3).setOnClickListener( this);
//        findViewById( R.id.menu_4).setOnClickListener( this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.MyImage_earth:
                break;
            case R.id.MyImage_transfer:
                Toast.makeText(this, "点击了转账", Toast.LENGTH_SHORT).show();
                break;
            case R.id.MyImage_exchange:
                Toast.makeText(this, "点击了换汇", Toast.LENGTH_SHORT).show();
                break;
            case R.id.MyImage_recharge:
                Toast.makeText(this, "点击了充值", Toast.LENGTH_SHORT).show();
                break;
            case R.id.MyImage_withdraw:
                Toast.makeText(this, "点击了提现", Toast.LENGTH_SHORT).show();
                break;
            case R.id.MyImage_hk:
                Toast.makeText(this, "点击了汇款", Toast.LENGTH_SHORT).show();
                break;
            case R.id.MyImage_hl:
                Toast.makeText(this, "点击了汇率", Toast.LENGTH_SHORT).show();
                break;
        }
//        if(null != mToast) {
//            mToast.cancel();
//        }
//        switch(v.getId()) {
//            case R.id.menu_1:
//                mToast = Toast.makeText( this, "red", Toast.LENGTH_SHORT);
//                break;
//            case R.id.menu_2:
//                mToast = Toast.makeText( this, "yellow", Toast.LENGTH_SHORT);
//                break;
//            case R.id.menu_3:
//                mToast = Toast.makeText( this, "green", Toast.LENGTH_SHORT);
//                break;
//            case R.id.menu_4:
//                mToast = Toast.makeText( this, "blue", Toast.LENGTH_SHORT);
//                break;
//        }
//        mToast.show();
    }
}
