
package com.example.instasaver.Models.Video;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashInfo {

    @SerializedName("is_dash_eligible")
    @Expose
    private Boolean isDashEligible;
    @SerializedName("video_dash_manifest")
    @Expose
    private Object videoDashManifest;
    @SerializedName("number_of_qualities")
    @Expose
    private Integer numberOfQualities;

    public Boolean getIsDashEligible() {
        return isDashEligible;
    }

    public void setIsDashEligible(Boolean isDashEligible) {
        this.isDashEligible = isDashEligible;
    }

    public Object getVideoDashManifest() {
        return videoDashManifest;
    }

    public void setVideoDashManifest(Object videoDashManifest) {
        this.videoDashManifest = videoDashManifest;
    }

    public Integer getNumberOfQualities() {
        return numberOfQualities;
    }

    public void setNumberOfQualities(Integer numberOfQualities) {
        this.numberOfQualities = numberOfQualities;
    }

}
