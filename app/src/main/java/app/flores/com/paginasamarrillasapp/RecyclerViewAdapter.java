package app.flores.com.paginasamarrillasapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<Empresa> listaEmpresas;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView titulo_empresa;
        private TextView direccion_empresa;
        private TextView telefono_empresa;
        private ImageView img_empresa;

        public ViewHolder(View itemView) {
            super(itemView);
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
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.titulo_empresa.setText(listaEmpresas.get(position).getNombre());
        holder.direccion_empresa.setText(listaEmpresas.get(position).getDireccion());
        //holder.telefono_empresa.setText(listaEmpresas.get(position).getTelefono());
        holder.img_empresa.setImageResource(listaEmpresas.get(position).getLogo());
    }
}