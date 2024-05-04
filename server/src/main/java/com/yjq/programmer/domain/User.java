package com.yjq.programmer.domain;

public class User {
    private String id;

    private String username;

    private String password;

    private String headPic;

    private String roleId;

    private String phone;

    private Integer sex;

    private String info;

    private String address;

    private String email;

    private String birthday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getBirthday() {return birthday;}

    public void setBirthday(String birthday) {this.birthday = birthday;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", headPic=").append(headPic);
        sb.append(", roleId=").append(roleId);
        sb.append(", phone=").append(phone);
        sb.append(", sex=").append(sex);
        sb.append(", info=").append(info);
        sb.append(", address=").append(address);
        sb.append(", email=").append(email);
        sb.append(", birthday=").append(birthday);
        sb.append("]");
        return sb.toString();
    }
}