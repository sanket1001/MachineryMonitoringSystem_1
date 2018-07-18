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

public class Carding_1 extends AppCompatActivity {

    Button btnCM1;
    Button btnCM2;
    Button btnCM3;
    Button btnCM4;
    Button btnCM5;
    Button btnCM6;
    Button btnCM7;
    Button btnCM8;
    Button btnCM9;
    Button btnCMain;
    private FirebaseDatabase mFirebasedb;
    private DatabaseReference mRefdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carding_1);

        /*setting toolbar color*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarCard);
        myToolbar.setTitle("CARDING");
        setSupportActionBar(myToolbar);
        /*setting status bar color*/
        Window window = Carding_1.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(Carding_1.this,R.color.titleBackgroundColorMustard));

        btnCM1 = (Button) findViewById(R.id.btnCM1);
        btnCM2 = (Button) findViewById(R.id.btnCM2);
        btnCM3 = (Button) findViewById(R.id.btnCM3);
        btnCM4 = (Button) findViewById(R.id.btnCM4);
        btnCM5 = (Button) findViewById(R.id.btnCM5);
        btnCM6 = (Button) findViewById(R.id.btnCM6);
        btnCM7 = (Button) findViewById(R.id.btnCM7);
        btnCM8 = (Button) findViewById(R.id.btnCM8);
        btnCM9 = (Button) findViewById(R.id.btnCM9);
        btnCMain = (Button) findViewById(R.id.btnCMain);

        btnCMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tempIntent = new Intent(Carding_1.this, DepartmentSelect_1.class);
                startActivity(tempIntent);
            }
        });

        mFirebasedb = FirebaseDatabase.getInstance();
        mRefdb = mFirebasedb.getReference().child("CARDING");

        DatabaseReference temp1 = mRefdb.child("MACHINE_NO_1").child("msg");
        ValueEventListener templis1 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnCM1.setText("MACHINE_NO_1 (" + dataSnapshot.getValue() + ")");
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
                btnCM2.setText("MACHINE_NO_2 (" + dataSnapshot.getValue() + ")");
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
                btnCM3.setText("MACHINE_NO_3 (" + dataSnapshot.getValue() + ")");
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
                btnCM4.setText("MACHINE_NO_4 (" + dataSnapshot.getValue() + ")");
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
                btnCM5.setText("MACHINE_NO_5 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp5.addValueEventListener(templis5);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp6 = mRefdb.child("MACHINE_NO_5").child("msg");
        ValueEventListener templis6 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnCM6.setText("MACHINE_NO_6 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp6.addValueEventListener(templis6);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp7 = mRefdb.child("MACHINE_NO_5").child("msg");
        ValueEventListener templis7 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnCM7.setText("MACHINE_NO_7 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp7.addValueEventListener(templis7);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp8 = mRefdb.child("MACHINE_NO_8").child("msg");
        ValueEventListener templis8 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnCM8.setText("MACHINE_NO_8 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp8.addValueEventListener(templis8);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp9 = mRefdb.child("MACHINE_NO_9").child("msg");
        ValueEventListener templis9 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnCM9.setText("MACHINE_NO_9 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp9.addValueEventListener(templis9);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp11 = mRefdb.child("MACHINE_NO_1").child("color");
        ValueEventListener templis11 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnCM1.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
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
                btnCM2.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
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
                btnCM3.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
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
                btnCM4.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
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
                btnCM5.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
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
                btnCM6.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp16.addValueEventListener(templis16);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp17 = mRefdb.child("MACHINE_NO_7").child("color");
        ValueEventListener templis17 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnCM7.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp17.addValueEventListener(templis17);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp18 = mRefdb.child("MACHINE_NO_8").child("color");
        ValueEventListener templis18 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnCM8.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp18.addValueEventListener(templis18);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp19 = mRefdb.child("MACHINE_NO_9").child("color");
        ValueEventListener templis19 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnCM9.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp19.addValueEventListener(templis19);
        //---------------------------------------------------------------------------------------------------


    }

    public void onClickCard(View v)
    {
        String mno="";
        switch (v.getId())
        {
            case R.id.btnCM1:
                mno="MACHINE_NO_1";
                break;
            case R.id.btnCM2:
                mno="MACHINE_NO_2";
                break;
            case R.id.btnCM3:
                mno="MACHINE_NO_3";
                break;
            case R.id.btnCM4:
                mno="MACHINE_NO_4";
                break;
            case R.id.btnCM5:
                mno="MACHINE_NO_5";
                break;
            case R.id.btnCM6:
                mno="MACHINE_NO_6";
                break;
            case R.id.btnCM7:
                mno="MACHINE_NO_7";
                break;
            case R.id.btnCM8:
                mno="MACHINE_NO_8";
                break;
            case R.id.btnCM9:
                mno="MACHINE_NO_9";
                break;



        }
        Intent intent=new Intent(Carding_1.this, StoppageReport_1.class);
        intent.putExtra("machine",""+mno);
        intent.putExtra("deptInfo","CARDING");
        startActivity(intent);


    }
}
