package com.atguigu.l09_resolver;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
/**
 * 测试使用ContentResolver调用ContentProvider的主界面
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
	 * 通过ContentResolver调用ContentProvider插入一条记录
	 */
	public void insert(View v) {
	}

	/*
	 * 通过ContentResolver调用ContentProvider更新一条记录
	 */
	public void update(View v) {
	}

	/*
	 * 通过ContentResolver调用ContentProvider删除一条记录
	 */
	public void delete(View v) {
	}

	/*
	 * 通过ContentResolver调用ContentProvider查询所有记录
	 */
	public void query(View v) {
	}
}
