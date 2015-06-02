package com.roskoff.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText et1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et1 = (EditText) findViewById(R.id.nameField);
	}

	public void setJobButtonNext(View view) {		
		if (!et1.getText().toString().equals("")){
			Intent i = new Intent(this, SecondaryActivity.class);
	        i.putExtra("nomUser", et1.getText().toString());
	        startActivity(i);	
		}
		else {
			Toast.makeText(MainActivity.this, "Enter user name", Toast.LENGTH_LONG).show();
			return;
		}    
    }
}
