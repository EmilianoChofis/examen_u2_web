package com.example.web_ordinario_u2.utils;

public class Response<T> {
    Integer status;
    String mensaje;
    T data;
    boolean error;

    public Response() {
    }

    public Response(Integer status, String mensaje, T data, boolean error) {
        this.status = status;
        this.mensaje = mensaje;
        this.data = data;
        this.error = error;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
