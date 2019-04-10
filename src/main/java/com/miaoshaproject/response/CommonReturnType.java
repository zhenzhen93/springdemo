package com.miaoshaproject.response;

public class CommonReturnType {

    //表明对应请求的返回处理结果 success fail
    private String status;

    //success则返回前端需要的json串，
    private Object data;

    public static CommonReturnType create(Object object) {
        return CommonReturnType.create("success", object);
    }

    public static CommonReturnType create(String status, Object result) {
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}


