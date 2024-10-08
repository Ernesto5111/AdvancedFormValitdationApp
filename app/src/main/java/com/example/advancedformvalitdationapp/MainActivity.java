package com.example.advancedformvalitdationapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.advancedformvalitdationapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Surname;
    private EditText Phone;
    private EditText Email;
    private EditText Password;
    private EditText Password2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.Name);
        Surname = findViewById(R.id.Surname);
        Phone = findViewById(R.id.Phone);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Passowrd);
        Password2 = findViewById(R.id.Passowrd2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = Name.getText().toString().trim();
                String surname = Surname.getText().toString().trim();
                String phone = Phone.getText().toString().trim();
                String email = Email.getText().toString().trim();
                String password = Password.getText().toString().trim();
                String password2 = Password2.getText().toString().trim();



                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać imię",Toast.LENGTH_SHORT).show();
                }
                else if(surname.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać Nazwisko",Toast.LENGTH_SHORT).show();
                }
                else if(phone.length() < 9 ){
                    Toast.makeText(MainActivity.this, "Niepoprawny Numer tel.",Toast.LENGTH_SHORT).show();
                }
                else if(email.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać email",Toast.LENGTH_SHORT).show();
                }
                else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    Toast.makeText(MainActivity.this, "Niepoprawny adres email",Toast.LENGTH_SHORT).show();
                }
                else if(password.length() < 6){
                    Toast.makeText(MainActivity.this, "Hasło jest za krótkie",Toast.LENGTH_SHORT).show();
                }
                else if(!password2.equals(password)){
                    Toast.makeText(MainActivity.this, "Powtórz hasło",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Formularz przesłany poprawnie",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}
