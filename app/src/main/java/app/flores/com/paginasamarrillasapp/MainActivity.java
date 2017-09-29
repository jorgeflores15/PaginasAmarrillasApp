package app.flores.com.paginasamarrillasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnBuscar;
    private EditText inputBuscar;
    private String datos="Dog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBuscar = (Button) findViewById(R.id.btnBuscar);
        inputBuscar = (EditText) findViewById(R.id.inputBuscar);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos = inputBuscar.getText().toString().trim();
                if(!datos.isEmpty()){
                    Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                    intent.putExtra("busqueda",datos);
                    startActivity(intent);
                }
            }
        });
    }

    public void buscarEmpresas(){

        Toast.makeText(MainActivity.this, "This is my Toast message!",Toast.LENGTH_SHORT).show();









    }

}
