package com.shizhefei.indicatordemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.shizhefei.indicatordemo.guide.GuideActivity;
import com.shizhefei.indicatordemo.moretab.MoreTabActivity;
import com.shizhefei.indicatordemo.setting.SettingActivity;
import com.shizhefei.indicatordemo.slide.SlideMainActivity;
import com.shizhefei.indicatordemo.spring.SpringActivity;
import com.shizhefei.indicatordemo.tabmain.TabMainActivity;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	/**
	 * 引导界面
	 * 
	 * @param view
	 */
	public void onClickGuide(View view) {
		startActivity(new Intent(getApplicationContext(), GuideActivity.class));
	}

	/**
	 * tab主界面
	 * 
	 * @param view
	 */
	public void onClickTabMain(View view) {
		startActivity(new Intent(getApplicationContext(), TabMainActivity.class));
	}

	/**
	 * 滑动菜主界面
	 * 
	 * @param view
	 */
	public void onClickSlideMain(View view) {
		startActivity(new Intent(getApplicationContext(), SlideMainActivity.class));
	}

	/**
	 * 可滑动tab界面
	 * 
	 * @param view
	 */
	public void onClickSlideTab(View view) {
		startActivity(new Intent(getApplicationContext(), MoreTabActivity.class));
	}
	
	
	/**
	 * 可滑动tab界面
	 * 
	 * @param view
	 */
	public void onClickSpringTab(View view) {
		startActivity(new Intent(getApplicationContext(), SpringActivity.class));
	}
	
	

	/**
	 * 可滑动tab界面
	 * 
	 * @param view
	 */
	public void onClickSlideBar(View view) {
		startActivity(new Intent(getApplicationContext(), SettingActivity.class));
	}

}
