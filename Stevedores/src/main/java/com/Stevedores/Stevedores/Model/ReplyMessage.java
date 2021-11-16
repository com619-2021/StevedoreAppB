package com.Stevedores.Stevedores.Model;



import java.util.ArrayList;
//TODO add JPA annotations

public class ReplyMessage {


    private
    ArrayList<PortServiceOrder> orderList;
    private int code;
    private String debugMessage;
    private
    ArrayList<Resource> resourceList;
    /*TODO
    @OneToMany
    ArrayList<OrderChangeRequest> oderChangeRequestList;
    */
    private Long limit;
    private Long offset;
    private Long totalRecords;










    public ArrayList<PortServiceOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<PortServiceOrder> orderList) {
        this.orderList = orderList;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    public ArrayList<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(ArrayList<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }
}
