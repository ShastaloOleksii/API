package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Userrr {
    //    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonProperty
    private HashMap<String, ?> _meta;
    @JsonProperty
    private String success;
    @JsonProperty
    private Integer code;
    @JsonProperty
    private String message;
    @JsonProperty
    private HashMap<String, Integer> rateLimit;
    private String id;
    //  @JsonProperty("first_name")
    private String first_name;
    //  @JsonProperty("last_name")
    private String last_name;
    private String gender;
    private String dob;
    private String email;
    private String phone;
    private String website;
    private String address;
    private String status;
    // @JsonProperty("_links")
    private ArrayList<String> _links;

    public HashMap<String, ?> get_meta() {
        return _meta;
    }

    public void set_meta(HashMap<String, ?> _meta) {
        this._meta = _meta;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<String, Integer> getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(HashMap<String, Integer> rateLimit) {
        this.rateLimit = rateLimit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<String> get_links() {
        return _links;
    }

    public void set_links(ArrayList<String> _links) {
        this._links = _links;
    }

    public Userrr() {
    }

    public Userrr(HashMap<String, ?> _meta, String success, Integer code, String message, HashMap<String, Integer> rateLimit, String id, String first_name, String last_name, String gender, String dob, String email, String phone, String website, String address, String status, ArrayList<String> _links) {
        this._meta = _meta;
        this.success = success;
        this.code = code;
        this.message = message;
        this.rateLimit = rateLimit;
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.address = address;
        this.status = status;
        this._links = _links;
    }

    @Override
    public String toString() {
        return "User{" +
                "_meta=" + _meta +
                ", success='" + success + '\'' +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", rateLimit=" + rateLimit +
                ", id='" + id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", _links=" + _links +
                '}';
    }
}
