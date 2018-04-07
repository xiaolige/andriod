package com.atguigu.l08_br;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * 测试BroadcastReceiver的主界面
 * @author 张晓飞
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	/*
	 * 注册广播接收器
	 */
	public void registBR(View v) {
		
	}
	
	/*
	 * 解注册广播接收器
	 */
	public void unRegistBR(View v) {
		
	}
}
