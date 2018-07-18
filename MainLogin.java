package ps1.rishabh.com.machinerymonitoringsystem;

import android.annotation.TargetApi;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainLogin extends AppCompatActivity {
    String USER_ID;
    String PASSWORD;
    EditText etID;
    EditText etPass;
    TextView tv1;
    TextView tv2;

    //User1 1234
    //User2 2345
    //User3 3456
    //User4 4567



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        /*setting toolbar color*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarTitle);
        setSupportActionBar(myToolbar);
        /*setting status bar color*/
        Window window = MainLogin.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(MainLogin.this,R.color.titleBackgroundColorMustard));

        etID = (EditText) findViewById(R.id.editUserID);
        etPass = (EditText) findViewById(R.id.editPIN);
        //tv1 = (TextView) findViewById(R.id.enterUserID);
        //tv2 = (TextView) findViewById(R.id.enterPIN);


        /*setting onclicklistener on loginButton */
        final Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                USER_ID = etID.getText().toString();
                PASSWORD = etPass.getText().toString();
               // tv1.setText(USER_ID);
               // tv2.setText(PASSWORD);


                Boolean userCheck=false;
                Boolean passCheck=false;

                switch (USER_ID){
                    case "User1":
                        userCheck=true;
                        if(PASSWORD.equals("1234"))
                            passCheck=true;
                        break;
                    case "User2":
                        userCheck=true;
                        if(PASSWORD.equals("2345"))
                            passCheck=true;
                        break;
                    case "User3":
                        userCheck=true;
                        if(PASSWORD.equals("3456"))
                            passCheck=true;
                        break;
                    case "User4":
                        userCheck=true;
                        if(PASSWORD.equals("4567"))
                            passCheck=true;
                        break;
                }

                if(userCheck && passCheck){
                    etPass.setText("");
                    etID.setText("");
                    Intent intent =new Intent(MainLogin.this, DepartmentSelect_1.class);
                    startActivity(intent);

                }
                else if(!userCheck)
                {
                    etPass.setText("");
                    etID.setText("");
                    Toast.makeText(MainLogin.this, "Check your UserId!", Toast.LENGTH_LONG).show();
                }
                else if(!passCheck)
                {
                    etPass.setText("");
                    etID.setText("");
                    Toast.makeText(MainLogin.this, "Check your Password", Toast.LENGTH_LONG).show();
                }






            }
        });
    }
}
