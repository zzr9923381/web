package com.yjq.programmer.bean;



/**
 * 错误码统一处理类，所有的错误码统一定义在这里
 */
public class CodeMsg {

    private Integer code;//错误码

    private String msg;//错误信息

    /**
     * 构造函数私有化即单例模式
     * 该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
     * @param code
     * @param msg
     */
    private CodeMsg(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public CodeMsg() {

    }

    public Integer getCode() {
        return code;
    }



    public void setCode(Integer code) {
        this.code = code;
    }



    public String getMsg() {
        return msg;
    }



    public void setMsg(String msg) {
        this.msg = msg;
    }

    //通用错误码定义
    //处理成功消息码
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    //通用数据错误码
    public static CodeMsg DATA_ERROR = new CodeMsg(-1, "illegal data！");
    public static CodeMsg VALIDATE_ENTITY_ERROR = new CodeMsg(-2, "");
    public static CodeMsg CAPTCHA_EMPTY = new CodeMsg(-3, "verification code must be filled!");
    public static CodeMsg NO_PERMISSION = new CodeMsg(-4, "You do not have permission for the current operation！");
    public static CodeMsg CAPTCHA_ERROR = new CodeMsg(-5, "Verification code error！");
    public static CodeMsg USER_SESSION_EXPIRED = new CodeMsg(-6, "You have not logged in or your session has expired. Please log in again！");
    public static CodeMsg UPLOAD_PHOTO_SUFFIX_ERROR = new CodeMsg(-7, "Image format is incorrect！");
    public static CodeMsg PHOTO_SURPASS_MAX_SIZE = new CodeMsg(-8, "Uploaded images cannot exceed 1MB！");
    public static CodeMsg PHOTO_FORMAT_NOT_CORRECT = new CodeMsg(-9, "The uploaded image format is incorrect！");
    public static CodeMsg SAVE_FILE_EXCEPTION = new CodeMsg(-10, "Exception when saving file！");
    public static CodeMsg FILE_EXPORT_ERROR = new CodeMsg(-11, "文件导出失败！");
    public static CodeMsg SYSTEM_ERROR = new CodeMsg(-12, "系统出现了错误，请联系管理员！");
    public static CodeMsg NO_AUTHORITY = new CodeMsg(-13, "不好意思，您没有权限操作哦！");
    public static CodeMsg CAPTCHA_EXPIRED = new CodeMsg(-14, "验证码已过期，请刷新验证码！");
    public static CodeMsg COMMON_ERROR = new CodeMsg(-15, "");
    public static CodeMsg PHOTO_EMPTY = new CodeMsg(-16, "The uploaded image cannot be empty！");


    //用户管理类错误码
    public static CodeMsg USER_ADD_ERROR = new CodeMsg(-1000, "Failed to add user information, please contact the administrator！");
    public static CodeMsg USER_NOT_EXIST  = new CodeMsg(-1001, "该用户不存在！");
    public static CodeMsg USER_EDIT_ERROR = new CodeMsg(-1002, "User information editing failed, please contact the administrator！");
    public static CodeMsg USER_DELETE_ERROR = new CodeMsg(-1003, "User information deletion failed, please contact the administrator！");
    public static CodeMsg USERNAME_EXIST = new CodeMsg(-1004, "The user name is duplicated, please change it！");
    public static CodeMsg USERNAME_EMPTY = new CodeMsg(-1005, "Username cannot be empty！");
    public static CodeMsg PASSWORD_EMPTY = new CodeMsg(-1006, "User password cannot be empty！");
    public static CodeMsg USERNAME_PASSWORD_ERROR = new CodeMsg(-1007, "Wrong username or password！");
    public static CodeMsg REPASSWORD_EMPTY = new CodeMsg(-1008, "confirm password can not be blank！");
    public static CodeMsg REPASSWORD_ERROR = new CodeMsg(-1009, "Confirm that the password is inconsistent！");
    public static CodeMsg USER_REGISTER_ERROR = new CodeMsg(-1010, "User registration failed, please contact the administrator！");
    public static CodeMsg USER_NOT_IS_ADMIN = new CodeMsg(-1011, "只有管理员角色才能登录后台系统！");


    //科室管理类错误码
    public static CodeMsg OFFICE_NAME_EXIST = new CodeMsg(-2000, "The department name already exists, please change it！");
    public static CodeMsg OFFICE_ADD_ERROR = new CodeMsg(-2001, "Failed to add department information, please contact the administrator！");
    public static CodeMsg OFFICE_EDIT_ERROR = new CodeMsg(-2002, "Failed to modify department information, please contact the administrator！");
    public static CodeMsg OFFICE_DELETE_ERROR = new CodeMsg(-2003, "Failed to delete department information, please contact the administrator！");

    //医生管理错误码
    public static CodeMsg DOCTOR_NAME_EXIST = new CodeMsg(-3000, "The doctor name already exists, please change it！");
    public static CodeMsg DOCTOR_ADD_ERROR = new CodeMsg(-3001, "Failed to add doctor information, please contact the administrator！");
    public static CodeMsg DOCTOR_EDIT_ERROR = new CodeMsg(-3002, "Failed to edit doctor information, please contact the administrator！");
    public static CodeMsg DOCTOR_DELETE_ERROR = new CodeMsg(-3003, "Failed to delete doctor information, please contact the administrator！");

    //预约挂号管理错误码
    public static CodeMsg APPOINT_TIME_EMPTY = new CodeMsg(-4000, "The appointment registration time cannot be empty！");
    public static CodeMsg APPOINT_SAVE_ERROR = new CodeMsg(-4001, "Failed to save appointment registration information, please contact the administrator！");
    public static CodeMsg APPOINT_ALREADY_CANCEL = new CodeMsg(-4002, "The appointment registration has been cancelled, please do not repeat the operation！");
    public static CodeMsg APPOINT_DELETE_ERROR = new CodeMsg(-4003, "Deletion of appointment registration information failed, please contact the administrator！");
    public static CodeMsg APPOINT_ITEM_SAVE_ERROR = new CodeMsg(-4004, "Failed to save registration details, please contact the administrator！");

    //公告管理错误码
    public static CodeMsg ANNOUNCE_ADD_ERROR = new CodeMsg(-5000, "Failed to add announcement information, please contact the administrator！");
    public static CodeMsg ANNOUNCE_EDIT_ERROR = new CodeMsg(-5001, "Failed to edit announcement information, please contact the administrator！");
    public static CodeMsg ANNOUNCE_DELETE_ERROR = new CodeMsg(-5002, "Announcement information deletion failed, please contact the administrator！");

}
