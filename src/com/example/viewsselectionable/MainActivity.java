package com.example.viewsselectionable;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity  implements OnItemClickListener{
	TextView txt;
	ListView list;
	String datos[];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txt = (TextView) findViewById(R.id.txt);
		list=(ListView) findViewById(R.id.list);
		
		list.setOnItemClickListener(this);
		
		datos=getResources().getStringArray(R.array.nombres);
		
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		txt.setText(datos[arg2]);
		
	}
}
