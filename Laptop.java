// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
public class Laptop {
    private String brand = null;
    private String model = null;
    private String cpu = null;

    private Float screenSize = null;
    private Float weight = null;
    private Float cpuFrequency = null;

    private Integer ram = null;
    private Integer ssd = null;
    private Integer price = null;

    public Laptop(String brand, String model, String cpu, Float cpuFrequency, Float screenSize, Float weight,
            Integer ram, Integer ssd, Integer price) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.screenSize = screenSize;
        this.weight = weight;
        this.ram = ram;
        this.ssd = ssd;
        this.cpuFrequency = cpuFrequency;
        this.price = price;
    }

    public Laptop() {

    }

    public boolean checkBrand(String brand) {
        if (this.brand.equals(brand))
            return true;
        return false;
    }

    public boolean checkCpuFrequency(Float cpuFrequency) {
        if (this.cpuFrequency >= cpuFrequency)
            return true;
        return false;
    }

    public boolean checkRam(Integer ram) {
        if (this.ram >= ram)
            return true;
        return false;
    }

    public boolean checkScreenSize(Float screenSize) {
        if (this.screenSize >= screenSize)
            return true;
        return false;
    }

    public boolean checkSsd(Integer ssd) {
        if (this.ssd >= ssd)
            return true;
        return false;
    }

    public boolean checkWeight(Float weight) {
        if (this.weight <= weight)
            return true;
        return false;
    }

    public boolean checkPrice(Integer price) {
        if (this.price <= price)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return brand + " " + model + "\nРазмер экрана: " + screenSize + "\"\nПроцессор - " + cpu + ", частота: "
                + cpuFrequency + " ГГц\nОЗУ: "
                + ram + ", SSD: " + ssd + " Гб\nВес: " + weight + " кг\nЦена: " + price + " р.";
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public void setCpuFrequency(Float cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public void setScreenSize(Float screenSize) {
        this.screenSize = screenSize;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getCpuFrequency() {
        return cpuFrequency;
    }

    public String getBrand() {
        return brand;
    }

    public String getCpu() {
        return cpu;
    }

    public String getModel() {
        return model;
    }

    public Integer getRam() {
        return ram;
    }

    public Float getScreenSize() {
        return screenSize;
    }

    public Integer getSsd() {
        return ssd;
    }
    public Integer getPrice() {
        return price;
    }

    public Float getWeight() {
        return weight;
    }
}
