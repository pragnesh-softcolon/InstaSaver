package com.example.instasaver.adapter;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.instasaver.R;

import java.util.LinkedList;
import java.util.List;

public class imageAdapter extends RecyclerView.Adapter<imageAdapter.MyViewHolder>{

    LinkedList<String> list;
    Context context;
    public imageAdapter(Context context,LinkedList<String> list) {
        this.context=context;
        this.list=list;
    }
    @NonNull
    @Override
    public imageAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_image, parent, false);
        return new imageAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull imageAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(context).load(list.get(position)).into(holder.img);
        holder.download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(list.get(position)));
                request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI|DownloadManager.Request.NETWORK_MOBILE);
//                        request.setTitle("Download");
                request.setDescription("Your Photo is downloading");
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,""+System.currentTimeMillis()+"_InstaSaver"+".jpg");
                DownloadManager manager=(DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
                manager.enqueue(request);
                Toast.makeText(context, "Downloading started....", Toast.LENGTH_SHORT).show();
                int done = DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED;
                if (done==1)
                {
                    Toast.makeText(context, "Download Completed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        Button download;
        ImageView img;
        public MyViewHolder(@NonNull View v) {
            super(v);
            download = v.findViewById(R.id.rowdownloadphoto);
            img = v.findViewById(R.id.img);
        }

        @Override
        public void onClick(View view) {
            int id = view.getId();
            if(id == R.id.rowdownloadphoto){

            }
        }
    }
}
