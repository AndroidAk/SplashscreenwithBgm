package com.androidtutorialpoint;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class HomePage extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		Intent svc=new Intent(this, Bgm.class);
        stopService(svc);
	}
	
	
	

}
