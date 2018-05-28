package pe.com.pucp.dti.clase2.Model;

/**
 * Created by DIA on 28/05/18.
 */

public class User {
    private String userId;
    private String userName;
    private String phoneNumber;
    private String imageUrl;

    public User( String userId, String userName, String phoneNumber, String imageUrl){
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
