package unipac.com.br.visit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import unipac.com.br.visit.model.domain.Visitante;

/**
 * Created by Antonio Carlos on 19/09/2017.
 */

class VisitanteAdapter extends BaseAdapter {

    List<Visitante> visitantes =  null;

    Context contex;

    public VisitanteAdapter(List<Visitante> visitantes, Context contex) {

        this.visitantes = visitantes;
        this.contex = contex;

    }

    @Override
    public int getCount() {
        return visitantes.size();
    }

    @Override
    public Object getItem(int position) {
        return visitantes.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        Visitante visitante = visitantes.get(position);
        LayoutInflater inflater = (LayoutInflater) contex.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.visite_item, null);

        TextView nomeTv = (TextView) view.findViewById(R.id.nomeTv);
        if (visitante != null){
            nomeTv .setText(visitante.getNome());
        }
        return view;
    }
}
