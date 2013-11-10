package com.example.spreadsheetdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gdata.client.authn.*;
import com.google.gdata.client.spreadsheet.*;
import com.google.gdata.data.*;
import com.google.gdata.data.batch.*;
import com.google.gdata.data.spreadsheet.*;
import com.google.gdata.util.*;

public class MainActivity extends Activity {
	SpreadsheetService service;
	String serviceName;
    String urlString = "https://spreadsheets.google.com/feeds/list/0AsaDhyyXNaFSdDJ2VUxtVGVWN1Yza1loU1RPVVU3OFE/default/public/values";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	serviceName = "SpreadsheetDemo";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        service = new SpreadsheetService(serviceName);
    }

    
/*    button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	final EditText x = (EditText) findViewById(R.id.xEditText);
            final EditText y = (EditText) findViewById(R.id.yEditText);
            final EditText content = (EditText) findViewById(R.id.contentEditText);
            final Button button = (Button) findViewById(R.id.insertButton);
        	
        }
    }*/

    public void insert(View view){
    	final EditText key = (EditText) findViewById(R.id.xEditText);
        final EditText value = (EditText) findViewById(R.id.yEditText);
        //final EditText content = (EditText) findViewById(R.id.contentEditText);
        
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
