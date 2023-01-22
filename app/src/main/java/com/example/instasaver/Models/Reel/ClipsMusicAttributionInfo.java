
package com.example.instasaver.Models.Reel;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClipsMusicAttributionInfo {

    @SerializedName("artist_name")
    @Expose
    private String artistName;
    @SerializedName("song_name")
    @Expose
    private String songName;
    @SerializedName("uses_original_audio")
    @Expose
    private Boolean usesOriginalAudio;
    @SerializedName("should_mute_audio")
    @Expose
    private Boolean shouldMuteAudio;
    @SerializedName("should_mute_audio_reason")
    @Expose
    private String shouldMuteAudioReason;
    @SerializedName("audio_id")
    @Expose
    private String audioId;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Boolean getUsesOriginalAudio() {
        return usesOriginalAudio;
    }

    public void setUsesOriginalAudio(Boolean usesOriginalAudio) {
        this.usesOriginalAudio = usesOriginalAudio;
    }

    public Boolean getShouldMuteAudio() {
        return shouldMuteAudio;
    }

    public void setShouldMuteAudio(Boolean shouldMuteAudio) {
        this.shouldMuteAudio = shouldMuteAudio;
    }

    public String getShouldMuteAudioReason() {
        return shouldMuteAudioReason;
    }

    public void setShouldMuteAudioReason(String shouldMuteAudioReason) {
        this.shouldMuteAudioReason = shouldMuteAudioReason;
    }

    public String getAudioId() {
        return audioId;
    }

    public void setAudioId(String audioId) {
        this.audioId = audioId;
    }

}
