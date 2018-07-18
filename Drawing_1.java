package ps1.rishabh.com.machinerymonitoringsystem;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Drawing_1 extends AppCompatActivity {

    Button btnDMain;
    Button btnDM1;
    Button btnDM2;
    Button btnDM3;
    Button btnDM4;
    Button btnDM5;
    Button btnDM6;
    private FirebaseDatabase mFirebasedb;
    private DatabaseReference mRefdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing_1);

        /*setting toolbar color*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarDraw);
        myToolbar.setTitle("DRAWNIG");
        setSupportActionBar(myToolbar);
        /*setting status bar color*/
        Window window = Drawing_1.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(Drawing_1.this,R.color.titleBackgroundColorMustard));

        btnDM1 = (Button) findViewById(R.id.btnDM1);
        btnDM2 = (Button) findViewById(R.id.btnDM2);
        btnDM3 = (Button) findViewById(R.id.btnDM3);
        btnDM4 = (Button) findViewById(R.id.btnDM4);
        btnDM5 = (Button) findViewById(R.id.btnDM5);
        btnDM6 = (Button) findViewById(R.id.btnDM6);
        btnDMain = (Button) findViewById(R.id.btnDMain);

        btnDMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tempIntent = new Intent(Drawing_1.this, DepartmentSelect_1.class);
                startActivity(tempIntent);
            }
        });

        mFirebasedb = FirebaseDatabase.getInstance();
        mRefdb = mFirebasedb.getReference().child("DRAWING");

        DatabaseReference temp1 = mRefdb.child("MACHINE_NO_1").child("msg");
        ValueEventListener templis1 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM1.setText("MACHINE_NO_1 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp1.addValueEventListener(templis1);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp2 = mRefdb.child("MACHINE_NO_2").child("msg");
        ValueEventListener templis2 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM2.setText("MACHINE_NO_2 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp2.addValueEventListener(templis2);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp3 = mRefdb.child("MACHINE_NO_3").child("msg");
        ValueEventListener templis3 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM3.setText("MACHINE_NO_3 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp3.addValueEventListener(templis3);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp4 = mRefdb.child("MACHINE_NO_4").child("msg");
        ValueEventListener templis4 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM4.setText("MACHINE_NO_4 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp4.addValueEventListener(templis4);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp5 = mRefdb.child("MACHINE_NO_5").child("msg");
        ValueEventListener templis5 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM5.setText("MACHINE_NO_5 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp5.addValueEventListener(templis5);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp6 = mRefdb.child("MACHINE_NO_6").child("msg");
        ValueEventListener templis6 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM6.setText("MACHINE_NO_6 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp6.addValueEventListener(templis6);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp11 = mRefdb.child("MACHINE_NO_1").child("color");
        ValueEventListener templis11 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM1.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp11.addValueEventListener(templis11);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp12 = mRefdb.child("MACHINE_NO_2").child("color");
        ValueEventListener templis12 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM2.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp12.addValueEventListener(templis12);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp13 = mRefdb.child("MACHINE_NO_3").child("color");
        ValueEventListener templis13 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM3.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp13.addValueEventListener(templis13);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp14 = mRefdb.child("MACHINE_NO_4").child("color");
        ValueEventListener templis14 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM4.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp14.addValueEventListener(templis14);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp15 = mRefdb.child("MACHINE_NO_5").child("color");
        ValueEventListener templis15 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM5.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp15.addValueEventListener(templis15);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp16 = mRefdb.child("MACHINE_NO_6").child("color");
        ValueEventListener templis16 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnDM6.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp16.addValueEventListener(templis16);
        //---------------------------------------------------------------------------------------------------





    }

    public void onClickDraw(View v)
    {
        String mno="";
        switch (v.getId())
        {
            case R.id.btnDM1:
                mno="MACHINE_NO_1";
                break;
            case R.id.btnDM2:
                mno="MACHINE_NO_2";
                break;
            case R.id.btnDM3:
                mno="MACHINE_NO_3";
                break;
            case R.id.btnDM4:
                mno="MACHINE_NO_4";
                break;
            case R.id.btnDM5:
                mno="MACHINE_NO_5";
                break;
            case R.id.btnDM6:
                mno="MACHINE_NO_6";
                break;


        }
        Intent intent=new Intent(Drawing_1.this, StoppageReport_1.class);
        intent.putExtra("machine",""+mno);
        intent.putExtra("deptInfo","DRAWING");
        startActivity(intent);


    }

}
