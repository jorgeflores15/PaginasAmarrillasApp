package app.flores.com.paginasamarrillasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DetailActivity extends AppCompatActivity {

    private ImageButton btnWebsite;
    private ImageButton btnSms;
    private ImageButton btnEmail;
    private ImageButton btnShare;
    private ImageButton btnLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnWebsite = (ImageButton) findViewById(R.id.btnWebsite);
        btnEmail = (ImageButton) findViewById(R.id.btnEmail);
        btnSms = (ImageButton) findViewById(R.id.btnSms);
        btnShare = (ImageButton) findViewById(R.id.btnCompartir);
        btnLlamar = (ImageButton) findViewById(R.id.btnLlamar);

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // url = urlText.getText().toString();
                //startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(url)));
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  nombre = nombreText.getText().toString();
                rubro = rubroText.getText().toString();
                direccion = direccionText.getText().toString();
                telefono = telefonoText.getText().toString();
                correo = correoText.getText().toString();
                url = urlText.getText().toString();
                info = infoText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"Empresa: "+nombre+"\nRubro: "+rubro+"\nDirección: "+direccion+"\nTelefono: "+telefono+
                        "\nCorreo: "+correo+"\nURL: "+url+"\nInfo: "+info);
                startActivity(Intent.createChooser(intent, "Share with"));*/
            }
        });

        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                telefono = telefonoText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+telefono));
                startActivity(intent);*/
            }
        });
    }
}
