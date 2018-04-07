package com.atguigu.l10_animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/*
 * 编码实现View Animation
 * 	1. Code方式
 *  2. Xml方式
 */
public class VAActivity extends Activity {

	private ImageView iv_animation;
	private TextView tv_animation_msg;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animation_va);
	
		iv_animation = (ImageView) findViewById(R.id.iv_animation);
		tv_animation_msg = (TextView) findViewById(R.id.tv_animation_msg);
	}

	/*
	 * 1.1  编码实现: 缩放动画 
	 * ScaleAnimation
	 */
	public void startCodeScale(View v) {
		tv_animation_msg.setText("Code缩放动画: 宽度从0.5到1.5, 高度从0.0到1.0, 缩放的圆心为顶部中心点,延迟1s开始,持续2s,最终还原");
	}

	/*
	 * 1.2 xml实现: 缩放动画 
	 * <scale>
	 */
	public void startXmlScale(View v) {
		tv_animation_msg.setText("Xml缩放动画: Xml缩放动画: 宽度从0.0到1.5, 高度从0.0到1.0, 延迟1s开始,持续3s,圆心为左上角, 最终固定");
	}

	/*
	 * 2.1 编码实现: 旋转动画 
	 * RotateAnimation
	 */
	public void startCodeRotate(View v) {
		tv_animation_msg.setText("Code旋转动画: 以图片中心点为中心, 从负90度到正90度, 持续5s");
	}

	/*
	 * 2.2 xml实现: 旋转动画 
	 * <rotate>
	 */
	public void startXmlRotate(View v) {
		tv_animation_msg.setText("Xml旋转动画: 以左顶点为坐标, 从正90度到负90度, 持续5s"); 
	}

	/*
	 * 3.1 编码实现: 透明度动画 
	 * AlphaAnimation
	 */
	public void startCodeAlpha(View v) {
		tv_animation_msg.setText("Code透明度动画: 从完全透明到完全不透明, 持续2s");  
	}

	/*
	 * 3.2 xml实现: 透明度动画 
	 * <alpha>
	 */
	public void startXmlAlpha(View v) {
		tv_animation_msg.setText("Xml透明度动画: 从完全不透明到完全透明, 持续1s");
	}

	
	/*
	 * 4.1 编码实现: 平衡动画 
	 * TranslateAnimation
	 */
	public void startCodeTranslate(View v) {
		tv_animation_msg.setText("Code移动动画: 向右移动一个自己的宽度, 向下移动一个自己的高度, 持续2s");
	}

	/*
	 * 4.2 xml实现: 平衡动画 
	 * <translate>
	 */
	public void startXmlTranslate(View v) {
		tv_animation_msg.setText("xml移动动画: 从屏幕的右边逐渐回到原来的位置, 持续2s"); //***此效果用于界面切换的动画效果
	}

	/*
	 * 5.1 编码实现: 复合动画 
	 * AnimationSet
	 */
	public void startCodeAnimationSet(View v) {
		tv_animation_msg.setText("Code复合动画: 透明度从透明到不透明, 持续2s, 接着进行旋转360度的动画, 持续1s");
	}

	/*
	 * 5.2  xml实现: 复合动画 
	 * <set>
	 */
	public void startXmlAnimationSet(View v) {
		tv_animation_msg.setText("Xml复合动画: 透明度从透明到不透明, 持续2s, 接着进行旋转360度的动画, 持续2s");
	}
	
	/*
	 * 6. 测试动画监听
	 */
	public void testAnimationListener(View v) {
		tv_animation_msg.setText("测试动画监听");
	}
}