package com.cczw.demos.sjsb;

import com.example.sjsbtest.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import cn.cczw.sjsb.BaseActivity;

public class MainActivity extends BaseActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading);
		
		Handler handler=new Handler();  
		Runnable runnable=new Runnable() {
		    public void run() {  
		    	Intent intent = new Intent();
				intent.setClass(MainActivity.this, cn.cczw.sjsb.InflaterActivity.class);
				intent.putExtra("ptype", "web");
				intent.putExtra("config", "file:///android_asset/index.html");
				startActivity(intent);
				finish();
		    }  
		};  
        handler.postDelayed(runnable, 2000);
		
	}
}
