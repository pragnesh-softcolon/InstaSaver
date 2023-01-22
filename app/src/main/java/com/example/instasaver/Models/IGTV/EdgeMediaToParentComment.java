
package com.example.instasaver.Models.IGTV;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EdgeMediaToParentComment {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("page_info")
    @Expose
    private PageInfo pageInfo;
    @SerializedName("edges")
    @Expose
    private List<Edge__1> edges = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Edge__1> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__1> edges) {
        this.edges = edges;
    }

}
