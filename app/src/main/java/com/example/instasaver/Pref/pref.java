package com.example.instasaver.Pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

public class pref {
    Context context;
    private String APP_NAME= "INDEPENDENT_WORK_APP";

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor prefsEditor;
    public pref(Context context) {
        this.context = context;
        mSharedPreferences = context.getSharedPreferences(APP_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
    }
    public void setCookie(String cookie){
        prefsEditor = mSharedPreferences.edit();
        prefsEditor.putString("cookie", cookie);
        prefsEditor.apply();
    }
    public String getCookie(){
        return mSharedPreferences.getString("cookie", "");
    }



    public void setTap(int tap){
        prefsEditor = mSharedPreferences.edit();
        prefsEditor.putInt("tap", tap);
        prefsEditor.apply();
    }
    public int getTap(){
        return mSharedPreferences.getInt("tap", 0);
    }
    public void deleteCookie(){
        // Clear all cookies
        try{
            android.webkit.CookieManager.getInstance().removeAllCookies(null);
            // Clear session cookies
            CookieManager.getInstance().removeSessionCookies(null);
            // Force remove cookies immediately
            CookieSyncManager.getInstance().sync();
            prefsEditor = mSharedPreferences.edit();
            prefsEditor.remove("cookie");
            setTap(0);
            prefsEditor.clear();
            prefsEditor.apply();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
