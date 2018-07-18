package ps1.rishabh.com.machinerymonitoringsystem;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class DepartmentSelect extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_select);

        /*setting toolbar color*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarTitle);
        setSupportActionBar(myToolbar);
        /*setting status bar color*/
        Window window = DepartmentSelect.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(DepartmentSelect.this,R.color.titleBackgroundColorMustard));

        /*Setting up the listview for department selection */
        final ListView listview = (ListView)findViewById(R.id.department_list);
        String[] strings = {"BLOWROOM", "CARDING", "DRAWING", "INTER/SIMPLEX", "RINGFRAME", "WINDING", "STEAMING"};

        ListAdapter dept_array_adapter = new CustomAdapter(this, strings);
        listview.setAdapter(dept_array_adapter);

        /*Setting up a listener on the listitems */
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String string = String.valueOf(adapterView.getItemAtPosition(i));
                Intent temp;
                switch (string){
                    case ("BLOWROOM"): temp = new Intent(DepartmentSelect.this, Blowroom.class);
                                       temp.putExtra("DeptInfo",string);
                                       startActivity(temp);
                                       break;

                    case ("CARDING"): temp = new Intent(DepartmentSelect.this, Carding.class);
                                      temp.putExtra("DeptInfo",string);
                                      startActivity(temp);
                                      break;
                    case ("DRAWING"): temp = new Intent(DepartmentSelect.this, Drawing.class);
                                      temp.putExtra("DeptInfo",string);
                                      startActivity(temp);
                                      break;
                    case ("INTER/SIMPLEX"): temp = new Intent(DepartmentSelect.this, Inter.class);
                                      temp.putExtra("DeptInfo",string);
                                      startActivity(temp);
                                      break;
                    case ("RINGFRAME"): temp = new Intent(DepartmentSelect.this, Ringframe.class);
                                        temp.putExtra("DeptInfo",string);
                                        startActivity(temp);
                                        break;
                    case ("WINDING"): temp = new Intent(DepartmentSelect.this, Winding.class);
                                      temp.putExtra("DeptInfo",string);
                                      startActivity(temp);
                                      break;
                    case ("STEAMING"): temp = new Intent(DepartmentSelect.this, Steaming.class);
                                       temp.putExtra("DeptInfo",string);
                                       startActivity(temp);
                                       break;



                }
            }
            }
        );





    }








}