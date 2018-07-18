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

public class Ringframe_1 extends AppCompatActivity {
    Button btnM15;
    Button btnM16;
    Button btnM17;
    Button btnM18;
    Button btnM19;
    Button btnM20;
    Button btnM21;
    Button btnM22;
    Button btnM23;
    Button btnM24;
    Button btnM25;
    Button btnM26;
    Button btnM27;
    Button btnM28;
    Button btnMain;
    private FirebaseDatabase mFirebasedb;
    private DatabaseReference mRefdb;
    Toolbar toolRing;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ringframe_1);


        /*setting toolbar color*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarRing);
        myToolbar.setTitle("RINGFRAME");
        setSupportActionBar(myToolbar);

        /*setting status bar color*/
        Window window = Ringframe_1.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(Ringframe_1.this,R.color.titleBackgroundColorMustard));

        btnM15 = (Button) findViewById(R.id.btnM15);
        btnM16 = (Button) findViewById(R.id.btnM16);
        btnM17 = (Button) findViewById(R.id.btnM17);
        btnM18 = (Button) findViewById(R.id.btnM18);
        btnM19 = (Button) findViewById(R.id.btnM19);
        btnM20 = (Button) findViewById(R.id.btnM20);
        btnM21 = (Button) findViewById(R.id.btnM21);
        btnM22 = (Button) findViewById(R.id.btnM22);
        btnM23 = (Button) findViewById(R.id.btnM23);
        btnM24 = (Button) findViewById(R.id.btnM24);
        btnM25 = (Button) findViewById(R.id.btnM25);
        btnM26 = (Button) findViewById(R.id.btnM26);
        btnM27 = (Button) findViewById(R.id.btnM27);
        btnM28 = (Button) findViewById(R.id.btnM28);
        btnMain = (Button) findViewById(R.id.btnMain);
        toolRing = (Toolbar) findViewById(R.id.toolbarRing);
        toolRing.setTitle("RINGFRAME");
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tempIntent = new Intent(Ringframe_1.this, DepartmentSelect_1.class);
                startActivity(tempIntent);
            }
        });

        mFirebasedb = FirebaseDatabase.getInstance();
        mRefdb = mFirebasedb.getReference().child("RINGFRAME");


            DatabaseReference temp1 = mRefdb.child("MACHINE_NO_15").child("msg");
            ValueEventListener templis1 = new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    btnM15.setText("MACHINE_NO_15 (" + dataSnapshot.getValue() + ")");
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            };
            temp1.addValueEventListener(templis1);
 //---------------------------------------------------------------------------------------------------

        DatabaseReference temp2 = mRefdb.child("MACHINE_NO_16").child("msg");
        ValueEventListener templis2 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM16.setText("MACHINE_NO_16 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp2.addValueEventListener(templis2);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp3 = mRefdb.child("MACHINE_NO_17").child("msg");
        ValueEventListener templis3 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM17.setText("MACHINE_NO_17 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp3.addValueEventListener(templis3);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp4 = mRefdb.child("MACHINE_NO_18").child("msg");
        ValueEventListener templis4 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM18.setText("MACHINE_NO_18 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp4.addValueEventListener(templis4);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp5 = mRefdb.child("MACHINE_NO_19").child("msg");
        ValueEventListener templis5 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM19.setText("MACHINE_NO_19 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp5.addValueEventListener(templis5);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp6 = mRefdb.child("MACHINE_NO_20").child("msg");
        ValueEventListener templis6 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM20.setText("MACHINE_NO_20 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp6.addValueEventListener(templis6);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp7 = mRefdb.child("MACHINE_NO_21").child("msg");
        ValueEventListener templis7 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM21.setText("MACHINE_NO_21 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp7.addValueEventListener(templis7);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp8 = mRefdb.child("MACHINE_NO_22").child("msg");
        ValueEventListener templis8 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM22.setText("MACHINE_NO_22 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp8.addValueEventListener(templis8);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp9 = mRefdb.child("MACHINE_NO_23").child("msg");
        ValueEventListener templis9 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM23.setText("MACHINE_NO_23 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp9.addValueEventListener(templis9);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp10 = mRefdb.child("MACHINE_NO_24").child("msg");
        ValueEventListener templis10 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM24.setText("MACHINE_NO_24 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp10.addValueEventListener(templis10);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp11 = mRefdb.child("MACHINE_NO_25").child("msg");
        ValueEventListener templis11 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM25.setText("MACHINE_NO_25 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp11.addValueEventListener(templis11);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp12 = mRefdb.child("MACHINE_NO_26").child("msg");
        ValueEventListener templis12 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM26.setText("MACHINE_NO_26 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp12.addValueEventListener(templis12);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp13 = mRefdb.child("MACHINE_NO_27").child("msg");
        ValueEventListener templis13 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM27.setText("MACHINE_NO_27 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp13.addValueEventListener(templis13);
        //---------------------------------------------------------------------------------------------------
        DatabaseReference temp14 = mRefdb.child("MACHINE_NO_28").child("msg");
        ValueEventListener templis14 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM28.setText("MACHINE_NO_28 (" + dataSnapshot.getValue() + ")");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp14.addValueEventListener(templis14);
        //---------------------------------------------------------------------------------------------------

        DatabaseReference temp101 = mRefdb.child("MACHINE_NO_15").child("color");
        ValueEventListener templis101 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM15.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp101.addValueEventListener(templis101);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp102 = mRefdb.child("MACHINE_NO_16").child("color");
        ValueEventListener templis102 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM16.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp102.addValueEventListener(templis102);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp103 = mRefdb.child("MACHINE_NO_17").child("color");
        ValueEventListener templis103 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM17.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp103.addValueEventListener(templis103);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp104 = mRefdb.child("MACHINE_NO_18").child("color");
        ValueEventListener templis104 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM18.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp104.addValueEventListener(templis104);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp105 = mRefdb.child("MACHINE_NO_19").child("color");
        ValueEventListener templis105 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM19.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp105.addValueEventListener(templis105);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp106 = mRefdb.child("MACHINE_NO_20").child("color");
        ValueEventListener templis106 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM20.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp106.addValueEventListener(templis106);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp107 = mRefdb.child("MACHINE_NO_21").child("color");
        ValueEventListener templis107 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM21.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp107.addValueEventListener(templis107);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp108 = mRefdb.child("MACHINE_NO_22").child("color");
        ValueEventListener templis108 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM22.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp108.addValueEventListener(templis108);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp109 = mRefdb.child("MACHINE_NO_23").child("color");
        ValueEventListener templis109 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM23.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp109.addValueEventListener(templis109);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp110 = mRefdb.child("MACHINE_NO_24").child("color");
        ValueEventListener templis110 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM24.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp110.addValueEventListener(templis110);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp111 = mRefdb.child("MACHINE_NO_25").child("color");
        ValueEventListener templis111 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM25.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp111.addValueEventListener(templis111);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp112 = mRefdb.child("MACHINE_NO_26").child("color");
        ValueEventListener templis112 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM26.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp112.addValueEventListener(templis112);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp113 = mRefdb.child("MACHINE_NO_27").child("color");
        ValueEventListener templis113 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM27.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp113.addValueEventListener(templis113);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp114 = mRefdb.child("MACHINE_NO_28").child("color");
        ValueEventListener templis114 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnM28.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp114.addValueEventListener(templis114);
        //---------------------------------------------------------------------------------------------------




    }

    public void onClick(View v)
    {
        String mno="";
        switch (v.getId())
        {
            case R.id.btnM15:
                mno="MACHINE_NO_15";
                break;
            case R.id.btnM16:
                mno="MACHINE_NO_16";
                break;
            case R.id.btnM17:
                mno="MACHINE_NO_17";
                break;
            case R.id.btnM18:
                mno="MACHINE_NO_18";
                break;
            case R.id.btnM19:
                mno="MACHINE_NO_19";
                break;
            case R.id.btnM20:
                mno="MACHINE_NO_20";
                break;
            case R.id.btnM21:
                mno="MACHINE_NO_21";
                break;
            case R.id.btnM22:
                mno="MACHINE_NO_22";
                break;
            case R.id.btnM23:
                mno="MACHINE_NO_23";
                break;
            case R.id.btnM24:
                mno="MACHINE_NO_24";
                break;
            case R.id.btnM25:
                mno="MACHINE_NO_25";
                break;
            case R.id.btnM26:
                mno="MACHINE_NO_26";
                break;
            case R.id.btnM27:
                mno="MACHINE_NO_27";
                break;
            case R.id.btnM28:
                mno="MACHINE_NO_28";
                break;



        }
        Intent intent=new Intent(Ringframe_1.this, StoppageReport_1.class);
        intent.putExtra("machine",""+mno);
        intent.putExtra("deptInfo","RINGFRAME");
        startActivity(intent);


    }
}
