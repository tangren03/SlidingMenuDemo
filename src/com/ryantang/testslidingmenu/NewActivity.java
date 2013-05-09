package com.ryantang.testslidingmenu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_page_layout);
		TextView textView = (TextView)this.findViewById(R.id.tv_text);
		textView.setText("This is a new activity!");
	}

}
