package bryandariolesmana.jwork_android;
/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;
/**
 * insiasi class Register Activity
 */
public class RegisterActivity extends AppCompatActivity implements Response.ErrorListener {
    /**
     * method untuk onCreate perancangan view
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        EditText editTextName = findViewById(R.id.editTextName_Register);
        EditText editTextEmail = findViewById(R.id.editTextEmail_Register);
        EditText editTextPassword = findViewById(R.id.editTextPassword_Register);
        Button buttonRegister = findViewById(R.id.buttonRegister_Register);
        /**
         * listener untuk button register
         */
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            /**
             * method respon setelah tombol register dipilih
             * @param view
             */
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            if (jsonObject != null) {
                                Toast.makeText(RegisterActivity.this, "Register Successful", Toast.LENGTH_LONG).show();
                            }
                        } catch (JSONException e) {
                            Toast.makeText(RegisterActivity.this, "Register Failed", Toast.LENGTH_SHORT).show();
                            System.out.println(e.getMessage());
                        }
                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(name, email, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });
    }
    /**
     * method untuk menampilkan respon error
     * @param error
     */
    @Override
    public void onErrorResponse(VolleyError error) {

    }
}