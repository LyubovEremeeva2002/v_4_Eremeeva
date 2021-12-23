package com.example.variant4;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class contacts extends Activity implements OnClickListener {

    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        btnCall =  findViewById(R.id.btnCall);
    }

    @Override
    public void onClick (View v){
        Intent i  = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:12345"));
        startActivity(i);
    }
}