package day02.sharpie;

public class Sharpie {

  String color;
  float width;
  public float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use() {
    this.inkAmount--;
  }

}
