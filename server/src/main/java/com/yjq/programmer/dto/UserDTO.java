package com.yjq.programmer.dto;

import com.yjq.programmer.annotation.ValidateEntity;


public class UserDTO {
    private String id;

    @ValidateEntity(required=true,requiredMaxLength=true,requiredMinLength=true,maxLength=8,minLength=1,errorRequiredMsg="Username cannot be empty！",errorMaxLengthMsg="Username length cannot be greater than 8！",errorMinLengthMsg="Username cannot be empty！")
    private String username;

    @ValidateEntity(required=true,requiredMaxLength=true,requiredMinLength=true,maxLength=16,minLength=6,errorRequiredMsg="User password cannot be empty！",errorMaxLengthMsg="User password length cannot be greater than 16！",errorMinLengthMsg="User password length cannot be less than 6！")
    private String password;

    private String rePassword;

    private String headPic;

    private String roleId;

    @ValidateEntity(required=true,requiredMaxLength=true,requiredMinLength=true,maxLength=11,minLength=11,errorRequiredMsg="User mobile phone number cannot be empty！",errorMaxLengthMsg="User mobile phone number must be 11 digits long！",errorMinLengthMsg="User mobile phone number must be 11 digits long！")
    private String phone;

    private Integer sex;

    @ValidateEntity(requiredMaxLength=true,maxLength=256,errorMaxLengthMsg="The length of personal profile cannot be greater than 256 characters！")
    private String info;

    @ValidateEntity(requiredMaxLength=true,maxLength=256,errorMaxLengthMsg="The length of address cannot be greater than 256 characters！")
    private String address;

    @ValidateEntity(requiredMaxLength=true,maxLength=256,errorMaxLengthMsg="The length of email cannot be greater than 256 characters！")
    private String email;

    @ValidateEntity(requiredMaxLength=true,maxLength=256,errorMaxLengthMsg="The length of birthday cannot be greater than 256 characters！")
    private String birthday;

    private String token;

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

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getBirthday() {return birthday;}

    public void setBirthday(String birthday) {this.birthday = birthday;}

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

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
        sb.append(", rePassword=").append(rePassword);
        sb.append(", token=").append(token);
        sb.append("]");
        return sb.toString();
    }
}
