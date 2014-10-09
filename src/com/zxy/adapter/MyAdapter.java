package com.zxy.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

	private List<Fragment> data ;
	public MyAdapter(FragmentManager fm , List<Fragment> data) {
		super(fm);
		this.data = data ;
	}
	
	@Override
	public Fragment getItem(int arg0) {
		return data.get(arg0);
	}
	@Override
	public int getCount() {
		return data.size();
	}

}
