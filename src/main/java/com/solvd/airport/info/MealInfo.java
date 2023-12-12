package com.solvd.airport.info;

public enum MealInfo {

    NA("NOT AVAILABLE", "NOT_AVL"),
    VG("Vegetarian", "VG"),
    NVG("Non-Vegetarian", "NON-VEG"),
    CHM("Children Meal", "CHILD_MEAL"),
    BG("Baby Food", "BABY_MEAL");


    private final String mealName;
    private final String code;

    MealInfo(String mealName, String code) {
        this.mealName = mealName;
        this.code = code;
    }

    public String getMealName() {
        return mealName;
    }

    public String getCode() {
        return code;
    }

}
