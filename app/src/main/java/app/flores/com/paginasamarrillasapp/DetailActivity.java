package app.flores.com.paginasamarrillasapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

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
        TextView txtNombre = (TextView) findViewById(R.id.titulo_empresa);
        TextView txtDireccion = (TextView) findViewById(R.id.direccion_empresa);
        TextView txtTelefono = (TextView) findViewById(R.id.telefono_empresa);
        TextView txtCategoria = (TextView) findViewById(R.id.categoria_empresa);
        TextView txtDescripcion = (TextView) findViewById(R.id.informacion_empresa);

        txtNombre.setText(getIntent().getExtras().getString("nombre"));
        txtDireccion.setText(getIntent().getExtras().getString("direccion"));
        txtTelefono.setText(getIntent().getExtras().getString("telefono"));
        txtCategoria.setText(getIntent().getExtras().getString("rubro"));
        txtDescripcion.setText(getIntent().getExtras().getString("info"));

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webI = new Intent(Intent.ACTION_VIEW );
                webI.setData(Uri.parse(getIntent().getExtras().getString("url")));
                startActivity(webI);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailintent = new Intent(Intent.ACTION_SEND);
                emailintent.setType("text/plain");
                emailintent.putExtra(Intent.EXTRA_EMAIL,getIntent().getExtras().getString("correo"));
                emailintent.putExtra(Intent.EXTRA_SUBJECT,getIntent().getExtras().getString("nombre"));
                emailintent.putExtra(Intent.EXTRA_TEXT,ObtenerComprimido());
                startActivity(Intent.createChooser(emailintent, "Enviando"));
            }
        });

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent smsI = new Intent(Intent.ACTION_SENDTO);
                smsI.setData(Uri.parse("smsto:"));
                startActivity(smsI);
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT,ObtenerComprimido());
                shareIntent.setType("text/plain");
                startActivity(shareIntent);
            }
        });

        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", String.valueOf(getIntent().getExtras().getString("telefono")), null)));
            }
        });
    }
    public String ObtenerComprimido (){
        String rubro = getIntent().getExtras().getString("rubro");
        String nombre = getIntent().getExtras().getString("nombre");
        String direccion = getIntent().getExtras().getString("direccion");
        String telefono = getIntent().getExtras().getString("telefono");
        String correo = getIntent().getExtras().getString("correo");
        String url = getIntent().getExtras().getString("url");
        String info = getIntent().getExtras().getString("info");

        String oracion = "Empresa: "+ nombre + "\nRubro: " + rubro + "\nDirección: " + direccion + "\nTelefono: "+telefono+ "\nCorreo: " + correo + "\nURL: " + url + "\nInfo: "+ info;

        return oracion;
    }
}
