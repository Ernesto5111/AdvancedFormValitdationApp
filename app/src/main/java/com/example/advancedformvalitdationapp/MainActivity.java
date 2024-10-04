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
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = Name.getText().toString().trim();
                String email = Surname.getText().toString().trim();

                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać imię",Toast.LENGTH_SHORT).show();
                }
                else if(email.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać email",Toast.LENGTH_SHORT).show();
                }
                else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    Toast.makeText(MainActivity.this, "Niepoprawny adres email",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Formularz przesłany poprawnie",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}