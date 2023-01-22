
package com.example.instasaver.Models.Reel;

import com.example.instasaver.Models.Reel.Graphql;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GetReel {

    @SerializedName("graphql")
    @Expose
    private Graphql graphql;
    @SerializedName("showQRModal")
    @Expose
    private Boolean showQRModal;

    public Graphql getGraphql()
    {
        return graphql;
    }

    public void setGraphql(Graphql graphql)
    {
        this.graphql = graphql;
    }

    public Boolean getShowQRModal()
    {
        return showQRModal;
    }

    public void setShowQRModal(Boolean showQRModal) {
        this.showQRModal = showQRModal;
    }

}
