package com.omprakash.fooddelivery;

public class DeliveryItem {

    public String userNameTxt;
    public String userCityTxt;
    public String userProfileImgUrl;
    public String foodImageUrl;
    public String deliveryDate;
    public String timeTxt;
    public String ratingTxt;

    public DeliveryItem() {

    }

    public DeliveryItem(String foodImageUrl, String userNameTxt, String userCityTxt, String deliveryDate, String timeTxt, String ratingTxt) {
        this.foodImageUrl = foodImageUrl;
        this.userNameTxt = userNameTxt;
        this.userCityTxt = userCityTxt;
        this.deliveryDate = deliveryDate;
        this.timeTxt = timeTxt;
        this.ratingTxt = ratingTxt;
    }
}
