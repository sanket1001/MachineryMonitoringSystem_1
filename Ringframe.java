package ps1.rishabh.com.machinerymonitoringsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Ringframe extends AppCompatActivity {
    String deptInfo;
    private FirebaseDatabase mFirebasedb;
    private DatabaseReference mdbRef;
    private ValueEventListener valListener;
    int i;
    public Integer[] statusRing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ringframe);

        /*setting toolbar color*/
        Toolbar myToolbarRingframe = (Toolbar) findViewById(R.id.toolbarTitleRingframe);
        setSupportActionBar(myToolbarRingframe);
        getSupportActionBar().setTitle("Ringframe");
        /*setting status bar color*/
        Window window = Ringframe.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(Ringframe.this,R.color.titleBackgroundColorMustard));

        deptInfo = getIntent().getStringExtra("DeptInfo");
        statusRing = new Integer[14];

        mFirebasedb = FirebaseDatabase.getInstance();
        mdbRef = mFirebasedb.getReference().child("RINGFRAME");


        for( i=15;i<=28;i++)
        {

            DatabaseReference temp=mdbRef.child("MACHINE_NO_"+i).child("status");
            ValueEventListener templis = new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                   statusRing[i-15]=Integer.parseInt(dataSnapshot.getValue().toString());
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            };
            temp.addValueEventListener(templis);

        }


        /*Setting up the listview for machine selection */
        final ListView listview = (ListView)findViewById(R.id.machine_list);

        /*
        String[] ringframeMachines = {"MACHINE NO.15", "MACHINE NO.16", "MACHINE NO.17", "MACHINE NO.18", "MACHINE NO.19", "MACHINE NO.20", "MACHINE NO.21", "MACHINE NO.22," +
                "MACHINE NO.23", "MACHINE NO.24", "MACHINE NO.25", "MACHINE NO.26", "MACHINE NO.27", "MACHINE NO.28"};
        */
        ListAdapter ring_array_adapter = new CustomAdapterRing(this, statusRing);
        listview.setAdapter(ring_array_adapter);

        /*Setting up a listener on the listitems */
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String string = String.valueOf(adapterView.getItemAtPosition(i));
                Intent intent= new Intent(Ringframe.this, StoppageReport.class);
                intent.putExtra("machineInfo", deptInfo+","+string);
                startActivity(intent);


            }
            }
        );





    }








}