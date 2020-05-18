package de.uol.app.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import de.uol.app.R;
import de.uol.app.data.ModuleModel;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.ViewHolder> {
    private List<ModuleModel> modelList;
    private Context context;
    private OnItemStatusChange mListener;

    public SubjectsAdapter(List<ModuleModel> modelList, OnItemStatusChange listener) {
        this.modelList = modelList;
        mListener = listener;
    }

    @NotNull
    @Override
    public SubjectsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_subject, parent, false);
        context = parent.getContext();
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ModuleModel module = modelList.get(position);

        holder.textModuleName.setText(module.id + " - " + module.name + " (" + module.keys.get(0) + ")");
        holder.textModuleName.setSelected(true);

        holder.view.setOnClickListener(view -> {
            module.nextStatus();
            mListener.onStatusChange();
            notifyItemChanged(position);
        });

        switch (module.getStatus()) {
            case pass:
                holder.imageModuleStatus.setImageDrawable(context.getDrawable(R.drawable.ic_done_circle));
                break;
            case fail:
                holder.imageModuleStatus.setImageDrawable(context.getDrawable(R.drawable.ic_fail_circle));
                break;
            case undefined:
                holder.imageModuleStatus.setImageDrawable(context.getDrawable(R.drawable.ic_circle_gray));
                break;
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textModuleName;
        private ImageView imageModuleStatus;
        private View view;

        ViewHolder(View view) {
            super(view);
            this.view = view;
            textModuleName = view.findViewById(R.id.tv_subject);
            imageModuleStatus = view.findViewById(R.id.iv_status);
        }
    }

    public interface OnItemStatusChange {
        void onStatusChange();
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}