
package com.example.instasaver.Models.Video;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SharingFrictionInfo__1 {

    @SerializedName("should_have_sharing_friction")
    @Expose
    private Boolean shouldHaveSharingFriction;
    @SerializedName("bloks_app_url")
    @Expose
    private Object bloksAppUrl;

    public Boolean getShouldHaveSharingFriction() {
        return shouldHaveSharingFriction;
    }

    public void setShouldHaveSharingFriction(Boolean shouldHaveSharingFriction) {
        this.shouldHaveSharingFriction = shouldHaveSharingFriction;
    }

    public Object getBloksAppUrl() {
        return bloksAppUrl;
    }

    public void setBloksAppUrl(Object bloksAppUrl) {
        this.bloksAppUrl = bloksAppUrl;
    }

}
