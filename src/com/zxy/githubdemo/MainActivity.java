package com.zxy.githubdemo;

import java.util.ArrayList;
import java.util.List;

import com.zxy.adapter.MyAdapter;
import com.zxy.fragment.LQJFragment;
import com.zxy.fragment.LXFragment;
import com.zxy.fragment.WYPFragment;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

	private ViewPager viewPager ;
	private FragmentManager fm ;
	private Fragment wyp , lx , lqj ;
	private List<Fragment> data ;
	private MyAdapter adapter ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_layout);
		initComponent();
		initData();
		setListener();
	}

	private void initComponent() {
		viewPager = (ViewPager) findViewById(R.id.viewPager);
	}

	private void initData() {
		fm = getSupportFragmentManager() ;
		data = new ArrayList<Fragment>();
		wyp = new WYPFragment();
		lx = new LXFragment();
		lqj = new LQJFragment() ;
		data.add(wyp);
		data.add(lqj);
		data.add(lx);
		adapter = new MyAdapter(fm, data);
		viewPager.setAdapter(adapter);
	}

	private void setListener() {
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
