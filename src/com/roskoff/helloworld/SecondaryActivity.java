package com.roskoff.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondaryActivity extends Activity{
	
	private TextView et2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secondary);

		et2 = (TextView) findViewById(R.id.msjWelcome);
		
		Bundle bundle = getIntent().getExtras();
		String userName = bundle.getString("nomUser");
		String helloMsj = "Hello, ";
		String exlamationMark = "!";
		
		et2.setText(helloMsj + userName + exlamationMark);
	}
	
	public void returnMainApp(View view) {
        finish();
    }
}
