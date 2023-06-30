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
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.example.instasaver.Models.Profile.GetProfile;
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

import java.util.HashMap;
import java.util.Map;


public class profile extends Fragment {
    String URL="null";
    ImageView mparticularprofilepic;
    EditText getprofilepiclink;
    Button getprofilepic,downloadprofilepic;
    String profilepicurl="1";
    private Uri uri2;
    View view;
    private InterstitialAd interstitial;
    Dialog dialog;
    int tap =0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_profile, container, false);
        AdView mAdView;
        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getprofilepiclink=view.findViewById(R.id.getprofilepiclink);
        getprofilepic=view.findViewById(R.id.getprofilepic);
        downloadprofilepic=view.findViewById(R.id.downloadprofilepic);
        mparticularprofilepic=view.findViewById(R.id.particularprofilepic);
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
        getprofilepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL=getprofilepiclink.getText().toString();
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
                    String result2= StringUtils.substringBefore(URL,"?");
                    URL=result2+ textUtils.END_POINT;;
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
        downloadprofilepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(profilepicurl.equals("1"))
                    {
                        Toast.makeText(getContext(), "No Photo to download", Toast.LENGTH_SHORT).show();
                    }
                    {
                        DownloadManager.Request request=new DownloadManager.Request(uri2);
                        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI|DownloadManager.Request.NETWORK_MOBILE);
//                        request.setTitle("Download");
                        request.setDescription("Your Photo is downloading");
                        request.allowScanningByMediaScanner();
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,""+System.currentTimeMillis()+"_InstaSaver"+".jpg");
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
                    Log.e("anyText","error is : "+e);
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
                Log.e("anyText",URL);
                Log.e("anyText",response);
                try {
                    Log.e("anyText",""+response);
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    Gson gson = gsonBuilder.create();
                    GetProfile getProfile = gson.fromJson(response,GetProfile.class);
                    Boolean isPrivet=false;
//                    isPrivet=getProfile.getGraphql().getUser().getIsPrivate();
//                    if (!isPrivet)
//                    {
                        profilepicurl = getProfile.getGraphql().getUser().getProfilePicUrlHd();
                        Log.e("anyText",profilepicurl);
                        uri2 = Uri.parse(profilepicurl);
                        Glide.with(getContext()).load(uri2).into(mparticularprofilepic);
                        dialog.dismiss();
//                    }
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
//        Toast.makeText(getContext(), ""+interstitial.isLoaded(), Toast.LENGTH_SHORT).show();
        // If Interstitial Ads are loaded then show them, otherwise do nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

}