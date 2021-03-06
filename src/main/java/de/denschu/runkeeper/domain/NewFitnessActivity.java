package de.denschu.runkeeper.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class NewFitnessActivity {
	private String type; // The type of activity, as one of the following values: "Running", "Cycling", "Mountain Biking", "Walking", "Hiking",
							// "Downhill Skiing", "Cross-Country Skiing", "Snowboarding", "Skating", "Swimming", "Wheelchair", "Rowing", "Elliptical",
							// "Other"
	private String start_time; // The starting time for the activity (e.g., "Sat, 1 Jan 2011 00:00:00")
	private Double total_distance; // The total distance traveled, in meters (optional)
	private Double duration; // The duration of the activity, in seconds
	private Integer average_heart_rate; // The user's average heart rate, in beats per minute (optional)
	private HeartRate[] heart_rate; // The sequence of time-stamped heart rate measurements (optional)
	private Double total_calories; // The total calories burned (optional)
	private String notes; // Any notes that the user has associated with the activity
	private WGS84[] path; // The sequence of geographical points along the route (optional)
	private Boolean post_to_facebook; // True to post this activity to Facebook, false to prevent posting (optional; if not specified, the user's
										// default preference is used)
	private Boolean post_to_twitter; // True to post this activity to Twitter, false to prevent posting (optional; if not specified, the user's
										// default preference is used)
	private Boolean detect_pauses; // True to automatically detect and insert pause points into the supplied path, false otherwise (optional; if not
									// specified, no pause detection is performed)

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public Double getTotal_distance() {
		return total_distance;
	}

	public void setTotal_distance(Double total_distance) {
		this.total_distance = total_distance;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public Integer getAverage_heart_rate() {
		return average_heart_rate;
	}

	public void setAverage_heart_rate(Integer average_heart_rate) {
		this.average_heart_rate = average_heart_rate;
	}

	public HeartRate[] getHeart_rate() {
		return heart_rate;
	}

	public void setHeart_rate(HeartRate[] heart_rate) {
		this.heart_rate = heart_rate;
	}

	public Double getTotal_calories() {
		return total_calories;
	}

	public void setTotal_calories(Double total_calories) {
		this.total_calories = total_calories;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public WGS84[] getPath() {
		return path;
	}

	public void setPath(WGS84[] path) {
		this.path = path;
	}

	public Boolean getPost_to_facebook() {
		return post_to_facebook;
	}

	public void setPost_to_facebook(Boolean post_to_facebook) {
		this.post_to_facebook = post_to_facebook;
	}

	public Boolean getPost_to_twitter() {
		return post_to_twitter;
	}

	public void setPost_to_twitter(Boolean post_to_twitter) {
		this.post_to_twitter = post_to_twitter;
	}

	public Boolean getDetect_pauses() {
		return detect_pauses;
	}

	public void setDetect_pauses(Boolean detect_pauses) {
		this.detect_pauses = detect_pauses;
	}

}
