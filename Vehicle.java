public abstract class Vehicle {
    // attributs  
    String brand;
    int kilometers;

    // constructors
    public Vehicle(String brand) {  
        this.brand = brand;  
        this.kilometers = 0;  
    }  

     // getters and setters
     public String getBrand() {  
        return this.brand;  
    }  
  
    public void setBrand(String brand) {  
        this.brand = brand;  
    }  
  
    public int getKilometers() {  
        return this.kilometers;  
    }  
  
    public void setAge(int kilometers) {
        this.kilometers = kilometers;
    }
    // abstract method
    public abstract String doStuff();

}
