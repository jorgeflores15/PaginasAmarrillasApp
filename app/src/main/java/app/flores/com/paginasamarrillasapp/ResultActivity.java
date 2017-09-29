package app.flores.com.paginasamarrillasapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ResultActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    private TextView inputRespuesta;

    private class EmpresaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public EmpresaViewHolder(View v) {
            super(v);
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),
                    "You have clicked " + ((TextView) v).getText(),Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        EmpresaRepository em = EmpresaRepository.getInstance();

        List<Empresa> empresas = em.getEmpresasLista();

        // Crear un nuevo adaptador
        adapter = new RecyclerViewAdapter(empresas);
        recycler.setAdapter(adapter);

        TextView inputRespuesta = (TextView) findViewById(R.id.inputRespuesta);

        String valor = getIntent().getStringExtra("busqueda");
        inputRespuesta.setText(valor);
    }
}
