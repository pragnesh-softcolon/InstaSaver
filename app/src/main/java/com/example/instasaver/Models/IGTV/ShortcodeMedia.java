
package com.example.instasaver.Models.IGTV;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ShortcodeMedia {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("shortcode")
    @Expose
    private String shortcode;
    @SerializedName("dimensions")
    @Expose
    private Dimensions dimensions;
    @SerializedName("gating_info")
    @Expose
    private Object gatingInfo;
    @SerializedName("fact_check_overall_rating")
    @Expose
    private Object factCheckOverallRating;
    @SerializedName("fact_check_information")
    @Expose
    private Object factCheckInformation;
    @SerializedName("sensitivity_friction_info")
    @Expose
    private Object sensitivityFrictionInfo;
    @SerializedName("sharing_friction_info")
    @Expose
    private SharingFrictionInfo sharingFrictionInfo;
    @SerializedName("media_overlay_info")
    @Expose
    private Object mediaOverlayInfo;
    @SerializedName("media_preview")
    @Expose
    private String mediaPreview;
    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("display_resources")
    @Expose
    private List<DisplayResource> displayResources = null;
    @SerializedName("accessibility_caption")
    @Expose
    private Object accessibilityCaption;
    @SerializedName("dash_info")
    @Expose
    private DashInfo dashInfo;
    @SerializedName("has_audio")
    @Expose
    private Boolean hasAudio;
    @SerializedName("video_url")
    @Expose
    private String videoUrl;
    @SerializedName("video_view_count")
    @Expose
    private Integer videoViewCount;
    @SerializedName("video_play_count")
    @Expose
    private Object videoPlayCount;
    @SerializedName("is_video")
    @Expose
    private Boolean isVideo;
    @SerializedName("tracking_token")
    @Expose
    private String trackingToken;
    @SerializedName("upcoming_event")
    @Expose
    private Object upcomingEvent;
    @SerializedName("edge_media_to_tagged_user")
    @Expose
    private EdgeMediaToTaggedUser edgeMediaToTaggedUser;
    @SerializedName("edge_media_to_caption")
    @Expose
    private EdgeMediaToCaption edgeMediaToCaption;
    @SerializedName("can_see_insights_as_brand")
    @Expose
    private Boolean canSeeInsightsAsBrand;
    @SerializedName("caption_is_edited")
    @Expose
    private Boolean captionIsEdited;
    @SerializedName("has_ranked_comments")
    @Expose
    private Boolean hasRankedComments;
    @SerializedName("like_and_view_counts_disabled")
    @Expose
    private Boolean likeAndViewCountsDisabled;
    @SerializedName("edge_media_to_parent_comment")
    @Expose
    private EdgeMediaToParentComment edgeMediaToParentComment;
    @SerializedName("edge_media_to_hoisted_comment")
    @Expose
    private EdgeMediaToHoistedComment edgeMediaToHoistedComment;
    @SerializedName("edge_media_preview_comment")
    @Expose
    private EdgeMediaPreviewComment edgeMediaPreviewComment;
    @SerializedName("comments_disabled")
    @Expose
    private Boolean commentsDisabled;
    @SerializedName("commenting_disabled_for_viewer")
    @Expose
    private Boolean commentingDisabledForViewer;
    @SerializedName("taken_at_timestamp")
    @Expose
    private Integer takenAtTimestamp;
    @SerializedName("edge_media_preview_like")
    @Expose
    private EdgeMediaPreviewLike edgeMediaPreviewLike;
    @SerializedName("edge_media_to_sponsor_user")
    @Expose
    private EdgeMediaToSponsorUser edgeMediaToSponsorUser;
    @SerializedName("is_affiliate")
    @Expose
    private Boolean isAffiliate;
    @SerializedName("is_paid_partnership")
    @Expose
    private Boolean isPaidPartnership;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("nft_asset_info")
    @Expose
    private Object nftAssetInfo;
    @SerializedName("viewer_has_liked")
    @Expose
    private Boolean viewerHasLiked;
    @SerializedName("viewer_has_saved")
    @Expose
    private Boolean viewerHasSaved;
    @SerializedName("viewer_has_saved_to_collection")
    @Expose
    private Boolean viewerHasSavedToCollection;
    @SerializedName("viewer_in_photo_of_you")
    @Expose
    private Boolean viewerInPhotoOfYou;
    @SerializedName("viewer_can_reshare")
    @Expose
    private Boolean viewerCanReshare;
    @SerializedName("owner")
    @Expose
    private Owner__2 owner;
    @SerializedName("is_ad")
    @Expose
    private Boolean isAd;
    @SerializedName("edge_web_media_to_related_media")
    @Expose
    private EdgeWebMediaToRelatedMedia edgeWebMediaToRelatedMedia;
    @SerializedName("coauthor_producers")
    @Expose
    private List<Object> coauthorProducers = null;
    @SerializedName("pinned_for_users")
    @Expose
    private List<Object> pinnedForUsers = null;
    @SerializedName("encoding_status")
    @Expose
    private Object encodingStatus;
    @SerializedName("is_published")
    @Expose
    private Boolean isPublished;
    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("video_duration")
    @Expose
    private Double videoDuration;
    @SerializedName("thumbnail_src")
    @Expose
    private String thumbnailSrc;
    @SerializedName("clips_music_attribution_info")
    @Expose
    private Object clipsMusicAttributionInfo;
    @SerializedName("edge_related_profiles")
    @Expose
    private EdgeRelatedProfiles edgeRelatedProfiles;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Object getGatingInfo() {
        return gatingInfo;
    }

    public void setGatingInfo(Object gatingInfo) {
        this.gatingInfo = gatingInfo;
    }

    public Object getFactCheckOverallRating() {
        return factCheckOverallRating;
    }

    public void setFactCheckOverallRating(Object factCheckOverallRating) {
        this.factCheckOverallRating = factCheckOverallRating;
    }

    public Object getFactCheckInformation() {
        return factCheckInformation;
    }

    public void setFactCheckInformation(Object factCheckInformation) {
        this.factCheckInformation = factCheckInformation;
    }

    public Object getSensitivityFrictionInfo() {
        return sensitivityFrictionInfo;
    }

    public void setSensitivityFrictionInfo(Object sensitivityFrictionInfo) {
        this.sensitivityFrictionInfo = sensitivityFrictionInfo;
    }

    public SharingFrictionInfo getSharingFrictionInfo() {
        return sharingFrictionInfo;
    }

    public void setSharingFrictionInfo(SharingFrictionInfo sharingFrictionInfo) {
        this.sharingFrictionInfo = sharingFrictionInfo;
    }

    public Object getMediaOverlayInfo() {
        return mediaOverlayInfo;
    }

    public void setMediaOverlayInfo(Object mediaOverlayInfo) {
        this.mediaOverlayInfo = mediaOverlayInfo;
    }

    public String getMediaPreview() {
        return mediaPreview;
    }

    public void setMediaPreview(String mediaPreview) {
        this.mediaPreview = mediaPreview;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public List<DisplayResource> getDisplayResources() {
        return displayResources;
    }

    public void setDisplayResources(List<DisplayResource> displayResources) {
        this.displayResources = displayResources;
    }

    public Object getAccessibilityCaption() {
        return accessibilityCaption;
    }

    public void setAccessibilityCaption(Object accessibilityCaption) {
        this.accessibilityCaption = accessibilityCaption;
    }

    public DashInfo getDashInfo() {
        return dashInfo;
    }

    public void setDashInfo(DashInfo dashInfo) {
        this.dashInfo = dashInfo;
    }

    public Boolean getHasAudio() {
        return hasAudio;
    }

    public void setHasAudio(Boolean hasAudio) {
        this.hasAudio = hasAudio;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getVideoViewCount() {
        return videoViewCount;
    }

    public void setVideoViewCount(Integer videoViewCount) {
        this.videoViewCount = videoViewCount;
    }

    public Object getVideoPlayCount() {
        return videoPlayCount;
    }

    public void setVideoPlayCount(Object videoPlayCount) {
        this.videoPlayCount = videoPlayCount;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Boolean isVideo) {
        this.isVideo = isVideo;
    }

    public String getTrackingToken() {
        return trackingToken;
    }

    public void setTrackingToken(String trackingToken) {
        this.trackingToken = trackingToken;
    }

    public Object getUpcomingEvent() {
        return upcomingEvent;
    }

    public void setUpcomingEvent(Object upcomingEvent) {
        this.upcomingEvent = upcomingEvent;
    }

    public EdgeMediaToTaggedUser getEdgeMediaToTaggedUser() {
        return edgeMediaToTaggedUser;
    }

    public void setEdgeMediaToTaggedUser(EdgeMediaToTaggedUser edgeMediaToTaggedUser) {
        this.edgeMediaToTaggedUser = edgeMediaToTaggedUser;
    }

    public EdgeMediaToCaption getEdgeMediaToCaption() {
        return edgeMediaToCaption;
    }

    public void setEdgeMediaToCaption(EdgeMediaToCaption edgeMediaToCaption) {
        this.edgeMediaToCaption = edgeMediaToCaption;
    }

    public Boolean getCanSeeInsightsAsBrand() {
        return canSeeInsightsAsBrand;
    }

    public void setCanSeeInsightsAsBrand(Boolean canSeeInsightsAsBrand) {
        this.canSeeInsightsAsBrand = canSeeInsightsAsBrand;
    }

    public Boolean getCaptionIsEdited() {
        return captionIsEdited;
    }

    public void setCaptionIsEdited(Boolean captionIsEdited) {
        this.captionIsEdited = captionIsEdited;
    }

    public Boolean getHasRankedComments() {
        return hasRankedComments;
    }

    public void setHasRankedComments(Boolean hasRankedComments) {
        this.hasRankedComments = hasRankedComments;
    }

    public Boolean getLikeAndViewCountsDisabled() {
        return likeAndViewCountsDisabled;
    }

    public void setLikeAndViewCountsDisabled(Boolean likeAndViewCountsDisabled) {
        this.likeAndViewCountsDisabled = likeAndViewCountsDisabled;
    }

    public EdgeMediaToParentComment getEdgeMediaToParentComment() {
        return edgeMediaToParentComment;
    }

    public void setEdgeMediaToParentComment(EdgeMediaToParentComment edgeMediaToParentComment) {
        this.edgeMediaToParentComment = edgeMediaToParentComment;
    }

    public EdgeMediaToHoistedComment getEdgeMediaToHoistedComment() {
        return edgeMediaToHoistedComment;
    }

    public void setEdgeMediaToHoistedComment(EdgeMediaToHoistedComment edgeMediaToHoistedComment) {
        this.edgeMediaToHoistedComment = edgeMediaToHoistedComment;
    }

    public EdgeMediaPreviewComment getEdgeMediaPreviewComment() {
        return edgeMediaPreviewComment;
    }

    public void setEdgeMediaPreviewComment(EdgeMediaPreviewComment edgeMediaPreviewComment) {
        this.edgeMediaPreviewComment = edgeMediaPreviewComment;
    }

    public Boolean getCommentsDisabled() {
        return commentsDisabled;
    }

    public void setCommentsDisabled(Boolean commentsDisabled) {
        this.commentsDisabled = commentsDisabled;
    }

    public Boolean getCommentingDisabledForViewer() {
        return commentingDisabledForViewer;
    }

    public void setCommentingDisabledForViewer(Boolean commentingDisabledForViewer) {
        this.commentingDisabledForViewer = commentingDisabledForViewer;
    }

    public Integer getTakenAtTimestamp() {
        return takenAtTimestamp;
    }

    public void setTakenAtTimestamp(Integer takenAtTimestamp) {
        this.takenAtTimestamp = takenAtTimestamp;
    }

    public EdgeMediaPreviewLike getEdgeMediaPreviewLike() {
        return edgeMediaPreviewLike;
    }

    public void setEdgeMediaPreviewLike(EdgeMediaPreviewLike edgeMediaPreviewLike) {
        this.edgeMediaPreviewLike = edgeMediaPreviewLike;
    }

    public EdgeMediaToSponsorUser getEdgeMediaToSponsorUser() {
        return edgeMediaToSponsorUser;
    }

    public void setEdgeMediaToSponsorUser(EdgeMediaToSponsorUser edgeMediaToSponsorUser) {
        this.edgeMediaToSponsorUser = edgeMediaToSponsorUser;
    }

    public Boolean getIsAffiliate() {
        return isAffiliate;
    }

    public void setIsAffiliate(Boolean isAffiliate) {
        this.isAffiliate = isAffiliate;
    }

    public Boolean getIsPaidPartnership() {
        return isPaidPartnership;
    }

    public void setIsPaidPartnership(Boolean isPaidPartnership) {
        this.isPaidPartnership = isPaidPartnership;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getNftAssetInfo() {
        return nftAssetInfo;
    }

    public void setNftAssetInfo(Object nftAssetInfo) {
        this.nftAssetInfo = nftAssetInfo;
    }

    public Boolean getViewerHasLiked() {
        return viewerHasLiked;
    }

    public void setViewerHasLiked(Boolean viewerHasLiked) {
        this.viewerHasLiked = viewerHasLiked;
    }

    public Boolean getViewerHasSaved() {
        return viewerHasSaved;
    }

    public void setViewerHasSaved(Boolean viewerHasSaved) {
        this.viewerHasSaved = viewerHasSaved;
    }

    public Boolean getViewerHasSavedToCollection() {
        return viewerHasSavedToCollection;
    }

    public void setViewerHasSavedToCollection(Boolean viewerHasSavedToCollection) {
        this.viewerHasSavedToCollection = viewerHasSavedToCollection;
    }

    public Boolean getViewerInPhotoOfYou() {
        return viewerInPhotoOfYou;
    }

    public void setViewerInPhotoOfYou(Boolean viewerInPhotoOfYou) {
        this.viewerInPhotoOfYou = viewerInPhotoOfYou;
    }

    public Boolean getViewerCanReshare() {
        return viewerCanReshare;
    }

    public void setViewerCanReshare(Boolean viewerCanReshare) {
        this.viewerCanReshare = viewerCanReshare;
    }

    public Owner__2 getOwner() {
        return owner;
    }

    public void setOwner(Owner__2 owner) {
        this.owner = owner;
    }

    public Boolean getIsAd() {
        return isAd;
    }

    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    public EdgeWebMediaToRelatedMedia getEdgeWebMediaToRelatedMedia() {
        return edgeWebMediaToRelatedMedia;
    }

    public void setEdgeWebMediaToRelatedMedia(EdgeWebMediaToRelatedMedia edgeWebMediaToRelatedMedia) {
        this.edgeWebMediaToRelatedMedia = edgeWebMediaToRelatedMedia;
    }

    public List<Object> getCoauthorProducers() {
        return coauthorProducers;
    }

    public void setCoauthorProducers(List<Object> coauthorProducers) {
        this.coauthorProducers = coauthorProducers;
    }

    public List<Object> getPinnedForUsers() {
        return pinnedForUsers;
    }

    public void setPinnedForUsers(List<Object> pinnedForUsers) {
        this.pinnedForUsers = pinnedForUsers;
    }

    public Object getEncodingStatus() {
        return encodingStatus;
    }

    public void setEncodingStatus(Object encodingStatus) {
        this.encodingStatus = encodingStatus;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(Double videoDuration) {
        this.videoDuration = videoDuration;
    }

    public String getThumbnailSrc() {
        return thumbnailSrc;
    }

    public void setThumbnailSrc(String thumbnailSrc) {
        this.thumbnailSrc = thumbnailSrc;
    }

    public Object getClipsMusicAttributionInfo() {
        return clipsMusicAttributionInfo;
    }

    public void setClipsMusicAttributionInfo(Object clipsMusicAttributionInfo) {
        this.clipsMusicAttributionInfo = clipsMusicAttributionInfo;
    }

    public EdgeRelatedProfiles getEdgeRelatedProfiles() {
        return edgeRelatedProfiles;
    }

    public void setEdgeRelatedProfiles(EdgeRelatedProfiles edgeRelatedProfiles) {
        this.edgeRelatedProfiles = edgeRelatedProfiles;
    }

}
