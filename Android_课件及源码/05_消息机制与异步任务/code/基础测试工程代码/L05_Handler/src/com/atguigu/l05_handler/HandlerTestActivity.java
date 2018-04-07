package com.atguigu.l05_handler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;


public class HandlerTestActivity extends Activity {

	private ProgressBar pb_handler1_loading;
	private EditText et_handler1_result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_handler_test);

		pb_handler1_loading = (ProgressBar) findViewById(R.id.pb_handler1_loading);
		et_handler1_result = (EditText) findViewById(R.id.et_handler1_result);
	}

	public void getSubmit1(View v) {
		
	}
	
	public void getSubmit2(View v) {
		
	}
}
