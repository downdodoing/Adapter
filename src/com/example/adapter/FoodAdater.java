package com.example.adapter;

import android.util.Log;

import com.example.adapter.myinterface.Hundun;

public class FoodAdater extends ShuiJiao implements Hundun {

	@Override
	public void makeHundun() {
		super.makeShuiJiao();
		Log.i("FoodAdater", "混沌和水饺一样是以面包馅的食品");
	}

}
