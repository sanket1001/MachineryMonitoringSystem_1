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

public class Blowroom_1 extends AppCompatActivity {
    Button btnMB1;

    Button btnBMain;
    private FirebaseDatabase mFirebasedb;
    private DatabaseReference mRefdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blowroom_1);


        /*setting toolbar color*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarBlow);
        myToolbar.setTitle("BLOWROOM");
        setSupportActionBar(myToolbar);
        /*setting status bar color*/
        Window window = Blowroom_1.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(Blowroom_1.this,R.color.titleBackgroundColorMustard));



        btnMB1 = (Button) findViewById(R.id.btnMB1);

        btnBMain = (Button) findViewById(R.id.btnBMain);

        btnBMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tempIntent = new Intent(Blowroom_1.this, DepartmentSelect_1.class);
                startActivity(tempIntent);
            }
        });


        mFirebasedb = FirebaseDatabase.getInstance();
        mRefdb = mFirebasedb.getReference().child("BLOWROOM");

        DatabaseReference temp1 = mRefdb.child("MACHINE_NO_1").child("msg");
        ValueEventListener templis1 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnMB1.setText("MACHINE_NO_1 (" + dataSnapshot.getValue() + ")");

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp1.addValueEventListener(templis1);
        //---------------------------------------------------------------------------------------------------


        DatabaseReference temp11 = mRefdb.child("MACHINE_NO_1").child("color");

        ValueEventListener templis11 = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                btnMB1.setBackgroundColor(getResources().getColor(Integer.parseInt(dataSnapshot.getValue().toString())));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        temp11.addValueEventListener(templis11);
        //---------------------------------------------------------------------------------------------------


    }


    public void onClickBlow(View v)
    {

        String mno="";
        switch (v.getId())
        {
            case R.id.btnMB1:
                mno="MACHINE_NO_1";
                break;




        }
        Intent intent=new Intent(Blowroom_1.this, StoppageReport_1.class);
        intent.putExtra("machine",""+mno);
        intent.putExtra("deptInfo","BLOWROOM");
        startActivity(intent);


    }
}
