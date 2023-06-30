package com.example.instasaver.Fragment;

import android.app.Dialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.example.instasaver.Models.Photo.GetPhoto;
import com.example.instasaver.Pref.pref;
import com.example.instasaver.R;
import com.example.instasaver.adapter.imageAdapter;
import com.example.instasaver.webviewLogin;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class photo extends Fragment {
    String URL="null";
    RecyclerView mparticularphoto;
    EditText getphotolink;
    Button getphoto,downloadphoto;
    AdView mAdView;
    String photourl="1";
    private Uri uri2;
    LinkedList<String> photolink = new LinkedList<>();
    private InterstitialAd interstitial;
    imageAdapter imageAdapter;
    View view;
    Dialog dialog;
    int tap =0;
    LinearLayoutManager manager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_photo, container, false);
        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getphotolink=view.findViewById(R.id.getphotolink);
        getphoto=view.findViewById(R.id.getphoto);
//        downloadphoto=view.findViewById(R.id.downloadphoto);
        mparticularphoto=view.findViewById(R.id.particularphoto);
        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.loading_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
        imageAdapter=new imageAdapter(getContext(),photolink);
        manager = new LinearLayoutManager(getContext());
        mparticularphoto.setLayoutManager(manager);
        mparticularphoto.setAdapter(imageAdapter);
        mparticularphoto.setVisibility(View.GONE);
        tap = new pref(getContext()).getTap();
        MobileAds.initialize(getContext(), getString(R.string.admob_app_id));

        // create ad request
        AdRequest adIRequest = new AdRequest.Builder().build();

        // Create an instance of the InterstitialAd object
        interstitial = new InterstitialAd(getContext());

        // Set the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_initial_id));

        // Load the Interstitial Ad
        interstitial.loadAd(adIRequest);

        // Prepare an Interstitial Ad Listener
        getphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL=getphotolink.getText().toString();
                if (URL.length()<10)
                {
                    Toast.makeText(getContext(), "Enter URL First", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    displayInterstitial();
                    interstitial.setAdListener(new AdListener() {
                        @Override
                        public void onAdLoaded()
                        {
                            // Call displayInterstitial() function when the Ad loads
                            displayInterstitial();
                        }
                    });
                    String result2= StringUtils.substringBefore(URL,"/?");
                    URL=result2+"/?__a=1&__d=dis";
//                    Toast.makeText(getContext(), "Don't Tap again...Wait For Few Secounds", Toast.LENGTH_SHORT).show();
                    if(tap<16){
                        processdata();
                    }
                    else{
                        Toast.makeText(getContext(), "You reached your today's limit", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        return view;
    }
    private void processdata()
    {
        dialog.show();
        Log.e("anyText",""+URL);
        StringRequest request=new StringRequest(URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                new pref(getContext()).setTap(tap+1);
                Log.e("anyText",""+response);
                try
                {
                    dialog.dismiss();
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray itemsArray = jsonObject.getJSONArray("items");
                    JSONObject zero = itemsArray.getJSONObject(0);
                    JSONArray image = zero.getJSONArray("carousel_media");


                    for(int i =0;i<image.length();i++)
                    {
                        JSONObject zero2 = image.getJSONObject(i);
                        JSONObject image2 = zero2.getJSONObject("image_versions2");
                        JSONArray image3 = image2.getJSONArray("candidates");
                        JSONObject zero3 = image3.getJSONObject(0);
                        photourl=zero3.getString("url");
                        Log.e("anyText",""+photourl);
                        photolink.add(photourl);
                    }
                    mparticularphoto.setVisibility(View.VISIBLE);
//                  mparticularphoto.setAdapter( new imageAdapter(getActivity(),photolink));
                }
                catch (Exception e)
                {
                    dialog.dismiss();
                    Log.e("anyText",""+e);
                    Toast.makeText(getContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("anyText",""+error.networkResponse.statusCode);
                dialog.dismiss();
                if(error.networkResponse.statusCode == 401){
                    checkAd();
                }
                else
                {
                    Toast.makeText(getContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError
            {

                Map<String, String> headers = super.getHeaders();
                if (headers == null || headers.isEmpty()) {
                    headers = new HashMap<>();
                }

                // Add the cookie to the request headers
                headers.put("Cookie", new pref(getContext()).getCookie());
                return headers;
            }
        };
        RequestQueue queue= Volley.newRequestQueue(requireContext());
        queue.add(request);
    }
    private void checkAd() {
        interstitial.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                new pref(getContext()).deleteCookie();
                Toast.makeText(getContext(), "Something went wrong...Login again", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(getContext(), webviewLogin.class);
                startActivity(intent);
                getActivity().finish();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                new pref(getContext()).deleteCookie();
                Toast.makeText(getContext(), "Something went wrong...Login again", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(getContext(), webviewLogin.class);
                startActivity(intent);
                getActivity().finish();
            }

            // Other callback methods...
        });
    }
    private void displayInterstitial()
    {
        // If Interstitial Ads are loaded then show them, otherwise do nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

}