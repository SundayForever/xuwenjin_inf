package cn.com.alo7.inf.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import cn.com.alo7.inf.entity.base.BaseEntity;

@Entity
@Table(name = "sys_video")
public class Video extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1944257133801444332L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String title;
	private String videoUrl;
	private String voiceTrackUrl;
	private String backgroundTrackUrl;
	private String subtitleUrl;
	private String coverUrl;
	private String difficulty;
	private String speed;
	private String description;
	private String source;
	private String isPassed;
	private String status;
	private String isDisplay;
	private Long position;
	
	@OneToMany(mappedBy="video")
	private List<ColumnVideoRef> columnVideoRef;
	
	@OneToMany(mappedBy="video")
	private List<Work> work;
	
	@Transient
	private Work workFilter;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getVoiceTrackUrl() {
		return voiceTrackUrl;
	}
	public void setVoiceTrackUrl(String voiceTrackUrl) {
		this.voiceTrackUrl = voiceTrackUrl;
	}
	public String getBackgroundTrackUrl() {
		return backgroundTrackUrl;
	}
	public void setBackgroundTrackUrl(String backgroundTrackUrl) {
		this.backgroundTrackUrl = backgroundTrackUrl;
	}
	public String getSubtitleUrl() {
		return subtitleUrl;
	}
	public void setSubtitleUrl(String subtitleUrl) {
		this.subtitleUrl = subtitleUrl;
	}
	public String getCoverUrl() {
		return coverUrl;
	}
	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getIsPassed() {
		return isPassed;
	}
	public void setIsPassed(String isPassed) {
		this.isPassed = isPassed;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIsDisplay() {
		return isDisplay;
	}
	public void setIsDisplay(String isDisplay) {
		this.isDisplay = isDisplay;
	}
	public long getPosition() {
		return position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}
	public List<ColumnVideoRef> getColumnVideoRef() {
		return columnVideoRef;
	}
	public void setColumnVideoRef(List<ColumnVideoRef> columnVideoRef) {
		this.columnVideoRef = columnVideoRef;
	}
	public List<Work> getWork() {
		return work;
	}
	public void setWork(List<Work> work) {
		this.work = work;
	}
	public Work getWorkFilter() {
		return workFilter;
	}
	public void setWorkFilter(Work workFilter) {
		this.workFilter = workFilter;
	}
	
}
