package app.flores.com.paginasamarrillasapp;
import java.util.ArrayList;
import java.util.List;

public class EmpresaRepository {

    private List<Empresa> empresasLista = new ArrayList<>();

    private static EmpresaRepository _INSTANCE = null;
    public static EmpresaRepository getInstance(){
        if(_INSTANCE == null)
        _INSTANCE = new EmpresaRepository();
        return _INSTANCE;
    }

    public List<Empresa> getEmpresasLista() {
        empresasLista.add(new Empresa(100,"Restaurantes","Compañia del Sabor","Tr93 53-48 Int 84",+012242625,"informes@companiadelsabor.com",
                "www.companiadelsabor.com",R.drawable.bg_fondo_imagen,"El Sabor Original del Pollo Desde…"));
        empresasLista.add(new Empresa(101,"Restaurantes","Lima Limon","Naciones Unidas 1709",+012242325,"informes@companiadelsabor.com",
                "www.limalimon.com",R.drawable.bg_fondo_imagen,"El Sabor Original del Pollo Desde…"));
        empresasLista.add(new Empresa(102,"Restaurantes","El viejo madero","Av. Arica, Cercado de Lima 15082",+012220521,"informes@companiadelsabor.com",
                "www.elviejomadero.com",R.drawable.bg_fondo_imagen,"El Sabor Original del Pollo Desde…"));
        empresasLista.add(new Empresa(103,"Restaurantes","Los Pimpollos","Av. Nicolás de Piérola 1018",+01272726,"informes@companiadelsabor.com",
                "www.lospimpollos.com",R.drawable.bg_fondo_imagen,"El Sabor Original del Pollo Desde…"));
        empresasLista.add(new Empresa(104,"Restaurantes","3 a la lena","Tr93 53-48 Int 84",+01322023,"informes@companiadelsabor.com",
                "www.3alaleña.com",R.drawable.bg_fondo_imagen,"El Sabor Original del Pollo Desde…"));
        empresasLista.add(new Empresa(105,"Restaurantes","La vieja nautica","Tr93 53-48 Int 84",+012242625,"informes@companiadelsabor.com",
                "www.companiadelsabor.com",R.drawable.bg_fondo_imagen,"El Sabor Original del Pollo Desde…"));
        empresasLista.add(new Empresa(106,"Restaurantes","Compañia del Sabor","Tr93 53-48 Int 84",+012242625,"informes@companiadelsabor.com",
                "www.companiadelsabor.com",R.drawable.bg_fondo_imagen,"El Sabor Original del Pollo Desde…"));
        empresasLista.add(new Empresa(107,"Restaurantes","Compañia del Sabor","Tr93 53-48 Int 84",+012242625,"informes@companiadelsabor.com",
                "www.companiadelsabor.com",R.drawable.bg_fondo_imagen,"El Sabor Original del Pollo Desde…"));
        empresasLista.add(new Empresa(108,"Restaurantes","Compañia del Sabor","Tr93 53-48 Int 84",+012242625,"informes@companiadelsabor.com",
                "www.companiadelsabor.com",R.drawable.bg_fondo_imagen,"El Sabor Original del Pollo Desde…"));
        empresasLista.add(new Empresa(109,"Restaurantes","Compañia del Sabor","Tr93 53-48 Int 84",+012242625,"informes@companiadelsabor.com",
                "www.companiadelsabor.com",R.drawable.bg_fondo_imagen,"El Sabor Original del Pollo Desde…"));

        return empresasLista;
    }
}