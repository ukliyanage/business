package com.example.mybusiness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddDebitor extends AppCompatActivity {

    EditText mName,mAmount,mPaid,mDue,mDate;
    String sName,sAmount,sPaid,sDue,sDate;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_debitor);

        Intent secondIntent = getIntent();

        mName = findViewById(R.id.adt);
        mAmount = findViewById(R.id.adt2);
        mPaid = findViewById(R.id.adt3);
        mDue = findViewById(R.id.adt4);
        mDate = findViewById(R.id.adt5);
        pressSave();
    }

    public void pressSave(){
        button1=(Button)findViewById(R.id.b2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(AddDebitor.this,debitor.class);

                sName = mName.getText().toString();
//                sAmount = sAmount.getBytes().toString();
                sPaid = mPaid.getText().toString();
                sDue = mDue.getText().toString();
                sDate = mDate.getText().toString();

                intent2.putExtra("Nameval",sName);
//                intent2.putExtra("Amountval",sAmount);
                intent2.putExtra("Paidval",sPaid);
                intent2.putExtra("Dueval",sDue);
                intent2.putExtra("Dateval",sDate);


                startActivity(intent2);
            }
        });

    }
    public void pressCancel(){

        Intent intent3 = new Intent(AddDebitor.this,MainActivity.class);
        startActivity(intent3);
    }

    public void Calender(View v1){

        Intent intent4 = new Intent(AddDebitor.this,Calender.class);
        startActivity(intent4);
    }
}
