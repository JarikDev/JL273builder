package com;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar=new SportCar.Builder("Audi").setColor("green").setMaxSpeed(300).build();
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());
        System.out.println(sportCar.getName());

    }
}

class SportCar {
  private   String name;
    private  String color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private SportCar(Builder builder) {
        this.color=builder.color="black";
        this.maxSpeed=builder.maxSpeed=200;
        this.name=builder.name;

    }
    static class    Builder{ private   String name;
        private  String color;
        private int maxSpeed;

        public Builder  (String name) {
            this.name = name;

        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build(){
            return new SportCar(this);
        }
    }


}