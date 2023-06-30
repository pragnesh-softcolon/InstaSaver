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

import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.instasaver.Models.IGTV.GetIgtv;
import com.example.instasaver.Pref.pref;
import com.example.instasaver.R;
import com.example.instasaver.utils.textUtils;
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
import java.util.Map;

public class igtv extends Fragment {

    String URL="null";
    int tap =0;
    VideoView mparticularigtv;
    EditText getigtvlink;
    Button getigtv,downloadigtv;
    private MediaController mediaController;
    AdView mAdView;
    String igtvurl="1";
    private Uri uri2;
    private InterstitialAd interstitial;
    View view;
    Dialog dialog;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_igtv, container, false);
        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getigtvlink=view.findViewById(R.id.getigtvlink);
        getigtv=view.findViewById(R.id.getigtv);
        downloadigtv=view.findViewById(R.id.downloadigtv);
        mparticularigtv=view.findViewById(R.id.particularigtv);
        mediaController=new MediaController(getContext());
        mediaController.setAnchorView(mparticularigtv);
        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.loading_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
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
        getigtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL=getigtvlink.getText().toString();
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
                    URL=result2+ textUtils.END_POINT;
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
        downloadigtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(igtvurl.equals("1"))
                    {
                        Toast.makeText(getContext(), "No IGTV video to download", Toast.LENGTH_SHORT).show();
                    }
                    {
                        DownloadManager.Request request=new DownloadManager.Request(uri2);
                        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI|DownloadManager.Request.NETWORK_MOBILE);
                        request.setTitle("Download");
                        request.setDescription("Your IGTV Is downloading");
                        request.allowScanningByMediaScanner();
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,""+System.currentTimeMillis()+"_InstaSaver"+".mp4");
                        DownloadManager manager=(DownloadManager) getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                        manager.enqueue(request);
                        Toast.makeText(getContext(), "Downloading started....", Toast.LENGTH_SHORT).show();
                        int done= DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED;
                        if (done==1)
                        {
                            Toast.makeText(getContext(), "Download Completed", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                catch (Exception e)
                {

                }
            }
        });

        return view;
    }

    private void processdata()
    {
        dialog.show();
        StringRequest request=new StringRequest(URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                new pref(getContext()).setTap(tap+1);
                Log.e("anytext2",response);
                try {
//                    GsonBuilder gsonBuilder = new GsonBuilder();
//                    Gson gson = gsonBuilder.create();
//                    GetIgtv getigtv=gson.fromJson(response,GetIgtv.class);
//                    igtvurl=getigtv.getGraphql().getShortcodeMedia().getVideoUrl();
//                    Log.e("anyText",igtvurl);
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray itemsArray = jsonObject.getJSONArray("items");

                    if (itemsArray.length() > 0) {
                        JSONObject itemObject = itemsArray.getJSONObject(0);
                        JSONArray videoVersionsArray = itemObject.getJSONArray("video_versions");

                        int maxWidth = 0;
                        int maxHeight = 0;

                        for (int i = 0; i < videoVersionsArray.length(); i++) {
                            JSONObject videoVersionObject = videoVersionsArray.getJSONObject(i);
                            int width = videoVersionObject.getInt("width");
                            int height = videoVersionObject.getInt("height");

                            if (width > maxWidth && height > maxHeight) {
                                maxWidth = width;
                                maxHeight = height;
                                igtvurl = videoVersionObject.getString("url");
                            }
                        }
                    }
                    uri2 = Uri.parse(igtvurl);

                    mparticularigtv.setMediaController(mediaController);
                    mparticularigtv.setVideoURI(uri2);
                    dialog.dismiss();
                    mparticularigtv.requestFocus();
                    mparticularigtv.start();

                }
                catch (Exception e)
                {
                    dialog.dismiss();
                    Log.e("anyText1","error is : "+e);
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