package bryandariolesmana.jwork_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonLogin = findViewById(R.id.ButtonText);
        TextView plainTextRegister = findViewById(R.id.ViewText);

        Object btnLogin;
        btnLogin.setOnCLickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();
                if(email.equals("test@test.com") && password.equals("test")){
                    Toast.makeText(LoginActivity.this, "Login Successful",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this, "Login Failed", 
                            Toast.LENGTH_SHORT).show();}
                }
            });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}