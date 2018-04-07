package com.atguigu.l11_graphics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/*
	Matrix ，中文里叫矩阵，高等数学里有介绍，在图像处理方面，主要是用于平面的缩放、平移、旋转等操作
	
 */
public class MatrixTestActivity extends Activity {

	private EditText et_matrix_scale;
	private EditText et_matrix_rotate;
	private EditText et_matrix_translateX;
	private EditText et_matrix_translateY;
	
	private ImageView iv_matrix_icon;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_matrix);

		et_matrix_scale = (EditText) findViewById(R.id.et_matrix_scale);
		et_matrix_rotate = (EditText) findViewById(R.id.et_matrix_rotate);
		et_matrix_translateX = (EditText) findViewById(R.id.et_matrix_translateX);
		et_matrix_translateY = (EditText) findViewById(R.id.et_matrix_translateY);

		iv_matrix_icon = (ImageView) findViewById(R.id.iv_matrix_icon);
	}

	public void scaleBitmap(View view) {
	
	}

	public void rotateBitmap(View view) {
		
	}

	public void translateBitmap(View view) {

	}

	public void clearMatrix(View view) {
		
	}
}
