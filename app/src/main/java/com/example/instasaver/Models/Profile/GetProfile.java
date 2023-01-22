
package com.example.instasaver.Models.Profile;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetProfile {

    @SerializedName("seo_category_infos")
    @Expose
    private List<List<String>> seoCategoryInfos = null;
    @SerializedName("logging_page_id")
    @Expose
    private String loggingPageId;
    @SerializedName("show_suggested_profiles")
    @Expose
    private Boolean showSuggestedProfiles;
    @SerializedName("graphql")
    @Expose
    private Graphql graphql;
    @SerializedName("toast_content_on_load")
    @Expose
    private Object toastContentOnLoad;
    @SerializedName("show_qr_modal")
    @Expose
    private Boolean showQrModal;
    @SerializedName("show_view_shop")
    @Expose
    private Boolean showViewShop;

    public List<List<String>> getSeoCategoryInfos() {
        return seoCategoryInfos;
    }

    public void setSeoCategoryInfos(List<List<String>> seoCategoryInfos) {
        this.seoCategoryInfos = seoCategoryInfos;
    }

    public String getLoggingPageId() {
        return loggingPageId;
    }

    public void setLoggingPageId(String loggingPageId) {
        this.loggingPageId = loggingPageId;
    }

    public Boolean getShowSuggestedProfiles() {
        return showSuggestedProfiles;
    }

    public void setShowSuggestedProfiles(Boolean showSuggestedProfiles) {
        this.showSuggestedProfiles = showSuggestedProfiles;
    }

    public Graphql getGraphql()
    {
        return graphql;
    }

    public void setGraphql(Graphql graphql) {
        this.graphql = graphql;
    }

    public Object getToastContentOnLoad() {
        return toastContentOnLoad;
    }

    public void setToastContentOnLoad(Object toastContentOnLoad) {
        this.toastContentOnLoad = toastContentOnLoad;
    }

    public Boolean getShowQrModal() {
        return showQrModal;
    }

    public void setShowQrModal(Boolean showQrModal) {
        this.showQrModal = showQrModal;
    }

    public Boolean getShowViewShop() {
        return showViewShop;
    }

    public void setShowViewShop(Boolean showViewShop) {
        this.showViewShop = showViewShop;
    }

}
