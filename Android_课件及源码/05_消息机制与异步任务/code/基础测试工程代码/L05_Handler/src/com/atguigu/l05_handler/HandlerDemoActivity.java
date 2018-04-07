package com.atguigu.l05_handler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class HandlerDemoActivity extends Activity implements OnClickListener {

	private TextView tv_demo_number;
	private Button btn_demo_increase;
	private Button btn_demo_decrease;
	private Button btn_demo_pause;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_handler_demo);
		init();
	}

	private void init() {
		tv_demo_number = (TextView) findViewById(R.id.tv_demo_number);
		btn_demo_increase = (Button) findViewById(R.id.btn_demo_increase);
		btn_demo_decrease = (Button) findViewById(R.id.btn_demo_decrease);
		btn_demo_pause = (Button) findViewById(R.id.btn_demo_pause);
		
		btn_demo_increase.setOnClickListener(this);
		btn_demo_decrease.setOnClickListener(this);
		btn_demo_pause.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v==btn_demo_increase) {//自动增加  what =1
			
		} else if(v==btn_demo_decrease) {//自动减少 what=2
			
		} else if(v==btn_demo_pause) {//暂停
			
		}
	}
}
