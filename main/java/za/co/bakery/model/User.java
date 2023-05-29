package za.co.bakery.model;

import java.util.Objects;

public class User {

    private String fName;
    private String lname;
    private String email;
    private String title;
    private String phoneNo;
    private String password;
    private String roleId;
    private boolean active;

    public User() {
    }

    public User(String email, String fName, String lname, String title, String password, String phoneNo, String roleId, boolean active) {
        this.fName = fName;
        this.lname = lname;
        this.email = email;
        this.title = title;
        this.password = password;
        this.phoneNo = phoneNo;
        this.roleId = roleId;
        this.active = active;
    }

    public User(String email, String password) {
        this(email, "", "", "", password, "", "", false);
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.phoneNo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{fName=").append(fName);
        sb.append(", lname=").append(lname);
        sb.append(", email=").append(email);
        sb.append(", title=").append(title);
        sb.append(", phoneNo=").append(phoneNo);
        sb.append(", password=").append(password);
        sb.append(", roleId=").append(roleId);
        sb.append(", active=").append(active);
        sb.append('}');
        return sb.toString();
    }

  
  

}
