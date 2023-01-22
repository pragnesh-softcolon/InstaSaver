
package com.example.instasaver.Models.Profile;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("biography")
    @Expose
    private String biography;
    @SerializedName("bio_links")
    @Expose
    private List<Object> bioLinks = null;
    @SerializedName("biography_with_entities")
    @Expose
    private BiographyWithEntities biographyWithEntities;
    @SerializedName("blocked_by_viewer")
    @Expose
    private Boolean blockedByViewer;
    @SerializedName("restricted_by_viewer")
    @Expose
    private Boolean restrictedByViewer;
    @SerializedName("country_block")
    @Expose
    private Boolean countryBlock;
    @SerializedName("external_url")
    @Expose
    private Object externalUrl;
    @SerializedName("external_url_linkshimmed")
    @Expose
    private Object externalUrlLinkshimmed;
    @SerializedName("edge_followed_by")
    @Expose
    private EdgeFollowedBy edgeFollowedBy;
    @SerializedName("fbid")
    @Expose
    private String fbid;
    @SerializedName("followed_by_viewer")
    @Expose
    private Boolean followedByViewer;
    @SerializedName("edge_follow")
    @Expose
    private EdgeFollow edgeFollow;
    @SerializedName("follows_viewer")
    @Expose
    private Boolean followsViewer;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("group_metadata")
    @Expose
    private Object groupMetadata;
    @SerializedName("has_ar_effects")
    @Expose
    private Boolean hasArEffects;
    @SerializedName("has_clips")
    @Expose
    private Boolean hasClips;
    @SerializedName("has_guides")
    @Expose
    private Boolean hasGuides;
    @SerializedName("has_channel")
    @Expose
    private Boolean hasChannel;
    @SerializedName("has_blocked_viewer")
    @Expose
    private Boolean hasBlockedViewer;
    @SerializedName("highlight_reel_count")
    @Expose
    private Integer highlightReelCount;
    @SerializedName("has_requested_viewer")
    @Expose
    private Boolean hasRequestedViewer;
    @SerializedName("hide_like_and_view_counts")
    @Expose
    private Boolean hideLikeAndViewCounts;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_business_account")
    @Expose
    private Boolean isBusinessAccount;
    @SerializedName("is_eligible_to_view_account_transparency")
    @Expose
    private Boolean isEligibleToViewAccountTransparency;
    @SerializedName("is_professional_account")
    @Expose
    private Boolean isProfessionalAccount;
    @SerializedName("is_supervision_enabled")
    @Expose
    private Boolean isSupervisionEnabled;
    @SerializedName("is_guardian_of_viewer")
    @Expose
    private Boolean isGuardianOfViewer;
    @SerializedName("is_supervised_by_viewer")
    @Expose
    private Boolean isSupervisedByViewer;
    @SerializedName("is_supervised_user")
    @Expose
    private Boolean isSupervisedUser;
    @SerializedName("is_embeds_disabled")
    @Expose
    private Boolean isEmbedsDisabled;
    @SerializedName("is_joined_recently")
    @Expose
    private Boolean isJoinedRecently;
    @SerializedName("guardian_id")
    @Expose
    private Object guardianId;
    @SerializedName("business_address_json")
    @Expose
    private Object businessAddressJson;
    @SerializedName("business_contact_method")
    @Expose
    private String businessContactMethod;
    @SerializedName("business_email")
    @Expose
    private Object businessEmail;
    @SerializedName("business_phone_number")
    @Expose
    private Object businessPhoneNumber;
    @SerializedName("business_category_name")
    @Expose
    private Object businessCategoryName;
    @SerializedName("overall_category_name")
    @Expose
    private Object overallCategoryName;
    @SerializedName("category_enum")
    @Expose
    private Object categoryEnum;
    @SerializedName("category_name")
    @Expose
    private Object categoryName;
    @SerializedName("is_private")
    @Expose
    private Boolean isPrivate;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("edge_mutual_followed_by")
    @Expose
    private EdgeMutualFollowedBy edgeMutualFollowedBy;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("profile_pic_url_hd")
    @Expose
    private String profilePicUrlHd;
    @SerializedName("requested_by_viewer")
    @Expose
    private Boolean requestedByViewer;
    @SerializedName("should_show_category")
    @Expose
    private Boolean shouldShowCategory;
    @SerializedName("should_show_public_contacts")
    @Expose
    private Boolean shouldShowPublicContacts;
    @SerializedName("transparency_label")
    @Expose
    private Object transparencyLabel;
    @SerializedName("transparency_product")
    @Expose
    private String transparencyProduct;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("connected_fb_page")
    @Expose
    private Object connectedFbPage;
    @SerializedName("pronouns")
    @Expose
    private List<Object> pronouns = null;
    @SerializedName("edge_felix_video_timeline")
    @Expose
    private EdgeFelixVideoTimeline edgeFelixVideoTimeline;
    @SerializedName("edge_owner_to_timeline_media")
    @Expose
    private EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia;
    @SerializedName("edge_saved_media")
    @Expose
    private EdgeSavedMedia edgeSavedMedia;
    @SerializedName("edge_media_collections")
    @Expose
    private EdgeMediaCollections edgeMediaCollections;

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<Object> getBioLinks() {
        return bioLinks;
    }

    public void setBioLinks(List<Object> bioLinks) {
        this.bioLinks = bioLinks;
    }

    public BiographyWithEntities getBiographyWithEntities() {
        return biographyWithEntities;
    }

    public void setBiographyWithEntities(BiographyWithEntities biographyWithEntities) {
        this.biographyWithEntities = biographyWithEntities;
    }

    public Boolean getBlockedByViewer() {
        return blockedByViewer;
    }

    public void setBlockedByViewer(Boolean blockedByViewer) {
        this.blockedByViewer = blockedByViewer;
    }

    public Boolean getRestrictedByViewer() {
        return restrictedByViewer;
    }

    public void setRestrictedByViewer(Boolean restrictedByViewer) {
        this.restrictedByViewer = restrictedByViewer;
    }

    public Boolean getCountryBlock() {
        return countryBlock;
    }

    public void setCountryBlock(Boolean countryBlock) {
        this.countryBlock = countryBlock;
    }

    public Object getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(Object externalUrl) {
        this.externalUrl = externalUrl;
    }

    public Object getExternalUrlLinkshimmed() {
        return externalUrlLinkshimmed;
    }

    public void setExternalUrlLinkshimmed(Object externalUrlLinkshimmed) {
        this.externalUrlLinkshimmed = externalUrlLinkshimmed;
    }

    public EdgeFollowedBy getEdgeFollowedBy() {
        return edgeFollowedBy;
    }

    public void setEdgeFollowedBy(EdgeFollowedBy edgeFollowedBy) {
        this.edgeFollowedBy = edgeFollowedBy;
    }

    public String getFbid() {
        return fbid;
    }

    public void setFbid(String fbid) {
        this.fbid = fbid;
    }

    public Boolean getFollowedByViewer() {
        return followedByViewer;
    }

    public void setFollowedByViewer(Boolean followedByViewer) {
        this.followedByViewer = followedByViewer;
    }

    public EdgeFollow getEdgeFollow() {
        return edgeFollow;
    }

    public void setEdgeFollow(EdgeFollow edgeFollow) {
        this.edgeFollow = edgeFollow;
    }

    public Boolean getFollowsViewer() {
        return followsViewer;
    }

    public void setFollowsViewer(Boolean followsViewer) {
        this.followsViewer = followsViewer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Object getGroupMetadata() {
        return groupMetadata;
    }

    public void setGroupMetadata(Object groupMetadata) {
        this.groupMetadata = groupMetadata;
    }

    public Boolean getHasArEffects() {
        return hasArEffects;
    }

    public void setHasArEffects(Boolean hasArEffects) {
        this.hasArEffects = hasArEffects;
    }

    public Boolean getHasClips() {
        return hasClips;
    }

    public void setHasClips(Boolean hasClips) {
        this.hasClips = hasClips;
    }

    public Boolean getHasGuides() {
        return hasGuides;
    }

    public void setHasGuides(Boolean hasGuides) {
        this.hasGuides = hasGuides;
    }

    public Boolean getHasChannel() {
        return hasChannel;
    }

    public void setHasChannel(Boolean hasChannel) {
        this.hasChannel = hasChannel;
    }

    public Boolean getHasBlockedViewer() {
        return hasBlockedViewer;
    }

    public void setHasBlockedViewer(Boolean hasBlockedViewer) {
        this.hasBlockedViewer = hasBlockedViewer;
    }

    public Integer getHighlightReelCount() {
        return highlightReelCount;
    }

    public void setHighlightReelCount(Integer highlightReelCount) {
        this.highlightReelCount = highlightReelCount;
    }

    public Boolean getHasRequestedViewer() {
        return hasRequestedViewer;
    }

    public void setHasRequestedViewer(Boolean hasRequestedViewer) {
        this.hasRequestedViewer = hasRequestedViewer;
    }

    public Boolean getHideLikeAndViewCounts() {
        return hideLikeAndViewCounts;
    }

    public void setHideLikeAndViewCounts(Boolean hideLikeAndViewCounts) {
        this.hideLikeAndViewCounts = hideLikeAndViewCounts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsBusinessAccount() {
        return isBusinessAccount;
    }

    public void setIsBusinessAccount(Boolean isBusinessAccount) {
        this.isBusinessAccount = isBusinessAccount;
    }

    public Boolean getIsEligibleToViewAccountTransparency() {
        return isEligibleToViewAccountTransparency;
    }

    public void setIsEligibleToViewAccountTransparency(Boolean isEligibleToViewAccountTransparency) {
        this.isEligibleToViewAccountTransparency = isEligibleToViewAccountTransparency;
    }

    public Boolean getIsProfessionalAccount() {
        return isProfessionalAccount;
    }

    public void setIsProfessionalAccount(Boolean isProfessionalAccount) {
        this.isProfessionalAccount = isProfessionalAccount;
    }

    public Boolean getIsSupervisionEnabled() {
        return isSupervisionEnabled;
    }

    public void setIsSupervisionEnabled(Boolean isSupervisionEnabled) {
        this.isSupervisionEnabled = isSupervisionEnabled;
    }

    public Boolean getIsGuardianOfViewer() {
        return isGuardianOfViewer;
    }

    public void setIsGuardianOfViewer(Boolean isGuardianOfViewer) {
        this.isGuardianOfViewer = isGuardianOfViewer;
    }

    public Boolean getIsSupervisedByViewer() {
        return isSupervisedByViewer;
    }

    public void setIsSupervisedByViewer(Boolean isSupervisedByViewer) {
        this.isSupervisedByViewer = isSupervisedByViewer;
    }

    public Boolean getIsSupervisedUser() {
        return isSupervisedUser;
    }

    public void setIsSupervisedUser(Boolean isSupervisedUser) {
        this.isSupervisedUser = isSupervisedUser;
    }

    public Boolean getIsEmbedsDisabled() {
        return isEmbedsDisabled;
    }

    public void setIsEmbedsDisabled(Boolean isEmbedsDisabled) {
        this.isEmbedsDisabled = isEmbedsDisabled;
    }

    public Boolean getIsJoinedRecently() {
        return isJoinedRecently;
    }

    public void setIsJoinedRecently(Boolean isJoinedRecently) {
        this.isJoinedRecently = isJoinedRecently;
    }

    public Object getGuardianId() {
        return guardianId;
    }

    public void setGuardianId(Object guardianId) {
        this.guardianId = guardianId;
    }

    public Object getBusinessAddressJson() {
        return businessAddressJson;
    }

    public void setBusinessAddressJson(Object businessAddressJson) {
        this.businessAddressJson = businessAddressJson;
    }

    public String getBusinessContactMethod() {
        return businessContactMethod;
    }

    public void setBusinessContactMethod(String businessContactMethod) {
        this.businessContactMethod = businessContactMethod;
    }

    public Object getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(Object businessEmail) {
        this.businessEmail = businessEmail;
    }

    public Object getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    public void setBusinessPhoneNumber(Object businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    public Object getBusinessCategoryName() {
        return businessCategoryName;
    }

    public void setBusinessCategoryName(Object businessCategoryName) {
        this.businessCategoryName = businessCategoryName;
    }

    public Object getOverallCategoryName() {
        return overallCategoryName;
    }

    public void setOverallCategoryName(Object overallCategoryName) {
        this.overallCategoryName = overallCategoryName;
    }

    public Object getCategoryEnum() {
        return categoryEnum;
    }

    public void setCategoryEnum(Object categoryEnum) {
        this.categoryEnum = categoryEnum;
    }

    public Object getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Object categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public EdgeMutualFollowedBy getEdgeMutualFollowedBy() {
        return edgeMutualFollowedBy;
    }

    public void setEdgeMutualFollowedBy(EdgeMutualFollowedBy edgeMutualFollowedBy) {
        this.edgeMutualFollowedBy = edgeMutualFollowedBy;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getProfilePicUrlHd() {
        return profilePicUrlHd;
    }

    public void setProfilePicUrlHd(String profilePicUrlHd) {
        this.profilePicUrlHd = profilePicUrlHd;
    }

    public Boolean getRequestedByViewer() {
        return requestedByViewer;
    }

    public void setRequestedByViewer(Boolean requestedByViewer) {
        this.requestedByViewer = requestedByViewer;
    }

    public Boolean getShouldShowCategory() {
        return shouldShowCategory;
    }

    public void setShouldShowCategory(Boolean shouldShowCategory) {
        this.shouldShowCategory = shouldShowCategory;
    }

    public Boolean getShouldShowPublicContacts() {
        return shouldShowPublicContacts;
    }

    public void setShouldShowPublicContacts(Boolean shouldShowPublicContacts) {
        this.shouldShowPublicContacts = shouldShowPublicContacts;
    }

    public Object getTransparencyLabel() {
        return transparencyLabel;
    }

    public void setTransparencyLabel(Object transparencyLabel) {
        this.transparencyLabel = transparencyLabel;
    }

    public String getTransparencyProduct() {
        return transparencyProduct;
    }

    public void setTransparencyProduct(String transparencyProduct) {
        this.transparencyProduct = transparencyProduct;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getConnectedFbPage() {
        return connectedFbPage;
    }

    public void setConnectedFbPage(Object connectedFbPage) {
        this.connectedFbPage = connectedFbPage;
    }

    public List<Object> getPronouns() {
        return pronouns;
    }

    public void setPronouns(List<Object> pronouns) {
        this.pronouns = pronouns;
    }

    public EdgeFelixVideoTimeline getEdgeFelixVideoTimeline() {
        return edgeFelixVideoTimeline;
    }

    public void setEdgeFelixVideoTimeline(EdgeFelixVideoTimeline edgeFelixVideoTimeline) {
        this.edgeFelixVideoTimeline = edgeFelixVideoTimeline;
    }

    public EdgeOwnerToTimelineMedia getEdgeOwnerToTimelineMedia() {
        return edgeOwnerToTimelineMedia;
    }

    public void setEdgeOwnerToTimelineMedia(EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia) {
        this.edgeOwnerToTimelineMedia = edgeOwnerToTimelineMedia;
    }

    public EdgeSavedMedia getEdgeSavedMedia() {
        return edgeSavedMedia;
    }

    public void setEdgeSavedMedia(EdgeSavedMedia edgeSavedMedia) {
        this.edgeSavedMedia = edgeSavedMedia;
    }

    public EdgeMediaCollections getEdgeMediaCollections() {
        return edgeMediaCollections;
    }

    public void setEdgeMediaCollections(EdgeMediaCollections edgeMediaCollections) {
        this.edgeMediaCollections = edgeMediaCollections;
    }

}
