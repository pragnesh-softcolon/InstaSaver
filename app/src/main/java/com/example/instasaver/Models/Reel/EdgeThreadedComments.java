
package com.example.instasaver.Models.Reel;

import java.util.List;
import com.example.instasaver.Models.Reel.PageInfo__1;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class EdgeThreadedComments {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("page_info")
    @Expose
    private PageInfo__1 pageInfo;
    @SerializedName("edges")
    @Expose
    private List<Object> edges = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PageInfo__1 getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo__1 pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Object> getEdges() {
        return edges;
    }

    public void setEdges(List<Object> edges) {
        this.edges = edges;
    }

}
