package app.flores.com.paginasamarrillasapp;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    private String valor;
    private CardView cardView;

    private TextView inputRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.recyclerView);
        cardView = (CardView) findViewById(R.id.cardView);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        EmpresaRepository em = EmpresaRepository.getInstance();


        List<Empresa> empresas = em.getEmpresasLista();

       inputRespuesta = (TextView) findViewById(R.id.inputRespuesta);

        valor = getIntent().getStringExtra("busqueda");

        adapter = new RecyclerViewAdapter(filtroDeEmpresas(empresas, valor));

        recycler.setAdapter(adapter);
        recycler.setItemViewCacheSize(0);

        inputRespuesta.setText("Hay "+adapter.getItemCount()+" resultados para su busqueda: "+valor);
    }

    public List<Empresa> filtroDeEmpresas(List<Empresa> emp, String valor) {
        List<Empresa> filtroDeEmpresas = new ArrayList<>();
        for (Empresa empresasLista : emp) {
            if (empresasLista.getRubro().equals(valor)) {
                filtroDeEmpresas.add(empresasLista);
            }else if(empresasLista.getNombre().equals(valor)) {
                    filtroDeEmpresas.add(empresasLista);
            }

        }
        return filtroDeEmpresas;
    }

    private class Rec extends RecyclerView.ViewHolder implements View.OnClickListener {
        public Rec(View v) {
            super(v);
            v.setOnClickListener(this);
            Toast.makeText(getApplicationContext(),"You have clicked " + ((TextView) v).getText(),Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"You have clicked " + ((TextView) v).getText(),Toast.LENGTH_SHORT).show();
        }
    }
    public void irDetalle (View v){
        Toast.makeText(getApplicationContext(),"You have clicked ",Toast.LENGTH_SHORT).show();
    }



}
