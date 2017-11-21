/*package unipac.com.br.visit;

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

/*class VisitaAdapter extends BaseAdapter {

    List<Visita> visita =  null;

    Context contex;

    public VisitaAdapter(List<Visita> visita, Context contex) {

        this.visita = visita;
        this.contex = contex;

    }

    @Override
    public int getCount() {
        return visita.size();
    }

    @Override
    public Object getItem(int position) {
        return visita.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        Visita visita = visita.get(position);
        LayoutInflater inflater = (LayoutInflater) contex.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.visite_item, null);

        TextView dataTv = (TextView) view.findViewById(R.id.dataTv);
        if (visita != null){
            dataTv .setText(visita.getData());
        }
        return view;
    }
}
*/