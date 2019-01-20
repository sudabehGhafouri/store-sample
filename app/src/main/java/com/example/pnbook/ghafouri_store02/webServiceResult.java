package com.example.pnbook.ghafouri_store02;

import java.util.ArrayList;

public class webServiceResult {

    int statuse=0;
    int code=0;
    String msg="";
    int page=0;
    ArrayList<dataModel> data=new ArrayList<>();

    public webServiceResult() {
    }

    public int getStatuse() { return statuse; }

    public void setStatuse(int statuse) { this.statuse = statuse; }

    public int getCode() { return code; }

    public void setCode(int code) { this.code = code; }

    public String getMsg() { return msg; }

    public void setMsg(String msg) { this.msg = msg; }

    public int getPage() { return page; }

    public void setPage(int page) { this.page = page; }

    public ArrayList<dataModel> getData() { return data; }

    public void setData(ArrayList<dataModel> data) { this.data = data;}
}
