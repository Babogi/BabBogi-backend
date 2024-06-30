package BobBogi.BobBogispring.domain;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "consumption")  // 테이블 이름이 대문자 "Consumption"인지 확인
public class Consumption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "food_count")
    private Long foodCount;

    @Column(name = "kcal")
    private Double kcal;

    @Column(name = "carbohydrate")
    private Double carbohydrate;

    @Column(name = "sugar")
    private Double sugar;

    @Column(name = "protein")
    private Double protein;

    @Column(name = "fat")
    private Double fat;

    @Column(name = "transfat")
    private Double transfat;

    @Column(name = "saturatedfat")
    private Double saturatedfat;

    @Column(name = "cholesterol")
    private Double cholesterol;

    @Column(name = "natrium")
    private Double natrium;

    @Column(name = "remaining_kcal")
    private Double remainingkcal;
    @Column(name = "remaining_carbohydrate")
    private Double remainingCarbohydrate;

    @Column(name = "remaining_sugar")
    private Double remainingSugar;

    @Column(name = "remaining_protein")
    private Double remainingProtein;

    @Column(name = "remaining_fat")
    private Double remainingFat;

    @Column(name = "remaining_transfat")
    private Double remainingTransfat;

    @Column(name = "remaining_saturatedfat")
    private Double remainingSaturatedfat;

    @Column(name = "remaining_cholesterol")
    private Double remainingCholesterol;

    @Column(name = "remaining_natrium")
    private Double remainingNatrium;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    public Consumption(){

    }

    @PrePersist
    protected void onCreate() {
        if (foodCount == null) {
            foodCount = 1L;
        }
        date = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Long getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(Long foodCount) {
        this.foodCount = foodCount;
    }

    public Double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public Double getSugar() {
        return sugar;
    }

    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getTransfat() {
        return transfat;
    }

    public void setTransfat(Double transfat) {
        this.transfat = transfat;
    }

    public Double getSaturatedfat() {
        return saturatedfat;
    }

    public void setSaturatedfat(Double saturatedfat) {
        this.saturatedfat = saturatedfat;
    }

    public Double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(Double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public Double getNatrium() {
        return natrium;
    }

    public void setNatrium(Double natrium) {
        this.natrium = natrium;
    }

    public Double getRemainingCarbohydrate() {
        return remainingCarbohydrate;
    }

    public void setRemainingCarbohydrate(Double remainingCarbohydrate) {
        this.remainingCarbohydrate = remainingCarbohydrate;
    }

    public Double getRemainingSugar() {
        return remainingSugar;
    }

    public void setRemainingSugar(Double remainingSugar) {
        this.remainingSugar = remainingSugar;
    }

    public Double getRemainingProtein() {
        return remainingProtein;
    }

    public void setRemainingProtein(Double remainingProtein) {
        this.remainingProtein = remainingProtein;
    }

    public Double getRemainingFat() {
        return remainingFat;
    }

    public void setRemainingFat(Double remainingFat) {
        this.remainingFat = remainingFat;
    }

    public Double getRemainingTransfat() {
        return remainingTransfat;
    }

    public void setRemainingTransfat(Double remainingTransfat) {
        this.remainingTransfat = remainingTransfat;
    }

    public Double getRemainingSaturatedfat() {
        return remainingSaturatedfat;
    }

    public void setRemainingSaturatedfat(Double remainingSaturatedfat) {
        this.remainingSaturatedfat = remainingSaturatedfat;
    }

    public Double getRemainingCholesterol() {
        return remainingCholesterol;
    }

    public void setRemainingCholesterol(Double remainingCholesterol) {
        this.remainingCholesterol = remainingCholesterol;
    }

    public Double getRemainingNatrium() {
        return remainingNatrium;
    }

    public void setRemainingNatrium(Double remainingNatrium) {
        this.remainingNatrium = remainingNatrium;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getKcal() {
        return kcal;
    }

    public void setKcal(Double kcal) {
        this.kcal = kcal;
    }

    public Double getRemainingkcal() {
        return remainingkcal;
    }

    public void setRemainingkcal(Double remainingkcal) {
        this.remainingkcal = remainingkcal;
    }
}