package android.reza.com.conference_app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jAVA USER on 9/30/2017.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{
    private Context context;
    private String[] items;
    public MenuAdapter(Context context, String[] items){
        this.context = context;
        this.items = items;
    }


    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_menu_item,parent,false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MenuAdapter.MenuViewHolder holder, int position) {
//        holder.imageitem.setImageResource(cars.get(position).getCarImage());
          holder.textitem.setText(items[position]);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }


    public class MenuViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageitem;
        private TextView textitem;
        public MenuViewHolder(View itemView) {
            super(itemView);
            imageitem = (ImageView) itemView.findViewById(R.id.imageitem);
            textitem = (TextView) itemView.findViewById(R.id.textitem);
        }
    }
}
