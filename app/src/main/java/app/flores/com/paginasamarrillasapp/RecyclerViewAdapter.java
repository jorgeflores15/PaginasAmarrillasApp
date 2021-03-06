package app.flores.com.paginasamarrillasapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<Empresa> listaEmpresas;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView titulo_empresa;
        private TextView direccion_empresa;
        private TextView telefono_empresa;
        private ImageView img_empresa;
        private CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            titulo_empresa = (TextView) itemView.findViewById(R.id.titulo_empresa);
            direccion_empresa = (TextView) itemView.findViewById(R.id.direccion_empresa);
            telefono_empresa = (TextView) itemView.findViewById(R.id.telefono_empresa);
            img_empresa = (ImageView) itemView.findViewById(R.id.img_empresa);
        }
    }

    public RecyclerViewAdapter(List<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    @Override
    public int getItemCount() {
        return listaEmpresas.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,final int position) {
        holder.titulo_empresa.setText(listaEmpresas.get(position).getNombre());
        holder.direccion_empresa.setText(listaEmpresas.get(position).getDireccion());
        holder.telefono_empresa.setText(listaEmpresas.get(position).getCorreo());
        holder.img_empresa.setImageResource(listaEmpresas.get(position).getLogo());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),DetailActivity.class);
                intent.putExtra("id",listaEmpresas.get(position).getId());
                intent.putExtra("rubro",listaEmpresas.get(position).getRubro());
                intent.putExtra("nombre",listaEmpresas.get(position).getNombre());
                intent.putExtra("direccion",listaEmpresas.get(position).getDireccion());
                intent.putExtra("telefono",listaEmpresas.get(position).getTelefono());
                intent.putExtra("correo",listaEmpresas.get(position).getCorreo());
                intent.putExtra("url",listaEmpresas.get(position).getUrl());
                intent.putExtra("logo",listaEmpresas.get(position).getLogo());
                intent.putExtra("info",listaEmpresas.get(position).getInfo());
                view.getContext().startActivity(intent);

            }
        });

    }
}