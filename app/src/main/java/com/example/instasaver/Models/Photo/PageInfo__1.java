
package com.example.instasaver.Models.Photo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PageInfo__1 {

    @SerializedName("has_next_page")
    @Expose
    private Boolean hasNextPage;
    @SerializedName("end_cursor")
    @Expose
    private Object endCursor;

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Object getEndCursor() {
        return endCursor;
    }

    public void setEndCursor(Object endCursor) {
        this.endCursor = endCursor;
    }

}
