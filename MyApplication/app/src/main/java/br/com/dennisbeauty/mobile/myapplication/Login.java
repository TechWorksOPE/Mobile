package br.com.dennisbeauty.mobile.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    private View email = null;
    private View password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

     Button enviar = findViewById(R.id.enviar);
     enviar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             email =  findViewById(R.id.emailId);
             password =  findViewById(R.id.passId);

             Boolean Logon = LoginUser(email , password);



             if (Logon){
                 Intent intent = new Intent(Login.this , MainActivity.class);
                 intent.putExtra("email" , email.toString());
                 startActivity(intent);
             }else{
                 finish();
             }

         }



     });





    }

    public boolean LoginUser (View email , View senha) {
        if (email != null && senha != null) {

            return true;
        } else {
            return false;
        }
    }
}
